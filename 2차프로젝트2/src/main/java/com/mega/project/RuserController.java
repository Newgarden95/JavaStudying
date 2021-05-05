package com.mega.project;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import javax.websocket.Session;

import org.mybatis.spring.batch.MyBatisBatchItemWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import sun.security.util.Length;


//1. 앞페이지에서 넘어온 id/pw를 받아주어야 함. => Control부분!

//클라이언트의 요청에 대한 데이터를 받아 전달하기 쉽게 데이터를 가공하는 역할
@Controller //어노테이션, 표시 
public class RuserController {
	// 1) 스프링 프레임워크에 해당 클래스를 Controller역할을 하도록 등록
	// 2) 싱글톤 객체로 생성

	//싱글톤으로 만들어진 객체의 주소를 넣어주세요.(주입, Injection)
	//@Autowired 없을경우, NullPointerException 주소를 못넣어서 실행이 불가함
	@Autowired 
	RuserDAO dao; 

	@Autowired 
	ProductDAO dao2; 
	
	//Spring은 객체 생성이(new) 필요없음, 자동으로 만들어줌
	
	@RequestMapping("ruser_login")
	public void insert(RuserVO bag) throws Exception {
		//public void name(String id, String pw, String name, String tel)
		//컨트롤러에 있는 메서드에 변수를 선언하면,
		//스프링이 객체를 생성해준다.
		//MemberDAO dao = new Memeber();	
		dao.insert(bag);
	}
	//get은 Select기능에 사용, 캐시가 남음, 보안측면이 떨어지나
	//전송속도가 우수하고 파라미터가 url에 노출됨
	
	//post 방식의 경우 패킷안에 숨겨져서 전송됨
	//CUD에 사용되며, 캐시가 남지않아 보안적인 면에서 우수
	//Request body에 데이터가 들어가기 때문에 
	//파라미터가 노출되지 않음.
	

	@RequestMapping(value="idcheck", method = RequestMethod.POST) //http 전달 방식은 post, 전달되는 값은 idcheck
	@ResponseBody 	//객체를 HTTP요청의 body 내용으로 매핑하는 역할
	public String idcheck(String id) throws Exception {
		//JOptionPane.showMessageDialog(null, userid);
		//jsp에서의 ajax의 요청을 idcheck메서드가 수신받는지 확인하기 위해 logger.info()추가
//		Logger.info("연결성공 " + id);
		
		//int타입으로 캐스팅하여 id가 존재하면 1, 존재하지 않으면 0
		int result = dao.idCheck(id);
//		Logger.info("결과값 = " + result);
		
		if (result != 0) { //0 = 아이디 중복 yes, 1 = 아이디 중복 no
			return "fail"; //중복아이디 존재	
		} else {
			return "success"; //중복아이디 없음
		}
		
	}

	@RequestMapping("main")
	public String login(RuserVO bag, HttpSession session, Model model) {
		// 넘어갈 페이지가 다르다는 점을 Spring에 알려줘야 함 : 반환값 String 타입
		// VO bag을 파라메터로 받고, session으로 로그인 연결, Model로 view page로 이동 
		// model = request.setAttribute와 같은 역할
		
		//dao, login메서드 사용 vo 변수로 정의 
		RuserVO vo = dao.login(bag);
		
		if (vo != null) {
//			System.out.println("해당 id/pw 있음");
			session.setAttribute("userid", vo.getUserid()); //로그인 성공할 경우 session으로 연결
			
//			로그인 후, 메인페이지에 회원가입 정보(거래형태, 방개수, 희망세권)와 매칭된 매물 추천을 위한 알고리즘
//			회원가입 flow를 거친후 다음 flow에 해당.
			
//		 	매칭된 결과는 Product 디비에 있는 roomimg(추천매물)이고, 
//			dao2 recommend 메서드(ProductDAO)에 vo를 담아 mapper로 전송
//			productMapper에서 추천 매물(회원가입 정보 = 상품 정보) sql문 dao로 보냄
//			ProductDAO recommend 함수에서 추천매물에 해당하는 것을 DB에서 셀렉하여 가져옴
//			String roomimg = dao2.recommend(vo); 
			List<ProductVO> list = dao2.recommend(vo);
			
			System.out.println(list);

//			view 페이지에 roomimg결과를 전송
			model.addAttribute("list", list);
			
			return "main";
						
		} else {
//			System.out.println("해당 id/pw 없음");
			return "signup";
		}
	}
	
	@RequestMapping("checkBasket")
	@ResponseBody
	public List<ProductVO> checkBasket(@RequestParam(value = "userid1") String userid) {
		RuserVO bag = dao.checkBasket(userid);
		List<ProductVO> list = dao2.recommend(bag);
		return list;
	}
	
	@RequestMapping("ruser_update")
	public void update(RuserVO bag) throws Exception {
		dao.update(bag);
		System.out.println(bag.getUserpw());
	}
	
	@RequestMapping("ruser_select")
	public void select(RuserVO ruservo, Model model) {
		RuserVO vo = dao.select(ruservo);
		
		//검색결과를 담기위해 views까지 데이터를 넘김.
		model.addAttribute("vo2", vo);	
	}
	
	@RequestMapping("ruser_findpw")
	public void findpw(RuserVO ruservo, Model model) {
		RuserVO vo = dao.select(ruservo);
		
		//검색결과를 담기위해 views까지 데이터를 넘김.
		model.addAttribute("vo1", vo);	
	}
	
	@RequestMapping("ruser_delete")
	public String delete(RuserVO bag, HttpSession session) throws Exception {
		int result = dao.delete(bag);
		System.out.println("컨트롤러에서 삭제" + bag.getUserid() + bag.getUserpw());
		System.out.println(result);
		if(result == 1) {
			session.invalidate();
			return "redirect:main.jsp";
		}else {
			return "redirect:ruser_delete.jsp";
		}
	}
	
}