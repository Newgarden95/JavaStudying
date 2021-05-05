package 상속;
//사람을 상속받아 만듬
public class 맨 extends 사람{
	//extends: 확장하다.
	//사람클래스를 확장해서 맨을 만들겠다.
	//멤버변수 2개, 멤버메서드1개를 갖고 생성됨
	
	int speed;// 속도
	
	public void 달리다() {
		System.out.println("빨리 달리다.");
	}
}

