package java29;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class MainThread extends JFrame{//JFrame 상속을 받기
	//실시간 시간 코스피 지수 + 개장시간까지 남은시간
	
	JLabel deadline, kospi, kosdaq, nasdaq;// 스레드를 통해 사용할 라벨의 이름을 전역변수로 생성;
	
	private JLabel lblNewLabel_3;
	public MainThread() {//생성자
		getContentPane().setBackground(new Color(60, 179, 113));
		setSize(800, 600);
		getContentPane().setLayout(null);
		
		//화면에 Naver주식이라는 사진을 출력해주기 위한 레이블
		JLabel mark = new JLabel("");
		mark.setBounds(297, 10, 197, 199);
		getContentPane().add(mark);
		ImageIcon icon = new ImageIcon("naver.PNG");//naver.PNG파일을 통해 이미지찍기
		mark.setIcon(icon);//mark라는 라벨에 붙히기
		
		//개장까지 남은 시간 출력을 위한 레이블
		deadline = new JLabel("");
		deadline.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		deadline.setBounds(266, 496, 346, 55);
		getContentPane().add(deadline);
		date d = new date(deadline);//개장까지 시간을 위한 기능을 갖는 객체 선언(외부클래스)
		d.start();//개장시간 스레드설정
		
		kospi = new JLabel("");
		kospi.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		kospi.setBounds(120, 278, 114, 37);
		getContentPane().add(kospi);
		Kospi k = new Kospi(kospi);//실시간 코스피 지수를 보여주는 기능을 갖는 객체 선언(외부클래스)
		k.start();//코스피 지수 스레드설정
		
		kosdaq = new JLabel("");
		kosdaq.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		kosdaq.setBounds(307, 278, 114, 37);
		getContentPane().add(kosdaq);
		Kosdaq k1 = new Kosdaq(kosdaq);// 실시간 코스닥 지수를 보여주는 기능을 갖는 객체 선언(외부클래스)
		k1.start();//코스닥 지수 스레드설정
		
		nasdaq = new JLabel("");
		nasdaq.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		nasdaq.setBounds(519, 278, 114, 37);
		getContentPane().add(nasdaq);
		Nasdaq n = new Nasdaq(nasdaq);// 실시간 나스닥 지수를 보여주는 기능을 갖는 객체 선언(외부클래스)
		n.start();//나스닥 지수 스레드설정
		
		JLabel lblNewLabel = new JLabel("코스피실시간지수");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 17));
		lblNewLabel.setBounds(108, 240, 136, 28);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("코스닥실시간지수");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 17));
		lblNewLabel_1.setBounds(297, 240, 136, 28);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("나스닥실시간지수");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 17));
		lblNewLabel_2.setBounds(487, 240, 136, 28);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("개장까지 남은시간:");
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		lblNewLabel_3.setBounds(36, 501, 280, 37);
		getContentPane().add(lblNewLabel_3);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MainThread();//생성자 실행
	}
}
