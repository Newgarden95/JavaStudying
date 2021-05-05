package 순차문;

import java.util.Scanner;

public class 순차문연습문제2 {

	public static void main(String[] args) {
		int score = 88; //정수형 변수인 score에 점수 88점을 초기값으로 초기화
		
		
		/*
		 위에 초기값인 88점과 아래 조건문을 순차적으로 비교하여 학점을 출력한다.
		 */
		if (score >= 90) {
			System.out.println("학점은 A입니다.");
		} else if (score >= 80) {
			System.out.println("학점은 B입니다.");
		} else if (score >= 70) {
			System.out.println("학점은 C입니다.");
		} else {
			System.out.println("학점은 D입니다.");
		}
	}

}
