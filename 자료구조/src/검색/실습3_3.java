package 검색;

import java.util.Scanner;

//보초법
public class 실습3_3 {
	static int seqSearchSen(int[] x, int num, int key) {
		x[num] = key; // 보초생성
		int i = 0;
		
		while(true) {
			if(x[i]==key) { //x배열에 찾고자 하는 키를 발견하면
				break;
			}
			i++;
		}
		return i == num ? -1 : i; //인덱스가 보초를 넣은 인덱스 이면 -1을 그렇지 않으면 i를 반환
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num + 1]; // 보초를 넣을 수 있도록 배열 생성시 요솟수+1를 해준다.
		for (int i = 0; i < num; i++) {// 요솟수 만큼 반복
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		int index = seqSearchSen(x, num, key);
		if (index == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(key + "은(는) x[" + index + "]에 있습니다.");
		}
	}
}
