package com.mega.mvc42;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 컨트롤러에 역할을 하겠다라고 선언(상속)
			// 해당 클래스가 컨트롤러 클래스임을 spring framework에 전달함
public class MemberController {

	@Autowired
	MemberDAO dao; // 싱글톤으로 만들어진 객체의 주소를 만들기
	
	@ResponseBody
	@RequestMapping("all2")
	public List<MemberVO> all() {
		List<MemberVO> all2 = dao.all2();
		return all2;
	}
	
	
	
	
	@RequestMapping("datatojsp")
	public void select(Model model) {
		List<MemberVO> list = dao.selectAll();
		System.out.println(list.size());
		System.out.println(list.get(0).getId());
		System.out.println(list.get(1).getId());
		
		model.addAttribute("list", list);
	}
	
	@RequestMapping("sunday")
	public void sunday() {
		System.out.println("넘어옴");
	}
	
	@RequestMapping("login")
	//세션처리 혹시 다른페이지로 넘기고 싶은 경우 void -> String으로 변경 하여 해당 페이지로 return
	public void login(MemberVO bag, HttpSession session) {  
		MemberVO vo = dao.login(bag);
		if(vo != null) { //해당 아이디와 패스워드 있는경우
			System.out.println("해당 id/pw가 있음");
			session.setAttribute("userid", vo.getId()); //userid라는 이름으로 id를 넘겨줌
			//return "redirect:login.jsp"; ~> redirect : 클라이언트 요청페이지로 다시 넘어가라!! 
											//webapp는 클라이언트가 요청하게 하는 페이지(요청하는페이지)
											//views는 클라이언트 요청에 대한 응답 페이지(요청에대한답)
		}else {
			System.out.println("해당 id/pw가 없음");
		}
	}

	
	
/*
	@RequestMapping("delete.mega") // 클라이언트의 요청사항을 받아 맵핑 -> delete 메서드 실행
	public String delete(String id, MemberDAO dao) throws Exception {
		if (dao.check(id) == true) {
			dao.delete(id); // model 실행(db처리)
			System.out.println("삭제 성공");
			return "login";
		} else {
			System.out.println("입력하신 아이디는 없습니다.");
			return "delete1";
		}
	}
	@RequestMapping("select2")
	public void select2(MemberVO memberVO, Model model) {
		MemberVO vo = dao.select(memberVO);
		//검색결과를 담기위해 views까지 데이터를 넘기기 위해 model 활용
		model.addAttribute("vo2",vo);
	}*/
}
