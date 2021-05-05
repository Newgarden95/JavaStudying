package 인터페이스;

public class CookManger {
//연관관계를 갖는 클래스
//다른 객체의 참조를 가지는 필드
//현재 인터페이스인 Icook과 연관관계
	//Icook icook = new Icook(); ~> 인터페이스는 객체생성 불가!!
	Icook icook;
	
	public CookManger(Icook icook) { //생성자
		// TODO Auto-generated constructor stub
		this.icook = icook;
	}
	
	public void SetIcook(Icook icook) {
		
	}

	public void orderRice() {
		
	}
	
	public void orderSoup() {
		
	}
}
