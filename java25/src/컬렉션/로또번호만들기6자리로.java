package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 로또번호만들기6자리로 {
	public static void main(String[] args) {
		Random r = new Random();
		
		/*
		//6개 만들어 저장할 공간을 만들자.
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int num = r.nextInt(45)+1; //로또 배열에 들어갈 숫자
			//중복된 숫자가 있는지 없는지 체크
			for (int j = 0; j < lotto.length; j++) {
				if(num == lotto[j]) {
					
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i] + " ");
		}*/
		//중복 되는 일이 발생
		
		//해결책 ~ 넣기전에 있는지 체크를 통해 => set으로 한 경우 중복된건 삭제되기 때문에 6개 가아닌 5개 4개 등등 나올 수 있는 단점 => while문을 통해 확인하기!!
		/*
		HashSet lotto = new HashSet();
		for (int i = 0; i < 6; i++) {
			int num = r.nextInt(45)+1;
			System.out.println("랜덤값: "+ num);
			lotto.add(num);
		}
		System.out.println(lotto);
		*/
		HashSet lotto = new HashSet(); 
		System.out.println(lotto.size());
		while(lotto.size()<6) {
			int num = r.nextInt(45)+1;
			System.out.println("랜덤값: " + num);
			lotto.add(num);
		}
		System.out.println(lotto);
	}
}
