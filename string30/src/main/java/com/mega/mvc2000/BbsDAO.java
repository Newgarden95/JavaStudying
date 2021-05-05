package com.mega.mvc2000;

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
	SqlSessionTemplate my;
	public void insert(BbsVO bag) throws Exception {
		my.insert("bbs.insert", bag); //bbs.insert : 매퍼이름
		/*
		// 1. 커넥터 사용하겠다고 설정해야함.
		Class.forName("oracle.jdbc.OracleDriver"); // 오라클 jdbc드라이브 로드
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. db연결해보자!-shop, root, 1234
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // [접속에 필요한 정보 구성] thin: 드라이버 , @localhost: 호스트명, 1521:
															// 포트넘버, xe: 식별자(SID)
		// jsp에서의 자동 import: 클릭 후, 컨트롤+쉬프트+m
		Connection con = DriverManager.getConnection(url, "root", "1234"); // [접속작업] apple: 유저(사용자명), 1234: 사용자 비밀번호

		System.out.println("2. db연결 성공. <br>");

		// 3. SQL문을 만든다.=> 해당을 써서 SQL으로 인식하게 해야함.
		// String url = "http://www.naver.com";
		// URL url = new URL("http://www.naver.com")l
		// String file = "test.hwp";
		String sql = "insert into bbs values (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getId());
		ps.setString(2, bag.getTitle());
		ps.setString(3, bag.getContent());
		ps.setString(4, bag.getWriter());
		System.out.println("3. SQL문을 만들기 성공. <br>");

		// 4. SQL문을 mySQL서버로 전송함.
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");*/
	}
	
}
