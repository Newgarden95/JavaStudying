package 생성자;

public class MemberDB사용 {
	public static void main(String[] args) {
		//CRUD구현
		//create 기능을 사용하고 싶음
		MemberDB db = new MemberDB();
		MemberVO bag = new MemberVO();
		db.create(bag);//bag -> 주소를 넣어줌
		db.delete("test");
		db.read("test");
	}
}
