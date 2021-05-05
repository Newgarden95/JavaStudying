package java29;


import java.io.IOException;

import javax.swing.JLabel;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Nasdaq extends Thread {
	static Elements nasdaq;//왜 전역변수 설정할때 스태틱해야지
	static Elements nasdaq1;
	JLabel kos;
	
	public Nasdaq(JLabel kos) {
		this.kos = kos;
	}
	
	@Override
	public void run() {
		Connection con = Jsoup.connect("https://finance.naver.com/world/sise.nhn?symbol=NAS@IXIC");
		Document doc;
		try {
			doc = con.get();
			nasdaq = doc.select("#content > div.rate_info > div.today > p.no_today");
			System.out.println(nasdaq.get(0).text());
			nasdaq1 = doc.select("span#KOSPI_change.num_s.num_s2 ");
			for (int i = 0; i < 500; i++) {
				kos.setText(nasdaq.get(0).text());;//나스닥 지수
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

