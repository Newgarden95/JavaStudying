package 클래스만들기;

public class 계좌 {
	public String name;
	public String type;
	public int price;
	
	public void 예금하다(String name, String type, int price) {
		System.out.println("이름: "+name+", 통장타입: "+type+", 금액: "+price);
	}
	public void 예금하다(String name, int price) {
		System.out.println("이름: "+name+", 금액: "+price);
	}
	public void 출금하다(int price) {
		System.out.println("출금금액: "+price);
	}
	
	@Override//계좌 객체의 주소가 아닌 객체내 변수들을 출력해줌
	public String toString() {
		return "계좌 [name=" + name + ", type=" + type + ", price=" + price + "]";
	}
	
	
	
	
}
