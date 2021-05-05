package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//DAO클래스에서 사용할 싱글톤 객체 생성
public class DBConnectionMgr {
	static DBConnectionMgr dbcp;
	
	private DBConnectionMgr() {
	}
	
	public static DBConnectionMgr getInstance() {
		if(dbcp == null) {
			dbcp = new DBConnectionMgr();
		}else {
			return dbcp;
		}
		return dbcp;
	}
	
	public Connection getconnection() throws Exception { //커넥션 메소드 
		String url = "jdbc:mysql://localhost:3306/jeju?useUnicode=true&characterEncoding=utf8";
		return DriverManager.getConnection(url,"root","1234"); //connection 객체 타입으로 리턴
	}
	
}
