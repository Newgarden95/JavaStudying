package No1기본알고리즘;

import java.util.Scanner;

public class 실습1C_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2자리의 정수를 입력하세요.");

		int num;
		do {
			System.out.print("입력: ");
			num = sc.nextInt();
		}while(num<10||num>99); //입력된 정수가 2자리가 아닌 경우 계속 반복해서 입력받음
		
		System.out.println("변수의 값은 "+num+"이 되었습니다.");
	}
}
