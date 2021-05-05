package 컬렉션;

import java.util.ArrayList;

public class 연습문제1 {
/*
 * 스키대회에서 1등이 박스키, 2등이 송스키, 3등이 김스키, 4등이 정스키
 * 2등이 반칙하여 탈락함 스키대회 시상자 목록을 프린트
 * => 순서가 있어야함!! 리스트!!
 * */
	public static void main(String[] args) {
		ArrayList rank = new ArrayList(); //순서/순위가 중요하기 때문에 ArrayList 사용
		rank.add("박스키"); //자료들 입력
		rank.add("송스키");
		rank.add("김스키");
		rank.add("정스키");
		System.out.println(rank);
		
		//출력
		for (int i = 0; i < rank.size(); i++) {
			System.out.print((i+1)+"등:"+rank.get(i)+ "  ");
		}
		System.out.println("");
		
		rank.remove(1);//반칙으로 탈락된 2등 송스키 삭제
		//출력
		for (int i = 0; i < rank.size(); i++) {
			System.out.print((i+1)+"등:"+rank.get(i)+ "  ");
		}
	}
}
