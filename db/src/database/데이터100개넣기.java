package database;

import java.util.ArrayList;

public class 데이터100개넣기 {

	public static void main(String[] args) throws Exception {
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		
		BoardVO bag = new BoardVO();
		for (int i = 0; i < 100; i++) {
			bag.setId(i+ "ID");
			bag.setTitle(i+ "TITLE");
			bag.setContent(i+ "CONTENT");
			bag.setWriter(i+ "WRITER");
			list.add(bag);
		}
		System.out.print("리스트 가방개수"+list.size()+"개");
		for (int i = 0; i < list.size(); i++) {
			BoardVO bag1 = new BoardVO(); //저장된 리스트에서 꺼내서 bag2dp넣음
			System.out.println("id = " + bag);
		}
		Db db = new Db();
		db.create(list);
		
		
	}
	
}

