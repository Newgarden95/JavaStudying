package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기 {
	private static JTextField t1;
	private static JTextField t2;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(159, 40, 116, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(159, 87, 116, 21);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton b1 = new JButton("더하기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1 = Integer.parseInt(t1.getText());// 입력받은 텍스트를 정수형으로 변환
				int num2 = Integer.parseInt(t2.getText());
				
				Cal cal = new Cal();
				int result = cal.add(num1, num2);
				
			}
		});
		System.out.println(b1.getText()); // b1.getText() : 버튼 b1에 적혀진걸 반환(문자열)
		b1.setBounds(31, 195, 97, 23);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("빼기");
		b2.setBounds(159, 195, 97, 23);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("곱하기");
		b3.setBounds(170, 262, 97, 23);
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("나누기");
		b4.setBounds(327, 262, 97, 23);
		f.getContentPane().add(b4);
		
		f.setVisible(true);
	}
}
