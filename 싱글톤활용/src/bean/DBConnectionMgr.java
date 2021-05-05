package bean;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 싱글톤 : 프로그램내에서 단 하나의 객체만을 생성하게 강제하는 패턴
 * DAO클래스에서 사용할 DBConnectionMgr 싱글톤 객체 생성

*/
public class DBConnectionMgr {
	//static ~> 프로그램 내에서 공통으로 사용되는 데이터를 관리 할 떄 이용
	//1. 스태틱의 싱글톤으로 설정할 객체 선언
	static DBConnectionMgr dbcp; 
	
	private DBConnectionMgr() {
		//생성자 : 객체 생성시 자동으로 호출되어 필드를 초기화 하는 역할 ~> 만약 객체 생성 시 생성자가 호출되지 않으면 에러 발생
		//생성자를 private로 만들어 버리면 외부 클래스에서 Singleton 클래스를 new키워드를 이용해서 생성할 수 없게 된다
	}
	
	//2. 싱글톤 객체 생성
	public static DBConnectionMgr getInstance() {
		if(dbcp == null) {//객체생성 안 된 경우
			dbcp = new DBConnectionMgr(); //객체 생성후 return 
		}else {
			return dbcp; //객체생성 된 경우 그대로 return
		}
		return dbcp;
	}
	
	public Connection getconnection() throws Exception { //커넥션 메소드 
		String url = "jdbc:mysql://localhost:3306/jeju?useUnicode=true&characterEncoding=utf8"; //url설정
		return DriverManager.getConnection(url,"root","1234"); //connection 객체 타입으로 리턴
	}
	
}
