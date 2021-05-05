package com.mega.mvc39;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
@Component//싱글톤으로 설정
public class BbsDAO {
	@Autowired
	//myBatis 싱글톤 주소를 주입! 
	
	SqlSessionTemplate my; // 마이바티스에 해당하는 오리지널 클래스 객체 생성
	public void insert(BbsVO bag) throws Exception {
		my.insert("bbs.insert", bag); //bbs.insert : 매퍼이름
		//my.select("bbs.select", bag); // my(마이바티스 싱글톤 객체).insert(싱글톤 객체의 기능, 메서드)("sql문",넣을 값);
		
	}
	
	public BbsVO read(BbsVO bag) {
		BbsVO vo = my.selectOne("bbs.select", bag); //rs.next부분(bag에 set해주는)을 마이바티스가 알아서 다해줌 selectOne 하나만 출력
		return vo;
	}
	
	public java.util.List<BbsVO> all() {
		return my.selectList("bbs.all"); //레코드 값들을 bag에 담고 그 bag들을 리스트에 담아줌
	}
}
