package 반복;

import java.util.Scanner;

public class 연습문제9 {
	
	static int sumof(int a, int b) {
		int count =0 ;
		int sum = 0;
		for(count = a ; a<=b; a++) {
			sum+=a;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int a = sc.nextInt();
		System.out.print("정수 입력: ");
		int b = sc.nextInt();
		
		System.out.println("a와 b를 포함한 사이값의 합은: "+sumof(a,b));
	}
}
