package java29;
import java.io.IOException;
import javax.swing.JLabel;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Kospi extends Thread {
	static Elements kospi;
	static Elements kospi1;
	JLabel kos; //JLabel 전역변수 선언
	
	public Kospi(JLabel kos) {//MainThread에서 코스피라벨에 해당하는 변수를 받아온다
		this.kos = kos;
	}
	
	@Override
	public void run() {
		try {
			Connection con = Jsoup.connect("https://finance.naver.com/sise/"); //크롤링을 위해 jsoup라이브러리 사용
			Document doc;
			doc = con.get();//위에서 지정한 페이지의 html코드를 가져옴
			kospi = doc.select("#KOSPI_now"); // 가져온 코드 중 원하는 부분 출력
			//kospi1 = doc.select("span#KOSPI_change.num_s.num_s2 ");
			for (int i = 0; i < 500; i++) {
				kos.setText(kospi.get(0).text());;//코스피 지수
				//kos.setText(kospi1.get(0).text());//코스피 등락율
			}
		} catch (IOException e1) {
		}
			try {
				Thread.sleep(4000);//4초마다 새로고침
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

