package bean;

public class DBCP사용 {

	public static void main(String[] args) {
		System.out.println("아무것도 설정 안된 DBCP객체 instance: "+ DBCP.instance);
		
		//싱글톤 사용!! -> 1번만 객체 생성 하면 다시 객체 생성 필요없이 사용가능
		DBCP dbcp1 = DBCP.getInstance();// DBCP.getInstance()의 반환형이 DBCP이므로 
		System.out.println("dbcp1이라는 객체 생성후: "+DBCP.instance);
		DBCP dbcp2 = DBCP.getInstance();
		System.out.println(dbcp1);
		System.out.println(dbcp2);
		
		//즉, dbcp1이라고 싱글톤 객체 생성후 DBCP객체를 사용할 일이 있을 때 dbcp1만 이용하면됨 => 새로 객체생성할 필요x
	}
}
