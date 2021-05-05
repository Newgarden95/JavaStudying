package com.mega.mvc39;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

@Controller //어노테이션을 통해 컨트롤러 설정(스프링에게 알려줌)
public class BbsController {
	@Autowired//싱글톤으로 만든 주소 넣어주세요.!(주입)
	BbsDAO dao; //싱글톤으로 만들어진 BbsDAO객체 생성
	
	//사용될 db가 여러개면 @Autowired 1개당 1개의 싱글톤을 사용할 수 있다.
	@Autowired
	MemberDAO dao2; 
	//view reserve에 의해 views에 jsp파일 생김
	@RequestMapping("insert2.mega")//가상주소로 요청
	public void insert(BbsVO bbsVO) throws Exception { 
		//가방은 멤버변수가 매번 바뀌기 떄문에 프로토타입!!
		//BbsVO 변수명은 클래스명과 같게만드는게 국룰
		//bbsVO를 model속성으로 자동 등록됨 but, bag인 경우 수동으로 설정
		//model.addAttribute("bbsVO", bbsVO);
		dao.insert(bbsVO);
	}
	
	//view reserve에 의해 views에 jsp파일 생김
	@RequestMapping("select")
	public void select(BbsVO bbsVO, Model model) {//스프링에게 모델 요구
		BbsVO vo = dao.read(bbsVO);
		//views까지 검색된 정보를 가지고 가야한다.
		//model(내장객체)로 속성으로만 등록하면 됨.
		//select.jsp까지 보내기 위해 모델로 속성선언
		//검색결과를 담아서 views까지 데이터를 넘기기 위해 model 활용
		model.addAttribute("vo",vo); // 앞에 "vo"는 모델이름, 뒤에 vo는 read의 결과 값 즉, 보내고자 하는 거
	}
	
	//view reserve에 의해 views에 jsp파일 생김
	@RequestMapping("all") //전체 결과값을 select하는 메서드
	public void all(Model model) {//입력값없이 테이블 전체 데이터 뽑기 => 모델로 views로 전달
		java.util.List<BbsVO> list = dao.all(); //리스트 최상위(List>ArrayList)로 객체선언 ~> 다형성
		System.out.println("목록의 개수: "+list.size()+ "개의 목록이 있음.========");
		model.addAttribute("list", list);
	}
}
