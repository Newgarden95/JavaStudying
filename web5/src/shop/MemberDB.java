package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//오래 쓰기 위해서는 반드시 클래스로 만들기!!!
public class MemberDB { // 테이블 마다 새로운 거 설정해줘야함
	// CRUD기능
	// 자바에서는 자동 import => ctrl + shift + o
	public void create(String id, String pw, String name, String tel) throws Exception { // 에러나는 부분 오른쪽클릭 declare한후
																							// throws Exception(예외처리)
																							// 네트워크 연결과 같이 외부연결에서는 반드시
																							// 강제로 예외처리해야함!!!!
		// 1. 커넥터 사용하겠다고 설정해야함
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. 커넥터를 이용하여 db연결하기(DB: shop ID: root PW: 1234)
		String url = "jdbc:mysql://localhost:3306/db";

		Connection con = DriverManager.getConnection(url, "root", "1234");

		System.out.println("2. DB 연결 성공. <br>"); // 2단계 작동잘 되는지 확인하기 위한 문

		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, id);// 1번 물음표에는 id를 넣겠다
		ps.setString(2, pw);// 2번 물음표에는 pw를 넣겠다
		ps.setString(3, name);// 3번 물음표에는 name를 넣겠다
		ps.setString(4, tel);// 4번 물음표에는 tel를 넣겠다

		System.out.println("3. SQL문 만들기 성공. <br>"); // 3단계 작동잘 되는지 확인하기 위한 문

		// 4. 자바에서 만든 SQL문을 만들어 mySQL서버로 전송한다.
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL서버로 전송성공. <br>"); // 4단계 작동잘 되는지 확인하기 위한 문
	}

	public void delete(String id) throws Exception { // 삭제에는 프라이머리키인 id만 있으면됨

		// 1. 커넥터 사용하겠다고 설정해야함
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. 커넥터를 이용하여 db연결하기(DB: shop ID: root PW: 1234)
		String url = "jdbc:mysql://localhost:3306/db";

		Connection con = DriverManager.getConnection(url, "root", "1234");

		System.out.println("2. DB 연결 성공. <br>"); // 2단계 작동잘 되는지 확인하기 위한 문

		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, id);// 1번 물음표에는 id를 넣겠다

		System.out.println("3. SQL문 만들기 성공. <br>"); // 3단계 작동잘 되는지 확인하기 위한 문

		// 4. 자바에서 만든 SQL문을 만들어 mySQL서버로 전송한다.
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL서버로 전송성공. <br>"); // 4단계 작동잘 되는지 확인하기 위한 문
	}

	public void update(String id, String pw, String tel) throws Exception { // 에러나는 부분 오른쪽클릭 declare한후
		// throws Exception(예외처리)
		// 네트워크 연결과 같이 외부연결에서는 반드시 강제로 예외처리해야함!!!!
// 1. 커넥터 사용하겠다고 설정해야함
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

// 2. 커넥터를 이용하여 db연결하기(DB: shop ID: root PW: 1234)
		String url = "jdbc:mysql://localhost:3306/db";

		Connection con = DriverManager.getConnection(url, "root", "1234");

		System.out.println("2. DB 연결 성공. <br>"); // 2단계 작동잘 되는지 확인하기 위한 문

		String sql = "update member set pw = ?, tel = ? where id = ?"; // id검색하고 비번이랑 전화번호 변경하라 set:입력(수정) / get:반환
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, pw);// 1번 물음표에는 pw를 넣겠다
		ps.setString(2, tel);// 2번 물음표에는 tel를 넣겠다
		ps.setString(3, id);// 4번 물음표에는 id를 넣겠다

		System.out.println("3. SQL문 만들기 성공. <br>"); // 3단계 작동잘 되는지 확인하기 위한 문

// 4. 자바에서 만든 SQL문을 만들어 mySQL서버로 전송한다.
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL서버로 전송성공. <br>"); // 4단계 작동잘 되는지 확인하기 위한 문
	}

}
