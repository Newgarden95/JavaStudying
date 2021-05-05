package pack04;

public class Computer { 
	//멤버변수
	int price;
	String color;
	String company;
	
	//Computer 클래스의 생성자
	public Computer(int price, String color, String company) {
		this.price = price;
		this.color = color;
		this.company = company;
	}
	//on메서드
	public void on() {
		System.out.println("컴퓨터를 킵니다.");
	}
	//off메서드
	public void off() {
		System.out.println("컴퓨터를 끕니다.");
	}
	@Override
	public String toString() {
		return "Computer [price=" + price + ", color=" + color + ", company=" + company + "]";
	}
}
