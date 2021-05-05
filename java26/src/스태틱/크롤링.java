package 스태틱;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 크롤링 {

	public static void main(String[] args) throws Exception {
		Connection con = Jsoup.connect("https://movie.naver.com/movie/running/current.nhn");
		Document doc = con.get(); 
		
		Elements title = doc.select("dt.tit a"); //dt.tit태그 안에 있는 a태그  Elements~> 배열리스트랑 같은 의미
		System.out.println(title.size());
		for (int i = 0; i < title.size(); i++) {
			System.out.println(title.get(i).text()); //.get()메서드를 통해 전체 가져오기 , .text()를 통해 텍스트만 가져옴
		}
	}
}
