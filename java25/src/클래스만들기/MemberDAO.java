package 클래스만들기;

public class MemberDAO {
	//전역변수, 자동초기화
	//참조형변수는 무조건 null로 초기화!
	//변경안되면 미리 값 대입해넣어줌
	
	//url: 멤버변수(선택됨), 전역변수, 참조형변수 => 변수의 종류는 총3가지임  
	String url = "jdbc:mysql://localhost:3306/shop";
	String user = "root";
	String password = "1234";

	//자바는 메서드 이름을 똑같이 쓸 수 있다.
	//메서드의 구분은 입력값에 따라서 하기 때문에.
	//하나의 이름으로 여러가지 형태의 메서드를 정의하여 호출할 수 있는 기능
	//오버로딩(다형성, 폴리모피즘)
	public void create(String id, String pw, String name) {
		//id, pw, name 은 create 내에서만 사용 가능한 지역변수(local 변수)
		System.out.println("당신이 입력한 id는 "+id);
		System.out.println("당신이 입력한 pw는 "+pw);
		System.out.println("당신이 입력한 name는 "+name);
	}
	//오버로딩
	public void create(String id, String pw, String name, String address) {
		//id, pw, name 은 create 내에서만 사용 가능한 지역변수(local 변수)
		System.out.println("당신이 입력한 id는 "+id);
		System.out.println("당신이 입력한 pw는 "+pw);
		System.out.println("당신이 입력한 name는 "+name);
		System.out.println("당신이 입력한 address는 "+address);
		
	}
	public void delete(String id) {
		//System.out.println(name); => name은 create안에서만 사용가능한 지역변수라 다른 메서드에서 접근 불가
		System.out.println("당신의 id "+id+"가 삭제되었습니다.");
	}
	
	//Source에서 generate toString선택
	//toString() => 원래는 현재 주소를 보여주는데 
	@Override
	public String toString() {
		return "MemberDAO [url=" + url + ", user=" + user + ", password=" + password + "]";
	}
	
}
