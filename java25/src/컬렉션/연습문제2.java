package 컬렉션;

import java.util.HashMap;

public class 연습문제2 {
/*
 * 휴대폰 단축키 1번은 엄마, 2번은 아빠, 3번은 친구, 4번은 동생
 * 휴대폰 2번은 누구인가? 프린트 하여라
 * => 키에 해당하는 값이 있어야함 -> map사용
 * */
	public static void main(String[] args) {
		HashMap num = new HashMap(); //키에 해당하는 값이 있어야한다 => map사용
		
		//데이터 입력
		num.put("1번", "엄마");
		num.put("2번", "아빠");
		num.put("3번", "친구");
		num.put("4번", "동생");
		
		//전체 데이터 확인
		System.out.println(num);
		//2번 단축키에 해당하는 값 확인
		System.out.println(num.get("2번"));
	}
}
