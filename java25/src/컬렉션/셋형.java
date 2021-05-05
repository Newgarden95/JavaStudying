package 컬렉션;

import java.util.HashSet;

public class 셋형 {
	public static void main(String[] args) {
		//toString은 주소와 부가적 설명을 출력해주는 메서드
		HashSet bag = new HashSet(); //해쉬 셋
		bag.add("휴지");
		bag.add("볼펜");
		bag.add("휴대폰");
		bag.add("휴대폰");
		
		System.out.println(bag.size()); //중복되는 휴대폰은 하나만 들어가짐
		System.out.println(bag); //주소가 아닌 값들이 출력됨
		bag.remove("휴지"); //인덱스를 사용할 수 없음
		System.out.println(bag);
	}
}
