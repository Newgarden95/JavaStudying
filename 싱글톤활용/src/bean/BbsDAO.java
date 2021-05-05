package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//싱글톤 객체로 생성하기
public class BbsDAO  {
	//멤버변수
		Connection con; //db접근을 위해 필요한 커넥션 객체 선언
		DBConnectionMgr dbcp; //싱글톤 객체 선언
		
		public BbsDAO() throws Exception {
			dbcp = DBConnectionMgr.getInstance(); //BbsDAO생성시  싱글톤 dbcp객체 생성
			Class.forName("com.mysql.jdbc.Driver");
		}
		
		public BbsVO read(String id) throws Exception {
			con = dbcp.getconnection(); //커넥션설정 : dbcp객체에서 getconnection 메서드 호출
			String sql= "select * from product where no =? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(0, Integer.parseInt(id));
			System.out.println("3.sql문 객체로 생성 OK");
			
			ResultSet rs = ps.executeQuery();
			System.out.println("4.sql문 mysql로 전송 OK");
			BbsVO bag = new BbsVO(); //VO생성
			if(rs.next()) {
				String title = rs.getString(2);
				String content = rs.getString(3);
				String writer = rs.getString(4);
				
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
			}
			return bag;
		}
	}
