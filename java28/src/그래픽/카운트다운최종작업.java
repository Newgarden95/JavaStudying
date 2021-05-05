package 그래픽;

import java.awt.Font;
import java.awt.SystemColor;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 카운트다운최종작업 extends JFrame{ //상속을 통해 JFrame의 기능을 사용할 수 있음
	//전역변수
	 JLabel count1; 
	 JLabel img1;
	 JLabel date1;
	
	public 카운트다운최종작업() {//생성자
		getContentPane().setBackground(SystemColor.activeCaption);
		setSize(800,300);
		getContentPane().setLayout(null);
		
		count1 = new JLabel("count: 500");
		count1.setFont(new Font("굴림", Font.BOLD, 32));
		count1.setBounds(142, 60, 210, 58);
		getContentPane().add(count1);
		
		img1 = new JLabel();
		img1.setBounds(453, 10, 191, 151);
		getContentPane().add(img1);
		ImageIcon icon = new ImageIcon("001.png");
		img1.setIcon(icon);

		date1 = new JLabel("date");
		date1.setFont(new Font("굴림", Font.BOLD, 30));
		date1.setBounds(12, 187, 760, 64);
		getContentPane().add(date1);
		Date date = new Date();
		date1.setText(date+"");
		//Day Thread 사용하기
		//날짜스레드 c = new 날짜스레드();
		//c.start();//스레드 등록 ~> 이렇게만 설정하면 콘솔에만 찍힘

		count2 c1 = new count2();
		c1.start();
		
		img2 i1 = new img2();
		i1.start();
		
		date2 w1 = new date2();
		w1.start();
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {//메인안에 지저분하게 하지 않기 위해 분리
		카운트다운최종작업 t = new 카운트다운최종작업(); //생성자 자동생성

	}//main
	
	//inner class 사용이유 찾아보기  # 흔한 프로그램 방법은 아님!!
	//변수를 공유해야하는 두개의 클래스가 있다면, 클래스 안에 클래스를 낄 수 있다. => 현재 main 클래스 안에 날짜, 이미지, 카운트 당 스레드 클래스를 껴야함
	//inner class, 내부클래스
	//내부클래스는 독립적으로 쓸 수 없다. 
	public class img2 extends Thread{
		@Override
		public void run() {
			String[] imgList = {"001.png","002.png","003.jpg","004.png","005.jpg"};
			for (int i = 0; i < imgList.length; i++) {
				ImageIcon icon = new ImageIcon(imgList[i]); //이미지 올리기 => imageicon 객체 사용
				img1.setIcon(icon);//img1이라는 라벨에 사진을 첨부한다
				//조건문을 통해 이미지 한바퀴 돌았을때 다시 돌수 있도록 설정
				if(i == imgList.length-1) {
					i = -1;// i에 -1을 대입해줘야 i++를 통해 i가 0이 됨
				}
				try {
					Thread.sleep(5000); //5초에 1번 실행
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}

	public class date2 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				Date date = new Date();
				date1.setText("날짜: "+date);//date1이라는 라벨에 현재 날짜를 출력하도록 설정
				try {
					Thread.sleep(1000); //1초에 1번 실행
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public class count2 extends Thread {
		@Override
		public void run() {
			for (int i = 500; i >= 0; i--) {
				count1.setText("count: " + i);
				try {
					Thread.sleep(500);// 실행속도 조절 1000ms = 1초 -> 500ms = 0.5초 따라서 0.5초에 1번 실행 
				} catch (InterruptedException e) { //인터럽트(방해, 중단) : esc, ctrl + c, power -off
					e.printStackTrace();
				}
			}
		}
	}
	
	
}//class
