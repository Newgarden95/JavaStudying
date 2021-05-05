package com.mega.mvc42;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
//싱글톤: 하나만 만들어서 사용할거임
@Component//싱글톤으로 설정 MemberDAO dao = new Member(); 한개만 객체 생성!
public class PersonDAO {
	
	//myBatis 싱글톤 주소를 주입!
	//src/main/resources밑에 spring생성-> spring Bean(객체) Configuration file로 생성
	@Autowired
	SqlSessionTemplate my; 
	
	@RequestMapping("insertperson")
	public void create(PersonVO bag) {
		my.insert("person.insert", bag);
	}
}
