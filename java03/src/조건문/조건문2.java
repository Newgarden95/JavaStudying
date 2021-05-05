package 조건문;

import java.util.Date;
//switch-case : 조건이 많을 때 사용, 조건이 특정한 값인 경우

public class 조건문2 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth()+1; // 그냥 date.getMonth()하면 현재보다 1달 적게 나옴 따라서 +1해줌
		//2월은 28일 까지 / 4 6 9 11은 30일 / 나머지는 31일
		
		System.out.println(month);
		
		
		//if-else if 써도 되지만 switch-case문이 좀더 깔끔해보여서 사용 -> but 기능이 제한적
		// switch(변수) => 변수는 정수(int까지 4바이트), 문자, 문자열 // 실수는 사용불가
		switch(month) {
		case 2:
			System.out.println("28일까지 있음");
			break;     //break를 사용하면 case 2를 만족한 경우 출력후 switch문에서 나옴
		case 4: case 6: case 9: case 11:  //같은 결과를 같는 case문은 한줄에 써서 사용 가능
			System.out.println("30일까지 있음");
			break;
		default: //if-else문에서 else에 해당하는 부분 
			System.out.println("31일까지 있음");
			break;
		}
	}

}
