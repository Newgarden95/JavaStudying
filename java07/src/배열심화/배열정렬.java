package 배열심화;

import java.util.Arrays;
import java.util.Random;

public class 배열정렬 {
//데이터가 많으면 배열에 넣어라!!!
	public static void main(String[] args) {
		int[] num = new int[100];
		Random r = new Random(42);
		
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);
		}
		Arrays.sort(num); //오름차순으로 배열 정렬해줌 => 원본을 건드림 ~> 파괴함수(원본을 변경시키는것)
		for(int x: num) {
			System.out.println(x);
		}
		System.out.println("제일 큰수>>>"+num[num.length-1]); //제일 큰수를 가리키는 인덱스는 길이에서 -1 하는 것
		System.out.println("제일 작은수>>>"+num[0]);
	}
}
