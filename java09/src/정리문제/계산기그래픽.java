package 정리문제;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기그래픽 {
	private static JTextField textField;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(145, 78, 184, 67);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton num7 = new JButton("7");
		num7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num7 = 7;
			}
		});
		num7.setBounds(38, 202, 97, 23);
		f.getContentPane().add(num7);
		
		JButton num4 = new JButton("4");
		num4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num4 = 4;
			}
		});
		num4.setBounds(38, 254, 97, 23);
		f.getContentPane().add(num4);
		
		JButton num8 = new JButton("8");
		num8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num8 = 8;
			}
		});
		num8.setBounds(176, 202, 97, 23);
		f.getContentPane().add(num8);
		
		JButton num9 = new JButton("9");
		num9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num9 = 9;
			}
		});
		num9.setBounds(317, 202, 97, 23);
		f.getContentPane().add(num9);
		
		JButton num5 = new JButton("5");
		num5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num5 = 5;
			}
		});
		num5.setBounds(176, 254, 97, 23);
		f.getContentPane().add(num5);
		
		JButton num6 = new JButton("6");
		num6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num6 = 6;
			}
		});
		num6.setBounds(317, 254, 97, 23);
		f.getContentPane().add(num6);
		
		JButton num1 = new JButton("1");
		num1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = 1;
				
			}
		});
		num1.setBounds(38, 307, 97, 23);
		f.getContentPane().add(num1);
		
		JButton num2 = new JButton("2");
		num2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num2 = 2;
			}
		});
		num2.setBounds(176, 307, 97, 23);
		f.getContentPane().add(num2);
		
		JButton num3 = new JButton("3");
		num3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num3 = 3;
			}
		});
		num3.setBounds(317, 307, 97, 23);
		f.getContentPane().add(num3);
		
		JButton t1 = new JButton("+");
		t1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		t1.setBounds(38, 373, 97, 23);
		f.getContentPane().add(t1);
		
		JButton t2 = new JButton("-");
		t2.setBounds(176, 373, 97, 23);
		f.getContentPane().add(t2);
		
		
		
		
		f.setVisible(true);
	}
}
