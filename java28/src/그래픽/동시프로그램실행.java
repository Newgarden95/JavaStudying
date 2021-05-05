package 그래픽;

public class 동시프로그램실행 {
	public static void main(String[] args) {
		카운트스레드 count = new 카운트스레드();
		이미지스레드 img = new 이미지스레드();
		날짜스레드 date = new 날짜스레드();
		
		count.start();
		img.start();
		date.start();
	}

}
