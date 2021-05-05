package 컬렉션;

import java.util.HashMap;

public class 맵형 {
	public static void main(String[] args) {
		HashMap dic = new HashMap(); //파이썬의 딕셔너리와 비슷   key와 value로 이루워진 컬렉션(원하는 타입 + 유동적인 길이)
		dic.put("사과", "apple");
		dic.put("바나나", "banana");
		dic.put("연필", "pencil");
		
		System.out.println(dic);
		System.out.println(dic.size());
		System.out.println(dic.get("사과"));
	}
}
