package 클래스연습;

public class 자동차를만들어사용해보자 {
	public static void main(String[] args) {
		Car c1 = new Car();
		//Car에 있었던 멤버변수 color가 별도로 복사됨
		c1.color = "빨강색";
		
		Car c2 = new Car();
		c2.color = "파랑색";
		
		//c1, c2는 참조형 변수로 주소가 들어있음 => 메서드 사용가능
		
		c1.run();
		c2.up();
		
	}
}
