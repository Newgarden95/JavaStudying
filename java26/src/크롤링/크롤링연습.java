package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습 {
	public static void main(String[] args) throws Exception {
		Connection con = Jsoup.connect("https://www.youtube.com/");
		Document doc = con.get(); //HTML 전체 코드를 받아온 상태
		Elements apt = doc.select("#text > a");
		
		System.out.println(apt);
		
	}
}
