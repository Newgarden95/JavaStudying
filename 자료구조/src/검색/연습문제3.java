package 검색;

import java.util.Arrays;
import java.util.Scanner;

public class 연습문제3 {

	static void searchIdx(int[] a, int num, int key, int[] idx) {
		int index = 0; // 키값에 해당하는 인덱스를 저장할 변수
		int count = 0; // 키값에 해당하는 인덱스가 몇개인지 카운트하기 위한 변수
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) { // 배열에 키값에 해당하는게 있는 경우
				index = i; // 해당 인덱스를 저장
				idx[count] = index;// idx라는 새로운 배열에 입력
				count++; // 카운트
			}
		}
		int[] idxNew = new int[count]; // 키값을 발견된 것만큼 길이로하여 배열 생성
		for (int i = 0; i < count; i++) {
			idxNew[i] = idx[i]; // idx에 저장된 key에 해당하는 인덱스를 새로운 배열에 넣어주기
		}
		System.out.println(Arrays.toString(idxNew)); // 배열 출력
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수: ");
		int num = sc.nextInt();

		System.out.print("키값: ");
		int key = sc.nextInt();

		int[] a = new int[num];
		int[] idx = new int[num];
		for (int i = 0; i < a.length; i++) {
			System.out.print("x[" + i + "]: ");
			a[i] = sc.nextInt();
		}
		searchIdx(a, num, key, idx);
	}
}
