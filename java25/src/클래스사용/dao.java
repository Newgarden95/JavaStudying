package 클래스사용;

import 클래스만들기.MemberDAO;

public class dao {
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		
		dao.create("whaone2", "1234", "whaone");
		dao.delete("whaone2");
		System.out.println(dao);
	}
}
