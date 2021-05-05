package 클래스연습;

public class 계산기 {
	//메서드(기능) 중심!
	public void add(int a, int b) {
		//메서드의 입력값이 있는 경우, 입력되는 값의 타입과 수에 따라 변수를 만들어주어야함
		//전달되는 값을 받아서 저장해두었다가 꺼내서 계산할 수 있다.
		System.out.println("계산기로 더하다.");
		int sum = a+b;
		System.out.println(sum);
	}
	public void minus(int a, int b) {
		//a, b를 중간에 값을 전달받은 변수 => 매개변수(parameter)
		//전달받은 값이 2개이면, 매개변수 2개를 만들어야한다.
		//전달받은 값이 순서대로 매개변수에 저장됨
		//이렇게 저장된 값을 가지고 메서드내에서 처리하게 됨.
		//매개변수는 개수, 타입, 순서가 모두 맞아야 인식 가능하다!!
		//입력값이 다르면 같은 이름이라도 다른 메서드
		int sum = 0;
		
		if (a>=b) {
			sum = a - b;
		}
		else if( a < b) {
			sum = b - a;
		}
		System.out.println("계산기로 뺴다.");
		System.out.println("계산결과: "+sum);
	}
	public void mul() {
		System.out.println("계산기로 곱하다.");
	}
	public void div() {
		System.out.println("계산기로 나누다.");
	}
}
