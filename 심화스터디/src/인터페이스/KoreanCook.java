package 인터페이스;

public class KoreanCook implements Icook {
	@Override
	public void makeRice() {
		// TODO Auto-generated method stub
		System.out.println("한식 밥만들기");
	}

	@Override
	public void makeSoup() {
		// TODO Auto-generated method stub
		System.out.println("한식 스프만들기");
	}

	@Override
	public void makeSalad() {
		// TODO Auto-generated method stub
		System.out.println("한식 샐러드만들기");
	}

	@Override
	public void makeSource() {
		// TODO Auto-generated method stub
		System.out.println("한식 소스만들기");
	}
}
