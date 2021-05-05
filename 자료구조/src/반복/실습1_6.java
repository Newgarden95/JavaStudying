package 반복;

import java.util.Scanner;

public class 실습1_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		int n = 0;
		
		do {
			System.out.print("n의 값");
			n = sc.nextInt();
		}while(n<=0); //양수가 나올때 까지 무한 루프
		
		int sum = 0;
		
		for(int i = 0; i<=n; i++) {
			sum+=i;
		}
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
	}
}
