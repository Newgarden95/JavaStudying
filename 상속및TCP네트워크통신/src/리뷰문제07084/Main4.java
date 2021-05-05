package 리뷰문제07084;

public class Main4 {
	public static void main(String[] args) {
		IncreThread it = new IncreThread(); //스레드 객체 생성
		DecreThread dt = new DecreThread(); //스레드 객체 생성
		
		it.start(); //스레드 설정
		dt.start(); //스레드 설정
	}
}
