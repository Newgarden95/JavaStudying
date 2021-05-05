package bean;

// 싱글톤 객체 ? 
// 싱글톤이란 한 번의 객체 생성으로(1번의 인스턴스화~> 데이터 변화없이 고정된경우) 메모리 낭비를 방지해준다.
// 즉, 똑같은걸 반복해 사용할 경우 그때마다 계속해서 객체를 생성하면 메모리 소모가 커짐

public class DBCP {
	//DBCP클래스 객체 선언(static)
	static DBCP instance; //instance라는 DBCP객체 선언 ~> 맨 처음은 null값
	
	private DBCP() {
		
	}
	
	public static DBCP getInstance() {
		// 접근제어자 + static + 반환형 + 함수명
		//DBCP객체가 만들어져있으면 그대로 return
		//DBCP객체가 만들어져있지 않으면 객체 생성하여 return
		if(instance == null) { //instance라는 변수에 객체가 생성되지 않은경우
			instance = new DBCP();
		}
		return instance;//객체형 반환
	}

	//LazyHolder 방식 ~> 가장 많이 쓰이는 방식
	/*private DBCP() {//생성자에 접근하지 않을때 ~> 이미 DBCP의 객체를 instance로 만들었기 때문에 생성자 사용 x
	}
	
	public static DBCP getInstance() {
		return LazyHolder.dbcp;
	}
	
	private static class LazyHolder{ //객체생성 담당
		private static final DBCP dbcp = new DBCP();
	}*/
}
