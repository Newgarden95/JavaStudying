package No1기본알고리즘;

import java.util.Scanner;

public class 반복문연습문제9 {
	static int sumof(int a, int b) {
		if(a>=b) {
			int sum = 0;
			for (int i = b; i <= a; i++) {
				sum+=i;
			}
			return sum;
		}
		else {
			int sum = 0;
			for (int i = a; i <= b; i++) {
				sum+=i;
			}
			return sum;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a: ");
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		
		System.out.println("두 정수 사이의 합은 "+sumof(a,b));
	}
}
