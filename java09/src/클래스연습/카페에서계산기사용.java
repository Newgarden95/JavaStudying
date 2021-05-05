package 클래스연습;

public class 카페에서계산기사용 {

	public static void main(String[] args) {
		int coffeePrice = 4600;
		int juicePrice = 4000;
		
		int coffeeCount = 5; //커피 주문수
		int juiceCount = 3;
		
		계산기2 cal = new 계산기2();
		
		//전체 몇 잔을 주문했을까요?
		cal.add(coffeeCount, juiceCount);
		//메서드를 사용할 때 => 메서드 호출(call, 콜)할 때
		//그 처리결과값을 가지고 와서
		//다시 사용해야 하는 경우가 있음
		//리턴을 받아온다
		
		//커피값은 얼마일까요?
		int coffee = cal.mul(coffeeCount, coffeePrice);
		//주스값은 얼마일까요?
		int juice = cal.mul(juiceCount, juicePrice);
		
		//커피값과 주스값의 합은?
		cal.add(coffee, juice);
		
		int hour = cal.gethour();
		System.out.println("현재시각은 "+hour);
	}

}
