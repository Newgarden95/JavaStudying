package 그래픽;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.util.Date;
import java.awt.Font;

public class 카운트다운기초작업 {
	private static JLabel count1;
	private static JLabel img1;
	private static JLabel date1;
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(SystemColor.activeCaption);
		f.setSize(800,300);
		f.getContentPane().setLayout(null);
		
		JLabel count1;
		count1 = new JLabel("count: 500");
		count1.setFont(new Font("굴림", Font.BOLD, 32));
		count1.setBounds(142, 60, 210, 58);
		f.getContentPane().add(count1);
		
		JLabel img1;
		img1 = new JLabel();
		img1.setBounds(453, 10, 191, 151);
		f.getContentPane().add(img1);
		ImageIcon icon = new ImageIcon("001.png"); //이미지 올리기 => imageicon 객체 사용
		img1.setIcon(icon);
		
		JLabel date1;
		date1 = new JLabel("date");
		date1.setFont(new Font("굴림", Font.BOLD, 30));
		date1.setBounds(12, 187, 760, 64);
		f.getContentPane().add(date1);
		Date date = new Date();
		date1.setText(date+"");
		f.setVisible(true);
	}
}
