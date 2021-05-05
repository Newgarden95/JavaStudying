package shop;

import java.util.Date;

public class 계산기 {
	
	public int getHour() {
		Date date = new Date();
		int result = date.getHours();//12
		return result;
	}
	
	// add(200,100)
	public int add(int x, int y) {
		//메서드안에서 선언된 변수는 메서드 안에서만 사용 가능
		//메서드 범위 지역안에서만 사용 가능
		//지역변수, 로컬변수<-->전역변수, 글로벌변수
		//자동초기화X         자동초기화O
		int result = x + y;
		System.out.println(result);
		return result;
	}

	public int minus(int x, int y) {
		int result = x - y;
		System.out.println(result);
		return result;
	}

	public int mul(int x, int y) {
		int result = x * y;
		//System.out.println("곱한 값은 " + result);
		return result; //return은 맨 끝줄에!
	}

	public int div(int x, int y) {
		int result = x / y;
		System.out.println(result);
		return result;
	}

}
