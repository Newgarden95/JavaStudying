package 반복;

import java.util.Scanner;

public class 연습문제10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a의 값:  ");
		int a = sc.nextInt();
		int b = 0;
		
		do {
			System.out.print("b의 값: ");
			b = sc.nextInt();
		}while(b<=a); //b가 a와 같거나 작을때 반복
		
		System.out.println("b-a는 "+(b-a)+"입니다.");
	}
}
