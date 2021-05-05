package 스태틱;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버크롤링 {
// Jsoup은 HTML을 파싱해주는 라이브러리
// 파싱 : 내가 원하는대로 데이터를 가공/변환해주는 것
// HTML 파싱 : HTML 소스를 얻어온 후 내가 원하는 부분만 추출하는 목적으로 사용
	public static void main(String[] args) throws Exception {
		/*
		//Document doc = Jsoup.connect("www.naver.com").get(); // 스태틱 메소드 : Jsoup.connect("www.naver.com"), get : Document메서드
		
		//1. 사이트에 연결하기
		Connection con = Jsoup.connect("http://www.naver.com");
		
		//2. 연결한 사이트에 html문서를 받아오기
		Document doc = con.get();
		//System.out.println(doc);
		Elements anav = doc.select("a.nav"); //Elements = arraylist
		System.out.println(anav.size());
		for(Element e : anav) {
			System.out.println(e.text());
		}
		*/
	
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=007570");
		Document doc = con.get(); //Document : 페이지 전체 소스 저장하는 객체
		Elements spancode = doc.select("span.code");

		for(Element e: spancode) {
			System.out.println(e.text());//.split(" ")[0] : 여러개 일때 공백을 통해 스플릿하면 배열로 저장됨 ~> 1번째 인덱스에 해당하는것  
		}
	}
}
