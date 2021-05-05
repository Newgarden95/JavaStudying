package 그래픽;

import java.util.Date;

public class 날짜스레드 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Date date = new Date();
			System.out.println("날짜: "+date);
			try {
				Thread.sleep(1000); //1초에 1번 실행
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
