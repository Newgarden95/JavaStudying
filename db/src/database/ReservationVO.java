package database;
//VO: 계층간 데이터 교환을 위한 객체 -> DB의 데이터를 서비스나 컨트롤러 등으로 보낼 때 사용하는 객체
//VO만들기(데이터를 담아줄 가방과 같은 역할) => 가방을 하나 만들어서 값을 넣은 다음에 한 번에 넘기는게 더 효율적
//데이터 베이스로 보내기 위해 데이터를 보관해주는 부분
//source -> generate getter and setter 사용!!!

//값을 넣고 뺄때는 변수 하나씩 기능을 처리
//각 변수마다 넣는기능, 꺼내는 기능 필요
//기능은 메서드로 구현

public class ReservationVO {
	String resNo;
	String id;
    String name;
    String tel;
    String date;
    String payment;
    
    public String getresNo() {
		return resNo;
	}
	public void setresNo(String resNo) {
		this.resNo = resNo; //this = MemberVO라는 클래스 => this.id = 클래스 아래있는 멤버변수다!!  
					  //id = id라고 하면 파라미터인 지역변수와 전역변수가 같아져서 문제생김 따라서 구분을 위해 this 사용(헷갈릴때사용)
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}

    
    
}
