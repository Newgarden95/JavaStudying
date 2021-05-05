package 컬렉션;

import java.util.LinkedList;

public class 연습문제4 {
/*
 * 냉장고에 어제, 오늘 우유를 사다 놓았음
 * 어제 우유이름은 상한우유
 * 오늘 우유이름은 싱싱우유
 * 어제의 우유를 먼저 먹음
 * 현재 남은 우유 이름을 프린트! => 선입선출(FIFO) ~ Queue
 * */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("상한우유");
		list.add("싱싱우유");
		
		list.remove(); //먼저 들어온거 제거
		System.out.println(list);
	}
}
