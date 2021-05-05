package 검색;

import java.util.Scanner;

//이진검색
public class 연습문제5 {
	
	static public int binarysearch(int[] a, int num, int key) {
		int startIndex = 0; //시작인덱스
		int endIndex = num-1; //끝인덱스
		int centerIndex = (startIndex+endIndex)/2; //중앙인덱스
		int count = 0;
		
		while(startIndex <= endIndex) { //종료조건
			if(a[centerIndex] == key) { //중앙값이 키값과 같은경우
				for (int i = 0; i < centerIndex; i++) { 
					if(a[i] == key) { //인덱스가 0번째 부터 중앙에서의 요솟값 이전까지 키값과 비교
						return i; //처음으로 나오는 인덱스 리턴
					}
				}return centerIndex; //line 17에서 조건을 만족하는 경우가 없는경우
									//즉, 키값과 일치하는 값이 1개만 있는 경우 중앙인덱스 리턴
			}
			else if (a[centerIndex] < key)
				startIndex = centerIndex + 1; // 검색범위를 뒤쪽 절반으로 좁힘
			else
				endIndex = centerIndex - 1; // 검색범위를 앞쪽 절반으로 좁힘
			centerIndex = (startIndex + endIndex)/2;
		}return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소수: ");
		int num = sc.nextInt();
		int[] a = new int[num];
		
		System.out.print("a[0] = ");
		a[0] = sc.nextInt();
		for (int i = 1; i < a.length; i++) { //오름차순으로 입력값 받음
			do {
				System.out.print("a["+i+"] = ");
				a[i] = sc.nextInt();
			}while(a[i]<a[i-1]);
		}
		System.out.print("찾고자 하는 키값: ");
		int key = sc.nextInt();
		
		int b = binarysearch(a, num, key);
		if( b == -1) {
			System.out.println("찾는 키값을 검색 할 수 없습니다,");
		}
		else {
			System.out.println("key값을 갖는 요소중 맨 앞의 인덱스는 a["+b+"]에 위치");
		}
	
	}
}
