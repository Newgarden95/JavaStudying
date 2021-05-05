package bean;

public class BbsMain {
	public static void main(String[] args) throws Exception {
		BbsDAO dao = new BbsDAO();
		BbsDAO dao1 = new BbsDAO();
		
		BbsVO result = dao.read("whaone2");
		
		System.out.println(dao);
		System.out.println(dao1);
	}
}
