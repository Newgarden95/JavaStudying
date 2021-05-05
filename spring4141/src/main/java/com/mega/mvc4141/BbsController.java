package com.mega.mvc4141;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //어노테이션을 통해 싱글톤 설정
public class BbsController {
	@Autowired//싱글톤으로 만든 주소  넣어주세요.!(주입)
	BbsDAO dao; //싱글톤으로 만들어진 BbsDAO객체 생성
	
	@RequestMapping("sunday")
	public void sunday() {
		System.out.println("넘어옴");
	}
	
	@RequestMapping("insert2.mega")//가상주소로 요청
	public void insert(BbsVO bag) throws Exception { //가방은 멤버변수가 매번 바뀌기 떄문에 프로토타입!!
		dao.insert(bag);
		System.out.println("내가 호출됨");
		System.out.println("컨트롤 하는 메서드");
		System.out.println("컨트롤러에서 받은 id: "+bag.getId());
		System.out.println("컨트롤러에서 받은 title: "+bag.getTitle());
		System.out.println("컨트롤러에서 받은 content: "+bag.getContent());
		System.out.println("컨트롤러에서 받은 writer: "+bag.getWriter());
		
	}
	
}
