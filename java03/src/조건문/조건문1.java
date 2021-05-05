package 조건문;

import java.util.Date;

public class 조건문1 {

	public static void main(String[] args) {
		//new 키워드를 이용해서 Date클래스에 대한 객체를 찍어냄(=Date틀에 대한 부품을 찍어냄)
		Date date = new Date();  //date라는 변수에 넣어 Ram에 저장 => 날짜와 시간에 대한 정보를 알려주는 클래스
		int hour = date.getHours(); // 무언가 얻고 싶은경우 get_____을 많이사용
		System.out.println("현재 시간은 "+hour);
		
		System.out.println("인사를 출력하세요!");
		
		if (hour <= 11 ) {
			System.out.println("굿모닝!");
		}
		else if ( hour <= 16) {
			System.out.println("굿에프터눈!");
		}
		else if ( hour <= 22) {
			System.out.println("굿이브닝!");
		}
		else {
			System.out.println("굿나잇!");
		}
		
	}

}
