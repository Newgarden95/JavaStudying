package 예외처리;

public class 에러발생Main {

	public static void main(String[] args) {
		에러발생 error = new 에러발생();
		error.call();
		System.out.println("에러 발생 후 실행될까요???");
	}
}
