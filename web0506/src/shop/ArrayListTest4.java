package shop;

import java.util.ArrayList;

public class ArrayListTest4 {

	public static void main(String[] args) {
		ArrayList<MemberVO> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			// 가방을 만들어서
			MemberVO bag = new MemberVO();
			// 가방에 값들을 넣은 다음에
			// 0-->"0"
			bag.setId(String.valueOf(i));
			bag.setPw(i + "");
			bag.setName(i + "");
			bag.setTel(i + "");
			// list에 넣음.
			list.add(bag);
		}
		System.out.println("리스트의 가방 개수는 " + list.size() + "개");
		
		for (int i = 0; i < list.size(); i++) {
			//컨테이너에서 순서대로 가방을 꺼내줌.
			MemberVO bag2 = list.get(i);
			//가방에 들어있는 값들을 하나씩 꺼내줌.
			System.out.println("가방에서 꺼낸 id는 " + bag2.getId());
			System.out.println("가방에서 꺼낸 pw는 " + bag2.getPw());
			System.out.println("가방에서 꺼낸 name은 " + bag2.getName());
			System.out.println("가방에서 꺼낸 tel은 " + bag2.getTel());
		}
		
	
	}

}
