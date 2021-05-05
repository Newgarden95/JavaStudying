package 배열복습;

import java.util.Random;

public class 배열사용1 {

	public static void main(String[] args) {
		//배열을 사용하는 경우
		//1. 배열을 만드는 순간 데이터를 모르는 경우(뭐가 들어갈지)
		//=> 일단 공간을 만들어두었다가 나중에 넣는다.
		int[] num = new int[5];
		Random r = new Random(42); //Random 이란 틀을 찍음(new) r이라는 공간에는 
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100); //0~99까지
		}
		//2. 배열을 만드는 순간 데이터를 아는 경우
		//=> 배열을 생성할 때 바로 데이터를 넣는다.
		int[] num2 = {10,20,30,40,50}; //기본형변수(정수) 5개의 공간 할당  num2는 5개의 데이터가 들어있는 배열의 주소
									   // num2와 5개 정수가 있는 공간은 ram 에서 떨어져있기 때문에 
									   // 정수 실수 문자 논리 (기본형) 빼고 참조형변수들은 모두 주소가 담겨져있음!!
									   // r도 참조형 변수이니까 주소를 담고있음 
		
		
	}

}
