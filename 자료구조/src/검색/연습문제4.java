package 검색;

import java.util.Scanner;

public class 연습문제4 {
	static public void binarysearch(int[] a, int num, int key) {
		int startIndex = 0; // 시작인덱스
		int endIndex = num - 1; // 끝인덱스
		int centerIndex = (startIndex + endIndex) / 2; // 중앙인덱스
		int count = 0;
		System.out.print("   |");
		for (int i = 0; i < num; i++) {
			System.out.printf("%3d", i);
		}
		System.out.printf("\n---+");
		for (int i = 0; i < num; i++) {
			System.out.printf("---");
		}
		System.out.println("");
		do {
			centerIndex = (startIndex + endIndex) / 2; // 중앙요소의 index
			System.out.print("   |");
			//<- + -> 찍어주기
			for (int i = 0; i < a.length; i++) {
				if(i == startIndex) 
					System.out.print(" <-");
				else if(i == centerIndex) 
					System.out.print("  +");
				else if(i ==endIndex) 
					System.out.print(" ->");
				else 
					System.out.print("   ");
			}
			System.out.println("");
			System.out.printf("%3d|", count);
			for (int i = 0; i < num; i++)
				System.out.printf("%3d", a[i]);
			System.out.println("");
			
			if (a[centerIndex] == key)
				break;
			else if (a[centerIndex] < key)
				startIndex = centerIndex + 1; // 검색범위를 뒤쪽 절반으로 좁힘
			else
				endIndex = centerIndex - 1; // 검색범위를 앞쪽 절반으로 좁힘
			count++;
		} while (startIndex <= endIndex);
		System.out.println(key + "은 x[" + count + "]에 있습니다.");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소수: ");
		int num = sc.nextInt();
		int[] a = new int[num];

		System.out.print("a[0] = ");
		a[0] = sc.nextInt();
		for (int i = 1; i < a.length; i++) { // 오름차순으로 입력값 받음
			do {
				System.out.print("a[" + i + "] = ");
				a[i] = sc.nextInt();
			} while (a[i] < a[i - 1]);
		}
		System.out.print("찾고자 하는 키값: ");
		int key = sc.nextInt();

		binarysearch(a, num, key);

	}
}
