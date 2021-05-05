package 반복;

import java.util.Scanner;

public class 연습문재8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값：");
		int n = sc.nextInt();

		double sum = n*(n+1)/2;

		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}
}	
