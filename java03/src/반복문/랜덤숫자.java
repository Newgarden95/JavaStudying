package 반복문;

import java.util.Random;

public class 랜덤숫자 {

	public static void main(String[] args) {
		Random r = new Random(); //랜덤객체 생성
		int num = r.nextInt(100); //num이라는 정수형 변수에  0~99까지 난수 생성된 걸 저장
		System.out.println(num);
	}

}
