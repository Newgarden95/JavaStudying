package pack02;

import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
		Random random = new Random();//난수생성을 위해 random 객체 선언&생성
		random.setSeed(1); //시드 설정
		int[] a = new int[10]; //길이가 10인 배열 생성
		
		int sum = 0; //10개의 배열값들을 더하기 위해 sum값 0으로 초기화
		for (int i = 0; i < a.length; i++) { //배열 길이만큼 for문
			a[i] = random.nextInt(10); //각 인덱스마다 랜덤한 숫자 대입
			System.out.print(a[i] + " "); //출력
			sum+=a[i]; //각 랜덤값들을 더하기
		}
		System.out.println();
		System.out.println("배열에 저장된 모든 난수를 더한 평균값은: " + (double)sum/a.length); //평균
		
	}
	
}
