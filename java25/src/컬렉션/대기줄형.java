package 컬렉션;

import java.util.LinkedList;

public class 대기줄형 {
	public static void main(String[] args) {
		//큐는 linkedlist 사용
		LinkedList milk = new LinkedList();
		milk.add("상한우유");
		milk.add("오늘우유");
		milk.add("내일우유");
		System.out.println(milk);
		milk.remove(); //맨 앞에거 지워줌
		System.out.println(milk);
	}
}
