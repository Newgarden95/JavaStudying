package java29;


import java.io.IOException;

import javax.swing.JLabel;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Kosdaq extends Thread {
	static Elements kosdaq;//왜 전역변수 설정할때 스태틱해야지
	static Elements kosdaq1;
	JLabel kos;
	
	public Kosdaq(JLabel kos) {
		this.kos = kos;
	}
	
	@Override
	public void run() {
		try {
			Connection con = Jsoup.connect("https://finance.naver.com/sise/");
			Document doc;
			doc = con.get();
			kosdaq = doc.select("#KOSDAQ_now");
		//	kosdaq1 = doc.select("span#KOSDAQ_change.num_s.num_s2 ");
			for (int i = 0; i < 500; i++) {
				kos.setText(kosdaq.get(0).text());;//코스닥 지수
			//	System.out.println(kosdaq.get(0).text());;//코스닥 지수
				//kos.setText(kosdaq1.get(0).text());//코스피 등락율
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

