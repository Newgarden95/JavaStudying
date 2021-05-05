package com.mega.mvc4141;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component//싱글톤으로 설정
public class BbsDAO {
	@Autowired
	//myBatis 싱글톤 주소를 주입! 
	SqlSessionTemplate my; // 마이바티스에 해당하는 오리지널 클래스 객체 생성
	public void insert(BbsVO bag) throws Exception {
		my.insert("bbs.insert", bag); //bbs.insert : 매퍼이름
		//my.select("bbs.select", bag); // my(마이바티스 싱글톤 객체).insert(싱글톤 객체의 기능, 메서드)("sql문",넣을 값);
		
	}
	
}
