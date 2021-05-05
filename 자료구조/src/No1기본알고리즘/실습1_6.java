package No1기본알고리즘;

import java.util.Scanner;

public class 실습1_6 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("1부터 n까지의 합을 구합니다.");
			int num; //전역변수
			
			//입력된 n의 값이 양의 정수가 나올 때 까지 반복해야함!! -> 우선 한 번 실행하고 반복!! do-while
			do {
				System.out.print("n의 값: ");
				num = sc.nextInt();
			}while(num<=0);
			
			int sum = 0;
			for (int i = 1; i<= num; i++) {
				sum += i;
			}
			System.out.println("1부터 "+num+"까지의 합은 "+sum+"입니다.");
		}

}
