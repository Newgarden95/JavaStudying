package 그래픽;

public class 이미지스레드 extends Thread{

	@Override
	public void run() {
		String[] imgList = {"001.png","002.png","003.png","004.png","005.png"};
		for (int i = 0; i < imgList.length; i++) {
			System.out.println("이미지: " + imgList[i]);
		}
		try {
			Thread.sleep(5000); //5초에 1번 실행
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
