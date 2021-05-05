package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

//자바에서는 자동 import 컨트롤+쉬프트+o(오)
public class MemberDB {
	
	public ArrayList<MemberVO> list() throws Exception  {
		ArrayList<MemberVO> list = new ArrayList<>();
		
		// 1. 커넥터 사용하겠다고 설정해야함.
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. db연결해보자!-shop, root, 1234
		String url = "jdbc:mysql://localhost:3306/shop";
		// jsp에서의 자동 import: 클릭 후, 컨트롤+쉬프트+m
		Connection con = DriverManager.getConnection(url, "root", "1234");

		System.out.println("2. db연결 성공. <br>");

		String sql = "select * from member";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL문을 만들기 성공. <br>");

		// 4. SQL문을 mySQL서버로 전송함.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
		
		//1. 검색결과가 있는지 체크해야한다.
		//System.out.println(rs.next());//true이면 있다라는 얘기
		//2. 만약에 결과가 있으면, 테이블에서 원하는 데이터항목을 꺼내주면 됨.
		while (rs.next()) {
			//rs.next()를 호출할 때마다 한 행씩 내려가서 그 행이 있는지를 체크: boolean
			//있으면 true, 없으면 false
			//true이면 각 항목의 값들을 꺼내주어야 한다.
			//꺼내주는 방법은 2가지, 1)항목명, 2)항목의 인덱스
			String id2 = rs.getString("id");//"apple"
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
			
			//가방을 만들어서 꺼내준 값들을 가방에 넣는다.
			MemberVO bag = new MemberVO();
			bag.setId(id2);
			bag.setPw(pw);
			bag.setName(name);
			bag.setTel(tel);
			
			//가방들을 넣어줄 컨테이너에 하나씩 넣어준다.
			list.add(bag);
		}
		System.out.println(list.size() + "================");
		
		return list;
	}
	
	public boolean check(String id, String pw) throws Exception  {
		// 1. 커넥터 사용하겠다고 설정해야함.
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. db연결해보자!-shop, root, 1234
		String url = "jdbc:mysql://localhost:3306/shop";
		// jsp에서의 자동 import: 클릭 후, 컨트롤+쉬프트+m
		Connection con = DriverManager.getConnection(url, "root", "1234");

		System.out.println("2. db연결 성공. <br>");

		String sql = "select * from member where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		System.out.println("3. SQL문을 만들기 성공. <br>");

		// 4. SQL문을 mySQL서버로 전송함.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
		
		boolean result = false;
		
		if (rs.next()) {
			result = true;
		}
		return result;
	}
	
	// crud기능
	public int create(MemberVO bag) throws Exception  {
		// 1. 커넥터 사용하겠다고 설정해야함.
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. db연결해보자!-shop, root, 1234
		String url = "jdbc:mysql://localhost:3306/shop";
		// jsp에서의 자동 import: 클릭 후, 컨트롤+쉬프트+m
		Connection con = DriverManager.getConnection(url, "root", "1234");

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
		int result = ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
		return result;
	}
	public void update(MemberVO bag) throws Exception  {
		// 1. 커넥터 사용하겠다고 설정해야함.
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");
		
		// 2. db연결해보자!-shop, root, 1234
		String url = "jdbc:mysql://localhost:3306/shop";
		// jsp에서의 자동 import: 클릭 후, 컨트롤+쉬프트+m
		Connection con = DriverManager.getConnection(url, "root", "1234");
		
		System.out.println("2. db연결 성공. <br>");
		
		// 3. SQL문을 만든다.=> 해당을 써서 SQL으로 인식하게 해야함.
		// String url = "http://www.naver.com";
		// URL url = new URL("http://www.naver.com")l
		// String file = "test.hwp";
		String sql = "update member set pw = ?, tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getPw());
		ps.setString(2, bag.getTel());
		ps.setString(3, bag.getId());
		System.out.println("3. SQL문을 만들기 성공. <br>");
		
		// 4. SQL문을 mySQL서버로 전송함.
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	}
	
	public void delete(String id) throws Exception  {
		// 1. 커넥터 사용하겠다고 설정해야함.
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. db연결해보자!-shop, root, 1234
		String url = "jdbc:mysql://localhost:3306/shop";
		// jsp에서의 자동 import: 클릭 후, 컨트롤+쉬프트+m
		Connection con = DriverManager.getConnection(url, "root", "1234");

		System.out.println("2. db연결 성공. <br>");

		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL문을 만들기 성공. <br>");

		// 4. SQL문을 mySQL서버로 전송함.
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	}

	public MemberVO read(String id) throws Exception  {
		// 1. 커넥터 사용하겠다고 설정해야함.
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. db연결해보자!-shop, root, 1234
		String url = "jdbc:mysql://localhost:3306/shop";
		// jsp에서의 자동 import: 클릭 후, 컨트롤+쉬프트+m
		Connection con = DriverManager.getConnection(url, "root", "1234");

		System.out.println("2. db연결 성공. <br>");

		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL문을 만들기 성공. <br>");

		// 4. SQL문을 mySQL서버로 전송함.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
		
		//1. 검색결과가 있는지 체크해야한다.
		//System.out.println(rs.next());//true이면 있다라는 얘기
		//2. 만약에 결과가 있으면, 테이블에서 원하는 데이터항목을 꺼내주면 됨.
		MemberVO bag = new MemberVO();
		if (rs.next()) {
			//꺼내주는 방법은 2가지, 1)항목명, 2)항목의 인덱스
			String id2 = rs.getString("id");//"apple"
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
			bag.setId(id2);
			bag.setPw(pw);
			bag.setName(name);
			bag.setTel(tel);
		}
		return bag;
	}
	public int read(String id, String pw) throws Exception  {
		int result = 0;
		// 1. 커넥터 사용하겠다고 설정해야함.
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. db연결해보자!-shop, root, 1234
		String url = "jdbc:mysql://localhost:3306/shop";
		// jsp에서의 자동 import: 클릭 후, 컨트롤+쉬프트+m
		Connection con = DriverManager.getConnection(url, "root", "1234");

		System.out.println("2. db연결 성공. <br>");

		String sql = "select * from member where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		System.out.println("3. SQL문을 만들기 성공. <br>");

		// 4. SQL문을 mySQL서버로 전송함.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
		
		//1. 검색결과가 있는지 체크해야한다.
		//System.out.println(rs.next());//true이면 있다라는 얘기
		//2. 만약에 결과가 있으면, 테이블에서 원하는 데이터항목을 꺼내주면 됨.
		if (rs.next()) {
			result = 1;
		}
		return result;
	}


	
}
