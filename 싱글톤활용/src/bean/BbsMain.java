package bean;

/*
 * DB연결 기능을 보는게 아니라 싱글톤 기능만 볼 것임
 */
public class BbsMain {
	public static void main(String[] args) throws Exception {
		//BbsDAO객체 생성 => 싱글톤 설정x ~> 따라서 dao, dao1은 주소가 다름
		BbsDAO dao = new BbsDAO(); 
		BbsDAO dao1 = new BbsDAO();
		
		System.out.println("싱글톤 설정 안된 BbsDAO객체");
		System.out.println(dao);
		System.out.println(dao1);
		
		//DBConnectionMgr클래스는 싱글톤 객체이므로 dbcp1, dbcp2는 주소가 같다
		System.out.println("싱글톤 설정 된 DBConnectionMgr객체");
		DBConnectionMgr dbcp1 = DBConnectionMgr.getInstance();
		DBConnectionMgr dbcp2 = DBConnectionMgr.getInstance();
		System.out.println(dbcp1);
		System.out.println(dbcp2);
		System.out.println("========================");
		System.out.println(dao.dbcp);
		System.out.println(dao1.dbcp);
		
	}
}
