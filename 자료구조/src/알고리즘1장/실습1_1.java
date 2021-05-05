package 알고리즘1장;

import java.util.Scanner;

public class 실습1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //입력을 위한 스캐너 객체 생성
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값: ");
		int a = sc.nextInt();
		System.out.print("b의 값: ");
		int b = sc.nextInt();
		System.out.print("c의 값: ");
		int c = sc.nextInt();
		
		int max = a;
		
		/* if ~ else if 를 사용하지 못하는 이유 : 앞에 조건을 만족해버리면 다음 조건을 안보고 종료!!
		 * 															하지만, b와 c 두개 모두 비교를 해줘야함!!
		if(b>max) {
			max = b;
		}
		else if(c>max) {
			max = c;
		}
		else {
			max = a;
		}*/
		
		if(b>max) {
			max = b;
		}
		if(c>max) {
			max = c;
		}
		
		System.out.println("최대값은 "+max+"입니다.");
	}
}
