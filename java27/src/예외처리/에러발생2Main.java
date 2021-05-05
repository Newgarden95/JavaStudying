package 예외처리;

public class 에러발생2Main {

	public static void main(String[] args) {
		에러발생2 error = new 에러발생2();
		// 여기서 예외처리를 해줘야함 ~> main이 처리해줘야함 [try~catch를 통해 직접 하던가, Exception을 통해 던져줄수있음]
		try {
			error.call();
		} catch (Exception e) {
			System.out.println("메인에서 에러처리함");
		}
		System.out.println("에러 발생 후 실행될까요?");
	}
}
