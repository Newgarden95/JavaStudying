package 반복;

import java.util.Scanner;

public class 실습1_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값: ");
		int n = sc.nextInt();
		
		int sum = 0; //더한 결과를 담을 변수
		int i = 1;
		
		while(i <= n) {
			sum+=i; //더한값 누적
			i++;
		}
		System.out.println("1부터 "+n+"까지의 합은"+sum+"입니다");
		System.out.println("i: "+i);
	}
}
