package 클래스연습;

public class 핸드폰을만들어서사용해보자 {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		//p1: 참조형 변수
		//color(참조형: string이라), type(참조형: string이라): 멤버변수가 복사됨
		//총 3개의 변수가 생성됨
		Phone p2 = new Phone();
		
		p1.color = "red"; //.의 의미는 주소를 통해 참조한다는 의미
		p2.color = "blue";
		
		p1.type = "Samsung";
		p2.type = "Apple";
		
		System.out.println("전화기 색: "+p1.color);
		System.out.println("전화기 색: "+p2.color);
		System.out.println("제조사: "+p1.type);
		System.out.println("제조사: "+p2.type);
		p1.call();
		
		
		p1.message("철수","굿모닝",10);
		p1.message("길동","굿애프터눈",15);
		p1.internet("네이버", 10, "어제");
	}
}
