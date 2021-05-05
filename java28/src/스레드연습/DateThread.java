package 스레드연습;

import java.util.Date;

import javax.swing.JLabel;

public class DateThread extends Thread{
	JLabel date;
	
	public DateThread(JLabel date) {
		this.date = date;
		//run();
	}
	@Override
	public void run() {
		for (int i = 0; i <1000; i++) {
			Date date1 = new Date();
			date.setText("date: " + date1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		
	}
}
