package 어제복습;

public class BPhone사용 {
	public static void main(String[] args) {
		APhone p1 = new APhone("빨강",10);
		//p1.color = "빨강";
		//p1.size = 10;
		p1.internet();
		p1.text();
		System.out.println(p1);
		
		APhone p2 = new APhone("파랑",20);
		//p2.color = "파랑";
		//p2.size = 20;
		
		//멤버변수를 반복적으로 써 -> 생성자 생성 어때?
	}
}
