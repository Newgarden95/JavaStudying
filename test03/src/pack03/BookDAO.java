package pack03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BookDAO {
	Connection con; // 커넥션은 전역변수로 설정해서 어디서든 사용할 수 있도록 설정
	public BookDAO() throws Exception { //생성자 : insert, delete메소드에 반복적으로 사용하는 것을 미리 빼놔 사용
		Class.forName("com.mysql.jdbc.Driver"); // 연동을 위한 커넥션 드라이버 로드
		
		String url = "jdbc:mysql://localhost:3306/mega"; // 연동하고자 하는 주소
		con = DriverManager.getConnection(url, "root","1234"); // 드라이버매니저를 통해 DB와 연동
	}
	
	public void insert(BookVO bag) throws Exception {
		String sql = "insert into book values(?,?,?,?)"; //등록에 대한 쿼리문
		PreparedStatement ps = con.prepareStatement(sql); //쿼리문 생성
		
		//???? 에 대입하기
		ps.setString(1, bag.getId());
		ps.setString(2, bag.getTitle());
		ps.setString(3, bag.getStory());
		ps.setString(4, bag.getCompany());
		
		ps.executeUpdate(); //쿼리문 수행
	}
	
	public void delete(String title) throws Exception {
		String sql = "delete from book where title = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, title); 
		
		ps.executeUpdate();
	}
	

}
