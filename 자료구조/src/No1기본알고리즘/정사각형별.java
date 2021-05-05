package No1기본알고리즘;

import java.util.Scanner;

public class 정사각형별 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사각형을 출력합니다.");
		System.out.print("단 수: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <=i ; j++) { 
				System.out.print("*");
			}System.out.println();
		}
	}
	
	
}
