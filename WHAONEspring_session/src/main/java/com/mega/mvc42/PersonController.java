package com.mega.mvc42;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 컨트롤러에 역할을 하겠다라고 선언(상속)
			// 해당 클래스가 컨트롤러 클래스임을 spring framework에 전달함
public class PersonController {

	@Autowired
	PersonDAO dao; // 싱글톤으로 만들어진 객체의 주소를 만들기
	
	@RequestMapping("insertperson")
	public void insert(PersonVO bag) {
		dao.create(bag);
	}
}
