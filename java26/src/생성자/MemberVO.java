package 생성자;

//전달할 때 각 값들을 따로 보내는 것보다
//가방을 하나 만들어서 
//값을 넣은 다음에 전달하는 것이 더 효율적/편하다.
public class MemberVO {
	//가방안에 변수들로 공간을 만들어둔다.
	String id;
	String pw;
	String name;
	String tel;
	
	//값을 넣고 뺄때는 변수 하나씩 기능을 처리한다.
	//각 변수마다 넣는 기능, 꺼내는 기능이 필요하다.
	//기능은 메서드로 구현
	//setters, getters
	//source메뉴에서 자동 생성
	public void setId(String id) {
		this.id = id;
		//this: 이 클래스=>MemberVO
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
