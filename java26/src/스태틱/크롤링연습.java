package 스태틱;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 크롤링연습 {
	public static void main(String[] args) throws Exception {
		Connection con = Jsoup.connect("https://movie.naver.com/movie/running/current.nhn");
		Document doc = con.get(); 
		
		Elements res = doc.select("dl.info_exp div.star_t1.b_star span.num"); //dt.tit태그 안에 있는 a태그  Elements~> 배열리스트랑 같은 의미
		Elements title = doc.select("dt.tit a"); //dt.tit태그 안에 있는 a태그  Elements~> 배열리스트랑 같은 의미
		for (int i = 0; i < res.size(); i++) {
			System.out.println("영화제목: " + title.get(i).text() + "  ##### 예매율: " + res.get(i).text()+"%"); //.get()메서드를 통해 전체 가져오기 , .text()를 통해 텍스트만 가져옴
		}
	}
}
