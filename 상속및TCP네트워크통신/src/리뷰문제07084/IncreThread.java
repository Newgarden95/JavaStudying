package 리뷰문제07084;

public class IncreThread extends Thread{//스레드 상속받음
	@Override
	public void run() {//스레드 실행시 수행되는 것
		for (int i = 0; i < 1000; i++) {
			System.out.println("증가: "+i); //1씩 증가하면서 출력
		}
	}
}
