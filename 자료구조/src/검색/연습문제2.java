package 검색;
import java.util.Scanner;
/*
 1. "선형검색 알고리즘"을 통해 키값이 있는 인덱스 찾기
 2.  인덱스까지 for문을 돌려 출력해준다.
 */
public class 연습문제2 {
	static void search(int[] x, int length, int key) {
		int index = 0;
		// 선형 검색
		for (int i = 0; i < length; i++) {
			if (x[i] == key) {
				index = i; // 찾는 키값이 있는 경우 인덱스 추출
				break; //break를 해줘야 for문에서 나가가게됨
			} else {
				index = length-1; // 찾는 키값이 없는 경우 인덱스는 배열길이로 추출
			}
		}
		System.out.println(index);
		System.out.print("\t|\t");
		for (int i = 0; i < length; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println("--------+---------------------------------------------------------");
		//선형검색을 통해 탐색한 index에 해당하는 만큼 for문을 돌림
		for (int i = 0; i <= index; i++) {
			System.out.print("\t|");
				for (int j = 0; j <= i; j++) {
					System.out.print("\t");
				}
				System.out.println("*");
				System.out.print("      " + i + "\t|");

				for (int j = 0; j < length; j++) {
					System.out.print("\t" + x[j]);
				}
				System.out.println("");
			}
		System.out.println(key+"은 x["+index+"]에 있습니다.");
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = { 6, 4, 3, 2, 1, 9, 8 };
		System.out.print("검색하고자 하는 키값: ");
		int key = sc.nextInt();
		search(x, x.length, key);

	}
}
