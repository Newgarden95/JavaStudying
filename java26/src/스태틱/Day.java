package 스태틱;

public class Day {
	//instance <-> static
	
	//new 할때 마다 3개는 복사됨 
	//멤버변수는 객체생성될 때 다이나믹하게 동적으로 메모리가 할당
	//만약 객체가 3개 생성되면 매번 3개씩 객체마다 다른 속성값들을 가져야 한다.
	//실제로 그 객체에 해당하는 실제값들이 구체적으로 저장되는 특징
	//실제값: instance(인스턴스)
	//객체 생성할 때마다 복사되는 변수: 인스턴스 변수
	String doing;
	int time;
	String place;
	static int count; //전역변수 0으로 초기화 , 하나만 복사되서 day1,2,3 에서 공통으로 쓸거임 => 공통적으로 사용, 객체생성 할때 복사되지 않는 변수 
	//static 선언된 변수나 메서드는 프로그램이 실행 될때 애초에 메모리에 할당되어있음 -> 인스턴스같은 경우 객체를 생성할 때 마다 메모리 할당됨
	//=> 누적을 위할 경우 static 사용하라!!!!
	//static 변수는 클래스당 한개만 가지고 있는 변수
	//클래스이름.변수명으로 사용 => Day.count
	//객체생성과는 상관이 없다.
	//static은 객체생성하지 않아도 사용가능하다.
	static int sum;
	
	public Day(String doing, int time, String place) {
		this.doing = doing;
		this.time = time;
		this.place = place;
		count++;
		sum = sum + time;
	}
	
	public void count() {
		
	}
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", place=" + place + "]";
	}
}
