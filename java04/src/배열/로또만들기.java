package 배열;

import java.util.Random;

public class 로또만들기 {
	public static void main(String[] args) {
		int[] lotto = new int[6]; //중복체크가 반드시 필수 => 배열대신 set에 넣기
		Random r = new Random(42); //10을 넣으므로 계속 변화하지않음 seed값을 넣으면 그 시드에 따라 고정된 랜덤값이 나옴
		//System.out.println(r.nextInt());
		
		for (int i = 0; i < lotto.length; i++) {
			//System.out.println(r.nextInt(45)+1);
			lotto[i] = r.nextInt(45)+1; // 배열에 1~45중 랜덤형태로 6번 반복해 담는다
		}
		for(int x : lotto) { 
			System.out.print(x+" ");
		}
		int count = 0;
		for (int y : lotto) {
			if(y >= 30) {
				count++;
			}
		}
		System.out.println(count);
	}
}
