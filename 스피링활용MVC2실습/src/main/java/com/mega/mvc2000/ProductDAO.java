package com.mega.mvc2000;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Component;

@Component //싱글톤 설정, 싱글톤 인젝션(주입)
public class ProductDAO {
	
	public void insert(ProductVO bag) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver"); // 드라이버 로드
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";// db접속을위한 기본 설정
		Connection con = DriverManager.getConnection(url,"root","1234"); //db 연결
		String sql = "insert into product values(?,?,?,?)"; 
		PreparedStatement ps = con.prepareStatement(sql); //sql문 입력
		
		ps.setString(1, bag.getId());
		ps.setString(2, bag.getTitle());
		ps.setString(3, bag.getPrice());
		ps.setString(4, bag.getCompany());
		
		ps.executeUpdate(); //sql문을 db서버로 전송
	}

}
