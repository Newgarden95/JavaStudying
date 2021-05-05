package 검색;

import java.util.Arrays;
import java.util.Scanner;

public class 실습3_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요!");
		System.out.print("x[0] : ");// 첫번째 인덱스 값 입력
		x[0] = sc.nextInt();
		for (int i = 1; i < x.length; i++) {
			do {
				System.out.print("x["+i+"] : ");
				x[i] = sc.nextInt();
			}while(x[i] < x[i-1]);
		}
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		int index = Arrays.binarySearch(x, key); //Arrays클래스에서 제공하는 이진탐색함수사용
												//입력값 (배열, 키값) ~> 인덱스(성공) or 음수값(실패) 반환
		if(index<0) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println(key+"은(는) x["+index+"]에 있습니다.");
		}
	}
}
