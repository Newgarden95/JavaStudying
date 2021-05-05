package jeju;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class userDB {

	public void create(userVO bag) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		String url = "jdbc:mysql://localhost:3306/jeju?useUnicode=true&characterEncoding=utf8";

		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db연결성공. <br>");

		String sql = "insert into user_information values(?,?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql); // sql문 인식

		ps.setString(1, bag.getId());
		ps.setString(2, bag.getPw());
		ps.setString(3, bag.getName());
		ps.setString(4, bag.getTel());
		ps.setString(5, bag.getEmail());
		ps.setString(6, bag.getAddr());
		ps.setString(7, bag.getBirth());
		System.out.println("3. sql문을 만들기 성공. <br>");

		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");

	}// create
	
	public userVO read(String id) throws Exception {
	
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");


		String url = "jdbc:mysql://localhost:3306/jeju?useUnicode=true&characterEncoding=utf8";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db연결 성공. <br>");

		String sql = "select * from user_information where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		// sql인식하게 만들어주는 것 (java sql)
		ps.setString(1, id);
		System.out.println("3. sql문을 만들기 성공. <br>");


		ResultSet rs = ps.executeQuery();
		//read는  executeupdate 아니고 query임
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
		
		// 1.검색결과가 있는지 체크해야한다.
		//System.out.println(rs.next()); //true = 있다, false = 없다.
		
		// 2.만약에 결과가 있으면, 테이블에서 원하는 데이터 항목을 꺼내온다.
		userVO bag = new userVO();  
		if (rs.next()) { 
			String id2 = rs.getString(1); 
			String pw = rs.getString(2); 
			String name = rs.getString(3);
			String tel = rs.getString(4);
			String email = rs.getString(5);
			String addr = rs.getString(6);
			String birth = rs.getString(7);
			bag.setId(id2);
			bag.setPw(pw);
			bag.setName(name);
			bag.setTel(tel);			
			bag.setEmail(email);			
			bag.setAddr(addr);			
			bag.setBirth(birth);			
		}
		return bag;

	}//read
	
	public void update(userVO bag) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");
		
		String url = "jdbc:mysql://localhost:3306/jeju?useUnicode=true&characterEncoding=utf8";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db연결 성공. <br>");

	
		String sql = "update user_information set pw =?, name =?, tel =?, email =?, addr =?, birth =? where id =?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, bag.getPw());
		ps.setString(2, bag.getName());
		ps.setString(3, bag.getTel());
		ps.setString(4, bag.getEmail());
		ps.setString(5, bag.getAddr());
		ps.setString(6, bag.getBirth());
		ps.setString(7, bag.getId());
		System.out.println("3. sql문을 만들기 성공. <br>");

		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
		
		
	}//update
	

	public void delete(String id) throws Exception { //수정필요. 
		

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		String url = "jdbc:mysql://localhost:3306/jeju?useUnicode=true&characterEncoding=utf8";

		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db연결성공. <br>"); 

		String sql = "delete from user_information where id = ?";
		PreparedStatement ps = con.prepareStatement(sql); // sql문 인식

		ps.setString(1, id);
	
		System.out.println("3. sql문을 만들기 성공. <br>");

		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");

	}// delete

	public boolean check(String id, String pw) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		String url = "jdbc:mysql://localhost:3306/jeju?useUnicode=true&characterEncoding=utf8";

		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db연결성공. <br>");

		String sql = "select * from user_information where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql); // sql문 인식
		ps.setString(1, id);
		ps.setString(2, pw);
		System.out.println("3. sql문을 만들기 성공. <br>");

		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");

		boolean result = false; // boolean 초기화값은 false
		// 2.만약에 결과가 있으면, 테이블에서 원하는 데이터 항목을 꺼내온다.

		if (rs.next()) { // 꺼내주는 방법은 2가지! 1)항목명 2)인덱스
			result = true;
		}
		return result;
	} // check

}// class
