package 컬렉션;

import java.util.ArrayList;

public class 리스트형 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); //toString이 오버라이딩 되어있어서 변수명을 출력해도 주소가 아닌 값들이 나옴
		//ArrayList(컬렉션) : 순서가 의미있는 데이터들의 모음
		list.add("먹기");
		list.add("마시기");
		list.add("운동");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+ ":" +list.get(i));
		}
		
		//for - each
		for(Object x : list) {
			System.out.println(x);
		}
		System.out.println(list); //arraylist 특징
		list.remove(0);
		System.out.println(list);
		list.add(1, "먹기"); //원하는 위치에 추가하기
		System.out.println(list);
		
	}
}
