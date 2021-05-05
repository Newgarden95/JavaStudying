package 예외처리;

public class 에러발생2 {
	//예외가 발생하면 메서드가 정의된 곳에서 처리하는 것이 아니라
	//메서드를 호출한 곳으로 예외처리를 떠넘길 수 있다.
	//throws Exception 을 사용하면 됨
	//즉, call메소드 사용하기위해 부른 곳에서 
	public void call() throws Exception{//에러메소드
			System.out.println(3/0);
		}
	}
