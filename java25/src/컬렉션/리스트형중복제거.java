package 컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class 리스트형중복제거 {
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList list = new ArrayList();
		
		for (int i = 0; i < 5000; i++) {
			//5000개의 랜덤한 값을 넣어서
			list.add(r.nextInt(5000)+1); //리스트에 랜덤값들 넣어주기
		}
		System.out.println(list);//중복제거 이전 확인
		
		//중복제거해서 프린트
		HashSet set = new HashSet(); //중복제거를 위한 hashset 설정
		for (int i = 0; i < list.size(); i++) {
			set.add(list.get(i));
		}
		//개수가 몇 개 인지 세어보세요.
		System.out.println("목록의 개수: "+set.size());
	}
}
