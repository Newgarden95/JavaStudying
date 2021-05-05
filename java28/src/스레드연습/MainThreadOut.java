package 스레드연습;

import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
//외부클래스 이용
public class MainThreadOut extends JFrame {
	// 현재 jframe 상속 받았기 때문에 객체 생성(new) 없이 기능 사용이 가능
	JLabel count, date, img;
	
	public MainThreadOut() { //생성자 -> main메서드 실행시 자동으로 실행
		getContentPane().setBackground(new Color(0, 191, 255));
		setSize(800, 300);
		getContentPane().setLayout(null);

		count = new JLabel(""); //JLabel count로 설정하면 쓰레드 널포인트 에러 뜸 => 위에 전역변수를 사용해야지 그렇지 않으면 지역변수야 
		count.setFont(new Font("굴림", Font.BOLD, 25));
		count.setBounds(63, 51, 164, 68);
		getContentPane().add(count);
		CountThread ct = new CountThread(count); //외부클래스(Counter)의 스레드 기능 사용을 위해 객체 생성
		ct.start();//스레드 설정
		
		date = new JLabel("");
		date.setFont(new Font("굴림", Font.BOLD, 30));
		date.setBounds(65, 190, 648, 61);
		getContentPane().add(date);
		DateThread dt = new DateThread(date); //외부클래스(Date)의 스레드 기능 사용을 위해 객체 생성
		dt.start();//스레드 설정
		
		img = new JLabel("");
		img.setBounds(363, 10, 313, 150);
		getContentPane().add(img);
		ImgThread it = new ImgThread(img);//외부클래스(Img)의 스레드 기능 사용을 위해 객체 생성
		it.start();//스레드 설정
		
		setVisible(true);
	}

	public static void main(String[] args) {
		MainThreadOut m = new MainThreadOut(); // 클래스
		
		/*
		CountThread ct = new CountThread(m.count);
		ct.start();

		DateThread dt = new DateThread(m.date);
		dt.start();
		
		ImgThread it = new ImgThread(m.img);
		it.start();
		*/
	}


}