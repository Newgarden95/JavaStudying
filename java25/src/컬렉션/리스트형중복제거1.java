package 컬렉션;

import java.util.HashSet;

public class 리스트형중복제거1 {
	public static void main(String[] args) {
		String[] food = {"감자","고구마","양파","감자","고구마"};//중복제거
		
		HashSet foodSet = new HashSet(); //중복제거를 위해 foodSet 생성
		//foodSet.add(food); //이런식으로 하면 안됨 food라는 배열 내부에 있는 값들을 비교해야지 배열 주소를 넣어주는건 의미 x
		for (int i = 0; i < food.length; i++) {
			foodSet.add(food[i]); //foodSet에 food 배열에 있는 값들을 넣어 중복 확인 후 제거
		}
		System.out.println(foodSet);
	}
}
