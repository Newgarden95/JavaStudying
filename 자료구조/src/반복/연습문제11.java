package 반복;

import java.util.Scanner;

public class 연습문제11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		do {
			System.out.println("양의 정수를 입력하세여: ");
			num = sc.nextInt();
		}while(num<0); //음수일때만 무한반복
		
		String numCount = String.valueOf(num);
		System.out.println("그 수는 "+numCount.length()+"자리 수 입니다.");
	}
}
