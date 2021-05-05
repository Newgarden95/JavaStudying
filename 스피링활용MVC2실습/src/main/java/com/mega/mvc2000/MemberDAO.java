package com.mega.mvc2000;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Component;
//싱글톤: 하나만 만들어서 사용할거임
@Component//싱글톤으로 설정 MemberDAO dao = new Member(); 한개만 객체 생성!
public class MemberDAO {

	// 오라클 DB연결하는 방법
	public void create(MemberVO bag) throws Exception {
		// 1. 커넥터 사용하겠다고 설정해야함.
		Class.forName("oracle.jdbc.OracleDriver"); // 오라클 jdbc드라이브 로드
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. db연결해보자!-shop, root, 1234
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // [접속에 필요한 정보 구성] thin: 드라이버 , @localhost: 호스트명, 1521: 포트넘버, xe: 식별자(SID)
		// jsp에서의 자동 import: 클릭 후, 컨트롤+쉬프트+m
		Connection con = DriverManager.getConnection(url, "apple", "1234"); // [접속작업] apple: 유저(사용자명), 1234: 사용자 비밀번호

		System.out.println("2. db연결 성공. <br>");

		// 3. SQL문을 만든다.=> 해당을 써서 SQL으로 인식하게 해야함.
		// String url = "http://www.naver.com";
		// URL url = new URL("http://www.naver.com")l
		// String file = "test.hwp";
		String sql = "insert into member values (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getId());
		ps.setString(2, bag.getPw());
		ps.setString(3, bag.getName());
		ps.setString(4, bag.getTel());
		System.out.println("3. SQL문을 만들기 성공. <br>");

		// 4. SQL문을 mySQL서버로 전송함.
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	}

	// crud기능
	// mysql사용한 경우
	/*
	 * public void create(MemberVO bag) throws Exception { // 1. 커넥터 사용하겠다고 설정해야함.
	 * System.out.print("===============" + bag.getId());
	 * Class.forName("com.mysql.jdbc.Driver"); // PrintWriter out = new
	 * PrintWriter(); System.out.println("1. 커넥터 사용 설정 성공. <br>");
	 * 
	 * // 2. db연결해보자!-shop, root, 1234 String url =
	 * "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf8"; //
	 * jsp에서의 자동 import: 클릭 후, 컨트롤+쉬프트+m Connection con =
	 * DriverManager.getConnection(url, "root", "1234");
	 * 
	 * System.out.println("2. db연결 성공. <br>");
	 * 
	 * // 3. SQL문을 만든다.=> 해당을 써서 SQL으로 인식하게 해야함. // String url =
	 * "http://www.naver.com"; // URL url = new URL("http://www.naver.com")l //
	 * String file = "test.hwp"; String sql =
	 * "insert into member values (?, ?, ?, ?)"; PreparedStatement ps =
	 * con.prepareStatement(sql); ps.setString(1, bag.getId()); ps.setString(2,
	 * bag.getPw()); ps.setString(3, bag.getName()); ps.setString(4, bag.getTel());
	 * System.out.println("3. SQL문을 만들기 성공. <br>");
	 * 
	 * // 4. SQL문을 mySQL서버로 전송함. 
	 * int result = ps.executeUpdate();  몇개가 인서트 된건지 파악가능(카운트 가능)
	 * System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	 * 
	 * }
	 */

	public void delete(String id) throws Exception {
		// 1. 커넥터 사용하겠다고 설정해야함.
		Class.forName("oracle.jdbc.OracleDriver"); // 오라클 jdbc드라이브 로드
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. db연결해보자!-shop, root, 1234
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // db연결 주소 설정 호스트이름 + 포트넘버
		// jsp에서의 자동 import: 클릭 후, 컨트롤+쉬프트+m
		Connection con = DriverManager.getConnection(url, "apple", "1234"); // 접근할 db설정

		System.out.println("2. db연결 성공. <br>");

		// 3. SQL문을 만든다.=> 해당을 써서 SQL으로 인식하게 해야함.
		// String url = "http://www.naver.com";
		// URL url = new URL("http://www.naver.com")l
		// String file = "test.hwp";
		String sql = "delete from member where id = ?"; // 삭제 쿼리문
		PreparedStatement ps = con.prepareStatement(sql); // 쿼리문 작성
		ps.setString(1, id);

		System.out.println("3. SQL문을 만들기 성공. <br>");

		// 4. SQL문을 Oracle서버로 전송함.
		ps.executeUpdate(); // 쿼리문을 오라클 디비서버로 전송
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");

	}

	public boolean check(String id) throws Exception {
		// 1. 커넥터 사용하겠다고 설정해야함.
		Class.forName("oracle.jdbc.OracleDriver"); // 오라클 jdbc드라이브 로드
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");
		// 2. db연결해보자!-shop, root, 1234
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // db연결 주소 설정 호스트이름 + 포트넘버
		// jsp에서의 자동 import: 클릭 후, 컨트롤+쉬프트+m
		Connection con = DriverManager.getConnection(url, "apple", "1234"); // 접근할 db설정

		System.out.println("2. db연결 성공. <br>");
		// 3. SQL문을 만든다.=> 해당을 써서 SQL으로 인식하게 해야함.
		// String url = "http://www.naver.com";
		// URL url = new URL("http://www.naver.com")l
		// String file = "test.hwp";
		String sql = "select * from member where id = ?"; // 삭제 쿼리문
		PreparedStatement ps = con.prepareStatement(sql); // 쿼리문 작성
		ps.setString(1, id);
		System.out.println("3. SQL문을 만들기 성공. <br>");

		// 4. SQL문을 Oracle서버로 전송함.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
		boolean result = false;
		if(rs.next()) {
			result = true;
		}
		return result;
	}
}
