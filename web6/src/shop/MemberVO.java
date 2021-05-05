package shop;

public class MemberVO {
	//VO만들기(데이터를 담아줄 가방과 같은 역할) => 가방을 하나 만들어서 값을 넣은 다음에 한 번에 넘기는게 더 효율적
	String id;
	String pw;
	String name;
	String tel;
	
	//source -> generate getter and setter 사용!!!
	
	//값을 넣고 뺄때는 변수 하나씩 기능을 처리
	//각 변수마다 넣는기능, 꺼내는 기능 필요
	//기능은 메서드로 구현
	public void setId( String id) { //id 넣기(set으로 시작)
		this.id = id; //this = MemberVO라는 클래스 => this.id = 클래스 아래있는 멤버변수다!!  id = id라고 하면 파라미터인 지역변수와 전역변수가 같아져서 문제생김 따라서 구분을 위해 this 사용(헷갈릴때사용)
	}
	public String getId() { //꺼낸다 => 반환이있다!
		return id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getTel() {
		return tel;
	}
}
