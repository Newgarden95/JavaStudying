package 스태틱;

public class 직원채용 {

	public static void main(String[] args) {
		//직원객체 생성 
		직원 c1 = new 직원("홍길동", "남", 25);
		직원 c2 = new 직원("김길동", "여", 26);
		직원 c3 = new 직원("송길동", "남", 27);
		
		//모든 직원의 정보
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//직원의 수
		System.out.println("직원의 수: " + 직원.num);
		System.out.println("직원의 나이 평균: "+직원.ageAvg/직원.num);
		
		직원.getAvg(); //객체생성없이 바로 사용
	}
}
