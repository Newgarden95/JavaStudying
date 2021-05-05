package No1기본알고리즘;

import java.util.Scanner;

public class 실습1_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값: ");
		int num = sc.nextInt();
		int i = 1;
		int sum = 0;
		while(i<=num) {
			sum+=i;
			i++;
		}
		System.out.println("1부터 "+num+"까지의 합은 "+sum+"입니다.");
	}
}
