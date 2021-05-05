package 배열;

import java.util.Random;

//내일 100명 인기투표관련된 실습하기

/*
 랜덤한 값 1000개를 만들어보세요. 
 법위는 0~999까지의 값
 300이상의 개수
 400이상의 개수
 500이상의 개수
 600이상의 개수를 프린트
 */
public class 랜덤배열 {
	public static void main(String[] args) {
		Random r = new Random(1);
		int[] rand = new int[1000];
		for (int i = 0; i < rand.length; i++) {
			rand[i] = r.nextInt(1000);
		}
		
		for(int x : rand) {
		System.out.print(rand[x]+"\t");
		}
		
		//1.범위에 해당하는 것만 카운트할 수 있도록 조건문설정한 경우
		
		//int thr = 0;
		//int fou = 0;
		//int fif = 0;
		//int six = 0;
		
		int[] count1 = new int[4]; // 위에 주석처리한 카운트 변수를 배열을 통해 표현
		
		
		for (int i = 0; i < rand.length; i++) { // 중복은 안되지만 처음 조건문을 못들어가면 버려짐
			if (rand[i] >= 600) {
				//six++;
				count1[3]++;
			} else if (rand[i] >= 500) {
				//fif++;
				count1[2]++;
			} else if (rand[i] >= 400) {
				//fou++;
				count1[1]++;
			} else if (rand[i] >= 300) {
				//thr++;
				count1[0]++;
			}
		}
		System.out.println("=======================");
		//System.out.println("300이상: " + thr + "개");
		//System.out.println("400이상: " + fou + "개");
		//System.out.println("500이상: " + fif + "개");
		//System.out.println("600이상: " + six + "개");
		System.out.println("300이상: " + count1[0] + "개");
		System.out.println("400이상: " + count1[1] + "개");
		System.out.println("500이상: " + count1[2] + "개");
		System.out.println("600이상: " + count1[3] + "개");

		 
		//2.if문에서 break의 기능을 확인할 수 있는 부분 즉, 낮은 범위 부터 조건을 시작하면 카운트 그 이상의 범위에서 카운트가 불가하도록 조건문 설정
		int c3 = 0;
		int c4 = 0;
		int c5 = 0;
		int c6 = 0;

		for (int i = 0; i < rand.length; i++) {
			if (rand[i] >= 300) { //  600이라는 숫자가 입력되면 if문을 통과후 조건이 맞는 else if 문에도 걸릴거 같지만 if문에서 break걸려서 나감
				c3++; // 415를 생각해도 300이상이라 if문에 걸린 경우 만족하고 break.
			} else if (rand[i] >= 400) {
				c4++;
			} else if (rand[i] >= 500) {
				c5++;
			} else if (rand[i] >= 600) {
				c6++;
			}
		}
		System.out.println("=======================");
		System.out.println("300이상: " + c3 + "개"); // 중복될거 같지만 안됨 왜냐면 if문에 만족하면 if문 내부 동작을 하고 자체 break라서
		System.out.println("400이상: " + c4 + "개");
		System.out.println("500이상: " + c5 + "개");
		System.out.println("600이상: " + c6 + "개");

		//3. 300이상의 값들이 "독립적"으로 조건문에 걸리도록 설정
		int c300 = 0;
		int c400 = 0;
		int c500 = 0;
		int c600 = 0;

		for (int i = 0; i < rand.length; i++) { 
			if (rand[i] >= 300) { // 각 if문을 통해 300 이상에 해당하는 값에 대해서는 다 카운트 => 1등
				c300++;
			}
			if (rand[i] >= 400) { // 각 if문을 통해 400 이상에 해당하는 값에 대해서는 다 카운트 => 2등
				c400++;
			}
			if (rand[i] >= 500) { // 각 if문을 통해 500 이상에 해당하는 값에 대해서는 다 카운트=> 3등
				c500++;
			}
			if (rand[i] >= 600) { // 각 if문을 통해 600 이상에 해당하는 값에 대해서는 다 카운트=> 4등
				c600++;
			}
		}
		System.out.println("=======================");
		System.out.println("300이상: " + c300 + "개");
		System.out.println("400이상: " + c400 + "개");
		System.out.println("500이상: " + c500 + "개");
		System.out.println("600이상: " + c600 + "개");
	}
}
