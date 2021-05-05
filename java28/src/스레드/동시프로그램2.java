package 스레드;

public class 동시프로그램2 extends Thread { //동시에 처리되는 cpu단위로 만듬 -> 상속받아 상용!!
	//동시에 처리하고 싶은 프로그램 내용이 있으면
	//Thread안에 있는 run()이라는 메서드를 override

	//알아서 돌아가게됨
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("동시에 돌아가요 -2");
		}
	}

}
