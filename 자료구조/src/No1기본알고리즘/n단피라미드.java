package No1기본알고리즘;

import java.util.Scanner;

public class n단피라미드 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) { // 큰틀: 행에 대한 반복
			//각 행안에서의 반복
			for (int j = 1; j <= num-i; j++) {//공백 찍어주기 
				System.out.print(" ");
			}
			for (int j = 1; j <= (i*2)-1; j++) {//별찍어주기& 숫자찍어주기
				System.out.print(i);
			}
			//for (int j = 1; j <= num-i; j++) {//공백찍어주기
			//	System.out.print(" ");
			//}
			System.out.println();
		}
	}
}

