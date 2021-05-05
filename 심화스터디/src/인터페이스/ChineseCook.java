package 인터페이스;

public class ChineseCook implements Icook {
	//Source -> Override and implement Method
	@Override
	public void makeRice() {
		System.out.println("중식 밥만들기");
	}

	@Override
	public void makeSoup() {
		System.out.println("중식 스프만들기");
	}

	@Override
	public void makeSalad() {
		System.out.println("중식 샐러드만들기");
	}

	@Override
	public void makeSource() {
		System.out.println("중식 소스만들기");
	}
	
}
