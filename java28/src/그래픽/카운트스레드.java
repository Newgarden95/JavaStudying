package 그래픽;

public class 카운트스레드 extends Thread {

	@Override
	public void run() {
		for (int i = 500; i >= 0; i--) {
			System.out.println("count: " + i);
			try {
				Thread.sleep(500);// 실행속도 조절 1000ms = 1초 -> 500ms = 0.5초 따라서 0.5초에 1번 실행 
			} catch (InterruptedException e) { //인터럽트(방해, 중단) : esc, ctrl + c, power -off
				e.printStackTrace();
			}
		}
	}
}
