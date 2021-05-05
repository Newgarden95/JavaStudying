package 스레드연습;

import javax.swing.JLabel;

public class CountThread extends Thread{
	JLabel count; //전역변수
	
	public CountThread(JLabel count) { //jframe 클래스에서 찍을 변수를 받아와야함
		this.count = count;
		//run();
	}
	@Override
	public void run() { 
		for (int i = 100; i >= 0; i--) {
			count.setText("count: " + i); //외부클래스에 있는 count라는 라벨에 찍겠다
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
