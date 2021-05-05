package com.mega.mvcproject02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QnaController {

	@Autowired
	QnaDAO dao;
	
	@RequestMapping("qnainsert")
	public void insert(QnaVO bag) throws Exception {
		//public void insert(String id, String pw, String name, String tel) {
		//컨트롤러에 있는 메서드에 변수를 선언하면, 
		//스프링이 객체를 생성해준다.
		//MemberDAO dao = new MemberDAO();
		dao.create(bag);
		System.out.println("컨트롤러에서 받은 id: " + bag.getQid());
		System.out.println("컨트롤러에서 받은 type: " + bag.getQtype());
		System.out.println("컨트롤러에서 받은 title: " + bag.getQtitle());
		System.out.println("컨트롤러에서 받은 contents: " + bag.getQcontents());
		System.out.println("컨트롤러에서 받은 date: " + bag.getQdate());
		
		//JDBC프로그램 절차 4단계
	}

}
