package com.mega.mvc42;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//싱글톤: 하나만 만들어서 사용할거임
@Component//싱글톤으로 설정 MemberDAO dao = new Member(); 한개만 객체 생성!
public class MemberDAO {
	
	//myBatis 싱글톤 주소를 주입!
	//src/main/resources밑에 spring생성-> spring Bean(객체) Configuration file로 생성
	@Autowired
	SqlSessionTemplate my; 
	
	public void create(MemberVO bag) {
		my.insert("member.insert", bag);
	}
	
	public MemberVO select(MemberVO bag) {
		return my.selectOne("member.select",bag);
	}
	
	public MemberVO login(MemberVO bag) {
		return my.selectOne("member.login", bag);
	}
	
	public List<MemberVO> selectAll(){
		List<MemberVO> list = my.selectList("member.all");
		return list;
	}
}
