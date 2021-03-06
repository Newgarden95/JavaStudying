package 정리문제;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기프로젝트 {
	private static JTextField t3;
	private static JTextField t1;
	private static JTextField t2;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(SystemColor.activeCaption);
		
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 20));
		t3.setBounds(171, 161, 182, 72);
		f.getContentPane().add(t3);
		t3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("결과값: ");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 22));
		lblNewLabel.setBounds(91, 171, 98, 44);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 20));
		t1.setBounds(171, 28, 172, 44);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 20));
		t2.setColumns(10);
		t2.setBounds(171, 91, 172, 44);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_1 = new JLabel("num1: ");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(102, 25, 84, 44);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("num2: ");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(102, 92, 98, 37);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JButton b1 = new JButton("+");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i1 = Integer.parseInt(t1.getText());
				int i2 = Integer.parseInt(t2.getText());
				
				계산기2 cal = new 계산기2();
				int result = cal.add(i1, i2);
				t3.setText(Integer.toString(result));			
			}
		});
		b1.setBackground(Color.PINK);
		b1.setFont(new Font("굴림", Font.PLAIN, 25));
		b1.setBounds(24, 268, 98, 72);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("-");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i1 = Integer.parseInt(t1.getText());
				int i2 = Integer.parseInt(t2.getText());
				
				계산기2 cal = new 계산기2();
				int result = cal.minus(i1, i2);
				t3.setText(Integer.toString(result));
			}
		});
		b2.setBackground(Color.PINK);
		b2.setFont(new Font("굴림", Font.PLAIN, 25));
		b2.setBounds(134, 268, 98, 72);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("*");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i1 = Integer.parseInt(t1.getText());
				int i2 = Integer.parseInt(t2.getText());
				
				계산기2 cal = new 계산기2();
				int result = cal.mul(i1, i2);
				t3.setText(Integer.toString(result));
			}
		});
		b3.setBackground(Color.PINK);
		b3.setFont(new Font("굴림", Font.PLAIN, 25));
		b3.setBounds(245, 268, 98, 72);
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("/");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i1 = Integer.parseInt(t1.getText());
				int i2 = Integer.parseInt(t2.getText());
				
				계산기2 cal = new 계산기2();
				double result = cal.div(i1, i2);
				String result1 = String.format("%.3f", result);
				t3.setText(result1);
			}
		});
		b4.setBackground(Color.PINK);
		b4.setFont(new Font("굴림", Font.PLAIN, 25));
		b4.setBounds(354, 268, 98, 72);
		f.getContentPane().add(b4);
		
		f.setVisible(true);
	}
}
