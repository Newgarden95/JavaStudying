package 클래스사용;

import 클래스만들기.계좌;

public class 계좌사용 {
	public static void main(String[] args) {
		계좌 c1 = new 계좌();
		계좌 c2 = new 계좌();
		계좌 c3 = new 계좌();
		
		c1.name = "신화원";
		c1.type = "예금통장";
		c1.price = 100;

		c2.name = "홍길동";
		c2.type = "예금통장";
		c2.price = 1000;
		
		c3.name = "김길동";
		c3.type = "예금통장";
		c3.price = 300;
		
		System.out.println("c1고객의 정보");
		System.out.println(c1);
		c1.예금하다(c1.name, c1.type, c1.price);
		c1.예금하다(c1.name, c1.price);
		c1.출금하다(c1.price);
		System.out.println("========================================");
		
		System.out.println("c2고객의 정보");
		System.out.println(c2);
		c2.예금하다(c2.name, c2.type, c2.price);
		c2.예금하다(c2.name, c2.price);
		c2.출금하다(c2.price);
		System.out.println("========================================");
		
		System.out.println("c3고객의 정보");
		System.out.println(c3);
		c3.예금하다(c3.name, c3.type, c3.price);
		c3.예금하다(c3.name, c3.price);
		c3.출금하다(c3.price);
		
	}
}
