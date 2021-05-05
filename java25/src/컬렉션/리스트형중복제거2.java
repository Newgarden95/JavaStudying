package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 리스트형중복제거2 {
	public static void main(String[] args) {
		int[] arr = new int[5000];
		Random r = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(5000);
			System.out.println(i+"번째 : "+ arr[i]);
		}
		HashSet arrSet = new HashSet(); // 배열에 담긴 값들의 중복체크를 위해 배열값들을 arrSet에 넣어 확인
		System.out.println("중복제거 후");
		for (int i = 0; i < arr.length; i++) {
			arrSet.add(arr[i]);
			
		}
		System.out.println("제거 후 목록: "+arrSet);
		System.out.println("제거 후 개수"+arrSet.size());
	}
}
