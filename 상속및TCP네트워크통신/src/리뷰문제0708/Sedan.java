package 리뷰문제0708;

public class Sedan extends Car{ //Car클래스 상속
	//가격
	int price;
	
	//생성자
	public Sedan(String company, int year, int price) {
		super(company, year);
		this.price = price;
	}
	public void pr() {
		System.out.println("세단의 가격은 " + price+"만원 입니다.");
	}
	@Override
	public String toString() {
		return "Sedan [price=" + price + "]";
	}
}
