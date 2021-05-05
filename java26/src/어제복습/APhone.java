package 어제복습;

public class APhone { //4byte
	//멤버변수(전역변수) , 자동초기화
	String color; //4byte
	int size; //4byte
	
	public APhone(String color, int size) {
		//this : 해당 클래스를 의미
		//this.colr : 해당 클래스밑에 바로 선언된 color를 의미
		//this로 전역변수를 지정할 수 있다.
		//변수명이 전역/지역이 동일할 떄 전역변수를 지정할 목적으로 사용
		this.color = color; 
		this.size = size;
	}
	
	public void internet() {
		System.out.println("인터넷하다");
	}
	public void text() {
		System.out.println("문자하다");
	}
	@Override //재정의, 오버라이드 => 원래 부모클래스(Object)가 있어서 APhone이라는 클래스 만들어지면 받는 메서드가 있음 그 중 하나가 toString
	public String toString() {
		return "APhone [color=" + color + ", size=" + size + "]";
	}
	
	
}
