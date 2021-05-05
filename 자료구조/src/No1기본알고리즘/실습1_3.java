package No1기본알고리즘;

import java.util.Scanner;

public class 실습1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("정수를 입력하세요: ");
			int num = sc.nextInt();
		
			if(num ==1212) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			else {
				if(num>0) {
					System.out.println(" 이 수는 양수입니다.");
					System.out.println("============");
				}
				else if(num==0) {
					System.out.println("이 수는 0입니다.");
					System.out.println("============");
				}else {
					System.out.println("이 수는 음수입니다.");
					System.out.println("============");
				}
			}
		}
	}
}
