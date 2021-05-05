package jeju;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class productDB {
	public void create(String Classification, String Name, String Image, String Price, String Location, String Common,
			String Internal, String RoomType, String Pickup, String Info) throws Exception {
		// 1. 커넥터를 사용하겠다고 설정.
		Class.forName("com.mysql.jdbc.Driver"); // 클래스는 처음 대문자를 써줘야한다
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공."); // 연결이 성공 하면 브라우저에 성공했음을 띄워준다.

		// 2. db 연결을 해보기 - shop, root, 1234
		String url = "jdbc:mysql://localhost:3306/jeju";
		// 포트번호를 확인하자, localhost는 내 컴퓨터 안에서 사용할때 쓴다.
		// jsp 자동 import : ctrl + shift + m
		Connection con = DriverManager.getConnection(url, "root", "1234"); // 설정한 곳이 위치한 주소를 가져온다.
		System.out.println("2. DB 연결 성공.");

		// 3. SQL문을 만듬 => 해당 부품을 써서 SQL로 인식하게 해야한다.
		// 아래 sql문은 mySQL이 사용한다. 서버는 만들어 주기만 함.
		String sql = "insert into prduct values (?, ?, ?, ?, ?, ?, ?, ?, ?)"; // ?는 입력값을 모를 때 넣어둠(입력받은 값을 넣어줄때 사용)
		PreparedStatement ps = con.prepareStatement(sql);// PreparedStatement => sql을 담당하는 부품
		ps.setString(1, Classification);
		ps.setString(2, Name);
		ps.setString(3, Image);
		ps.setString(4, Price);
		ps.setString(5, Location);
		ps.setString(6, Common);
		ps.setString(7, Internal);
		ps.setString(8, RoomType);
		ps.setString(9, Pickup);
		ps.setString(10, Info);
		System.out.println("3. SQL문을 만들기 성공.");

		// 4. 만든 SQL문을 mySQL 서버로 전송
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL 서버로 전송 성공.");
	}

	public void read() {

	}

	public void update() {

	}

	public void delete() {

	}
}
