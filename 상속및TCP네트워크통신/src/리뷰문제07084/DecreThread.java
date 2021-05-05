package 리뷰문제07084;

public class DecreThread extends Thread{//스레드 상속받음
	@Override
	public void run() { //스레드 실행시 수행되는 것
		for (int i = 999; i >= 0; i--) {
			System.out.println("감소: "+i); //999에서 -1씩 감소
		}
	}
}
