package database;

import java.util.ArrayList;

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		for (int i = 0; i < 100 ; i++) { //디비에서 가져온 만큼 돌리려면 rs.next()를 이용해서 => while(rs.next() == true)
			//가방을 만들어서
			MemberVO bag = new MemberVO();
			//가방에 값들을 넣은 다음에
			bag.setId(String.valueOf(i)); // i는 정수형인데 setId는 문자열 이라서 형 변환시켜줘야함
			bag.setPw(i+"");
			bag.setName(i+"");
			bag.setTel(i+"");
			//list에 넣음.
			list.add(bag); 
		}
		System.out.println(list.size());
		
		//리스트에 있는 가방 꺼내기
		for (int i = 0; i < list.size(); i++) {
			MemberVO bag = list.get(i); // 저장된 리스트에서 꺼내서 bag에 넣음
			System.out.println(bag.getId());
			System.out.println(bag.getPw());
			System.out.println(bag.getName());
			System.out.println(bag.getTel());
		}
		
		
	}
}
