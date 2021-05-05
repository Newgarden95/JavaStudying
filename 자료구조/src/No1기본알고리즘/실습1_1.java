package No1기본알고리즘;

import java.util.Scanner;

public class 실습1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 정수의 최댓값을 구합니다.");

		System.out.print("a의 앖은: ");
		int a = sc.nextInt();
		System.out.print("b의 앖은: ");
		int b = sc.nextInt();
		System.out.print("c의 앖은: ");
		int c = sc.nextInt();
		
		int max = a;
		
		if(max<b) {
			max = b;
		}else {
			max = c;
		}
		System.out.println("최댓값은 "+max+"입니다.");
	}
}
