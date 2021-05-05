package 연습문제;

public class 문제5번 {

	public static void main(String[] args) {
		/*
		  비교연산자 사용을 위해 문자형 변수 2개 선언 + 몸무게 변수 선언
		 */
		char pw = 'p';
		char pwInput = 'q';
		double weight = 2.2;
		
		if (pw == pwInput && weight > 2) { // 문자형 변수값이 같고 몸무게 값이 2보다 큰 경우 조건문 실행
			System.out.println("오늘은 성공!");
		}else {
			System.out.println("내일 다시 도전!");
		}
	}

}
