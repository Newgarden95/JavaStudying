package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 날씨크롤링 {

	public static void main(String[] args) throws Exception {
		Connection con = Jsoup.connect("https://www.weatheri.co.kr/forecast/forecast10.php?mNum=1&sNum=8&pageNum=11");
		Document doc = con.get();
		
		Elements location = doc.select("td strong");
		
		for (int i = 8; i < location.size(); i++) {
			String location1 = location.get(i).text(); //8번쨰 인덱스 부터 지역나옴
			System.out.println(location1);
		}
		//배열을 통해 위치들을 다 넣어주고 
		Elements weather = doc.select("tr td");
		
		//System.out.println(weather.get(683).text()); 683번째 까지가 날씨관련 정보
		String[] weatherArr = new String[location.size()-8]; //지역에 해당하는 크기 만큼 
		System.out.println(weatherArr.length);
		int x = 0;
		//while문을 써줘야하는 이유는 for문으로 할 경우 인덱스 값을 원하는 것으로 못함
		while(x<location.size()-8) {
		for (int i = 41; i <= 683; i=i+7) {// 41번 부터 현재일기~46번 까지 서울 날씨 -> 48번 부터 ~ 54번 까지 다음 거 따라서 증감값을 7로 해줘야함
			/* 날씨 부분에서 서울에 해당하는 부분 날씨 가 몇번쨰 인덱스에 있는지 확인을 위해 사용
			if(weather.get(i).text().equals("서울")) {
				System.out.println(i);
			}*/
			//현재날씨에 대한 정보
			weatherArr[x] = weather.get(i).text()+"\t"+weather.get(i+1).text()+"\t"+weather.get(i+2).text()+"\t"+weather.get(i+3).text()+"\t"+weather.get(i+4).text()+"\t"+weather.get(i+5).text()+"\t";
			System.out.println( weather.get(i).text()+"\t"+weather.get(i+1).text()+"\t"+weather.get(i+2).text()+"\t"+weather.get(i+3).text()+"\t"+weather.get(i+4).text()+"\t"+weather.get(i+5).text()+"\t");
			x++;
		}
		}
	}
}
