package 스레드연습;

import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class MainThread extends JFrame {
	// 현재 jframe 상속 받았기 때문에 객체 생성(new) 없이 기능 사용이 가능 
	JLabel count, date, img;
	
	public MainThread() {
		getContentPane().setBackground(new Color(244, 164, 96));//JFrame을 상속받은 클래스의 생성자니까 객체 생성할 필요 없음
		setSize(800, 300);
		getContentPane().setLayout(null);

		count = new JLabel(""); //JLabel count로 설정하면 쓰레드 널포인트 에러 뜸 => 위에 전역변수를 사용해야지 그렇지 않으면 지역변수야 
		count.setBounds(63, 51, 164, 68);
		getContentPane().add(count);
		CountThread ct = new CountThread(); //카운트 기능을 사용하기 위해서는 반드시 객체를 생성해줘야함
		ct.start(); //스레드 설정

		date = new JLabel("");
		date.setBounds(65, 190, 648, 61);
		getContentPane().add(date);
		DateThread dt = new DateThread(); //날짜 기능을 사용하기 위해서는 반드시 객체를 생성해줘야함
		dt.start(); //스레드 설정

		img = new JLabel("");
		img.setBounds(363, 10, 313, 150);
		getContentPane().add(img);
		//ImageIcon icon = new ImageIcon("001.png"); 이미지 찍기 위해서 ImageIcon 이라는 객체를 생성
		//img.setIcon(icon); 찍을 변수.setIcon(); => 찍힘
		ImgThread it = new ImgThread();//이미지 기능을 사용하기 위해서는 반드시 객체를 생성해줘야함
		it.start();// 스레드 설정

		setVisible(true);
	}

	public static void main(String[] args) {
		new MainThread(); // 클래스
		
	}

	// 내부클래스(카운트)
	public class CountThread extends Thread {
		@Override
		public void run() {
			for (int i = 10; i >=0; i--) {
				count.setText("Count: "+i); //전역변수로 설정해둔 JLabel에 찍기
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// 내부클래스(데이트)
	public class DateThread extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				Date date1 = new Date();
				//System.out.println(date); //데이트 출력을 라벨에 찍어주고 싶어 => 라벨.setText() 사용
				date.setText("date: "+ date1);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// 내부클래스(이미지)
	public class ImgThread extends Thread {
		int count = 10;
		@Override
		public void run() {
			String[] imgList = { "001.png", "002.png", "003.jpg", "004.png", "005.jpg" };
			for (int i = 0; i < imgList.length; i++) {
				ImageIcon icon = new ImageIcon(imgList[i]);
				img.setIcon(icon);
				if(i == imgList.length-1) {//사진의 반복을 위해 설정
					i = -1;
				}
				if (count == 0) {
					break;
				}
				System.out.println(count);
				count--;
				
				try {
					Thread.sleep(000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
