package 예외처리;

public class 문제발생클래스 {
	public static void main(String[] args) {
		System.out.println("1. 나는 프린트가 잘 될 예정.");
		try {
			//try부분에 문제가 발생할거 같은 코드 넣기
			System.out.println("2. 문제 발생코드" + 10/0);//문제 발생하는 곳 -> 에러나서 뒷 부분 실행 안됨
		} catch (Exception e) {
			//예외상황이 발생하면, 잡아서 어떻게 처리할 지 코드를 넣어주는 부분       Exception e ~> 참조형 변수
			System.out.println("에러 발생함");
			System.out.println(e.getMessage()); //에러 사유를 알려줌
			e.printStackTrace();
		}
		System.out.println("3. 나는 과연 프린트가 될까요??");
	}
}
