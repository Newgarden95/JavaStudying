package shop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardDAO {
	public BoardVO read(String writer) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/shop2";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		
		String sql = " select * from board where writer = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, writer);
		
		ResultSet rs = ps.executeQuery();	
		BoardVO bag = new BoardVO();
		if (rs.next()) {
			String id = rs.getString(1);
			String title = rs.getString(2);
			String content= rs.getString(3);
			String writer1 = rs.getString(4); //writer 라는 변수 중복 때문에 writer1으로 변경
			
			bag.setId(id);
			bag.setTitle(title);
			bag.setContent(content);
			bag.setWriter(writer1);
		}	
		return bag;
	}
}


