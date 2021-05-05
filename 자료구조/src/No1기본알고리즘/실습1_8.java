package No1기본알고리즘;

import java.util.Scanner;

public class 실습1_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력했습니다.");
		int num;
		
		//양의 정수를 입력받도록 설정
		do {
			System.out.print("몇 단 삼각형입니까? ");
			num = sc.nextInt();
		}while(num<0);
		
		for (int i = 1; i <= num; i++) {//행에 해당하는 반복
			for (int j = 1; j <= i; j++) {//각 행에서 몇개의 별이 찍히는지 반복
				System.out.print("*");
			}System.out.println();
		}
	}
}
