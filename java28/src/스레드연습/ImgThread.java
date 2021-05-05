package 스레드연습;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImgThread	 extends Thread {
	JLabel img;
	public ImgThread(JLabel img) {
		this.img = img;
		//run();
	}
	
	@Override
	public void run() {
		String[] imgList = {"001.png","002.png","003.jpg","004.png","005.jpg"};
		for (int i = 0; i < imgList.length; i++) {
			ImageIcon icon = new ImageIcon(imgList[i]);
			img.setIcon(icon);
			if(i == imgList.length-1) {//사진의 반복을 위해 설정
				i = -1;
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
		}
	}
}
