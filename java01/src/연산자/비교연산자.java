package 연산자;

public class 비교연산자 {

	public static void main(String[] args) {
		//비교연산자 : == , !=, >=, >
		//비교의 결과는 true & false이다.
		//비교연산자는 기본형만 비교 가능하다.
		//기본형이란 : 정수 실수 문자 논리 ## 자바에서 string은 비교 불가 .equal() 을 통해 가능
		int x = 100;
		int y = 200;
		System.out.println(x == y);
		System.out.println(x != y);

	}

}
