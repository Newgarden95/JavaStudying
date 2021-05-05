package 리뷰문제0708;

public class Main1 {

	public static void main(String[] args) {
		//다형성 활용
		Car sedan = new Sedan("현대",2020,3600);// 회사, 연식, 가격 
		Car truck = new Truck("기아", 2021, 30);// 회사, 연식, 무게
		
		((Sedan) sedan).pr(); //그냥 sedan.하면 Car에서 오버라이딩된 메서드만 출력 
										  //따라서, 강제형변환(downcasting)해주고 Sedan객체에 대한 메서드 사용
		
	 	System.out.println(sedan); //현재 주소는 Sedan객체에 대한 주소이다.
	 											   //따라서 변수는 그대로 Sedan에 있는거 출력
		sedan.info();//상위클래스의 메서드
	 	sedan.hi();//상위클래스의 메서드
	 	System.out.println("");
		
		((Truck) truck).truckInfo();
		System.out.println(truck);
		truck.hi();
		truck.info();
	}
}
