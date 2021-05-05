package 데이터;

public class 기본데이터 {
	public static void main(String[] args) {
		/*기본데이터 4가지
		정수 , 실수, 문자, 논리
		문자1글자 => Char    문자여러개 => String   자바는 문자 한개가 기본데이터임
		*/
		int age = 100; // 어떤 데이터의 변수에 넣을 것인지 반드시 명시해야함!!!
		double eye = 1.5; 
		char gender = '남';
		boolean food = true;
		
		System.out.println("내 나이는 "+age);
		System.out.println("내 시력은"+eye); // syso, sysout  ctrl + space(자동완성)     파이썬에선 데이터 타입이 다르면 실행 안되지만 자바는 가능
		System.out.println("내 성별은 "+gender);
		System.err.println("점심 유무 "+food);
	}
}

