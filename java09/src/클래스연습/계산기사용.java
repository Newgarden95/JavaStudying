package 클래스연습;

public class 계산기사용 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		int coffeePrice = 4600;
		int juicePrice = 5000;
		
		cal.add(coffeePrice, juicePrice); //더하고싶은경우 => 물론 위에 있는 변수값들을 계산기로 넘겨줘야한다.
		cal.minus(coffeePrice,juicePrice);
	}

}
