package java29;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JLabel;
public class date extends Thread {
	JLabel deadline;
	public date(JLabel deadline) {
		this.deadline = deadline;}
	@Override
	public void run() {
		SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss", Locale.KOREA);	 //시간 분 초에 대한 날짜 형식 지정
		for (int i = 0; i <1000; i++) {
			//현재 시간
			Date date = new Date(); //시간/분/초 추출을 위해 Date 객체 생성
			int hour = date.getHours(); //현재 시간 추출
			int minute = date.getMinutes();//현재 분 추출
			int sec =  date.getSeconds();//현재 초 추출
			try {
				Date d1 = f.parse("33:00:00"); //24시 - 현재시간 +9시(개장시간)
				Date d2 = f.parse(hour+":"+minute+":"+sec);
				long diff = Math.abs(d2.getTime() - d1.getTime());
				long h = diff/3600000;
				//long m = (diff%3600000)/600000;
				
				String h1 = Long.toString(h);//MainThread에서 라벨부분에 출력을 위해서 String형태로 변경 해줘야한다.
				//String m1 = Long.toString(m);
				deadline.setText(h1+"시간");
			} catch (ParseException e1) {
			}
			//deadline.setText(hour+":"+minute+":"+sec);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
