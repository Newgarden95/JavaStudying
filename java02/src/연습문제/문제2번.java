package 연습문제;

public abstract class 문제2번 { //abstract 를 붙이면 불완전하다는 뜻으로 수정이 필요하다는 걸 뜻함
	public static void main(String[] args) {
		final double PI = 3.14; //파이는 고정되어있어 => 변경불가 ( final키워드 이용 ~> 변수명은 대문자로)
		double r = 2.2;	//반지름은 변할 수 있음
		double area = PI * r * r; //하나라도 double 이면 double이라 변수데이터 타입은 double
		
		//거듭제곱 관련 메서드 이용해 구한경우
		double rr = Math.pow(r, 2); //거듭제곱 관련 메서드
		double result = PI * rr;
		
		System.out.println("원의 면적은"+' '+area);
		System.out.format("원의 면적은 %.2f" ,result);// 소수점 자리 자르기(print 대신 format 메서드 사용하기)
		
	}
}
