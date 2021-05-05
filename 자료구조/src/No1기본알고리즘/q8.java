package No1기본알고리즘;

import java.util.Scanner;

public class q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + (double)(n+1)/2;
		}
		System.out.println(sum);
	}
}
