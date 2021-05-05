package No1기본알고리즘;

import java.util.Scanner;

public class 반복실습4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다");
		System.out.print("n의 값: ");
		int num = sc.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum+=i;
		}
		System.out.println("1부터 "+num+"까지의 합은 "+sum+"입니다.");
	}
}
