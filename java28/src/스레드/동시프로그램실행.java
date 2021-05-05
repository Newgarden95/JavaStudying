package 스레드;

public class 동시프로그램실행 {

	public static void main(String[] args) {
		동시프로그램 t1 = new 동시프로그램();
		동시프로그램2 t2 = new 동시프로그램2();
		
		//cpu한테 스레드 2개 만든 거에 대해 스레드등록 ~> 스케줄러에 의해 다른 프로그램이 사용되면 결과가 달라질 수 있음 (결과가 많이 섞인다 : cpu가 바쁨)
		//start()는 cpu가 스케줄러를 통해 스케줄관리해주면서 사용하게 해줌(병행실행) run을 사용하게 되면 병행 처리를 하지 못하게 되서 스레드의 의미가 없어짐
		t1.start();
		t2.start();
		
	}
}
