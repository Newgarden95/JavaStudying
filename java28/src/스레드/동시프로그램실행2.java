package 스레드;

public class 동시프로그램실행2 {
	public static void main(String[] args) {
		스레드 t1 = new 스레드();
		스레드2 t2 = new 스레드2();
		스레드3 t3 = new 스레드3();
		
		
		//start는 cpu가 스케줄러를 통해 스케줄관리해주면서 사용해줌 run을 사용하게 되면 그냥 내가 직접 바로 실행해버리니까 스레드의 의미가 없어짐
		t1.start();//$
		t2.start();//@
		t3.start();//&
	}
}
