package 알고리즘1장;

import java.util.Scanner;

public class 실습1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요: ");
		int n = sc.nextInt();
		
//		3가지로 분기
		if(n > 0)
			System.out.println("이 수는 양수입니다");
		else if(n<0)
			System.out.println("이 수는 음수입니다");
		else 
			System.out.println("이 수는 0입니다");
	}
}
