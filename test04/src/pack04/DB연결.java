package pack04;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class DB연결 {
	public static void main(String[] args) throws Exception {
		String id = "window";
		String pw = "window";
		String name = "window";
		String tel = "window";
		
		Class.forName("com.mysql.jdbc.Driver");//드라이버(java <-> db사이 통신을 위한것)로드
		System.out.println("1. 커넥터 사용 설정 성공. <br>");
		String url = "jdbc:mysql://localhost:3306/db"; //연결할 db주소 설정
													//url,   id,    pw
		Connection con = DriverManager.getConnection(url, "root", "1234"); //드라이버메니저를 통해 db연결(커넥션 생성)
		System.out.println("2. db연결 성공. <br>");

		String sql = "insert into member values(?,?,?,?)"; //쿼리문
		PreparedStatement ps = con.prepareStatement(sql);//sql 구문 작성
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		ps.executeUpdate(); //mysql로 생성한 sql문 보냄 -> 쿼리문 처리
		System.out.println("3. SQL문을 만들기 성공. <br>");

		// 4. SQL문을 mySQL서버로 전송함.
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	}
}
