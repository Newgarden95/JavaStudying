package 조건문;
package ���ǹ�;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
//���� ���ϴ� ������ġ�� ��ġ��Ű��  layout���� absolute�� ���� -> ���� ������� �������� ����� ���� �� �ִ�.
import javax.swing.JOptionPane;

public class ���Ǳ׷���4 {
	private static JTextField t1;
	private static JTextField t2;
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("����", Font.PLAIN, 33));
		t1.setBounds(123, 99, 323, 57);  //���� ���� 
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("����", Font.PLAIN, 33));
		t2.setColumns(10);
		t2.setBounds(123, 180, 323, 57);
		f.getContentPane().add(t2);
		
		JButton b1 = new JButton("\uB354\uD558\uAE30");
		b1.addActionListener(new ActionListener() { //A. ���� .�ڿ� ������ ���� A��� ��ǰ���� Ư�� ����� ���� �޼��带 ����ϰڴٶ�� �ǹ� 
			public void actionPerformed(ActionEvent e) { //���ϱ� ����
				/*
				  1.�Է��� t1, t2���� ������ �;��Ѵ�.
				  2.���� ������ id/pw�� �������� Ȯ��
				  3.ó�� -> ��� ���
				 */
				//�ܺο��� �Է��� �������� Ÿ���� ��� String�̴�
				String s1 = t1.getText(); // �ۼ����� ������ null(����)�� �ƴ� ���� " "�� �޾Ƶ��� -> getText()�� cpu�� �ϴ� ��
				String s2 = t2.getText(); 
				
				
				int n1 = Integer.parseInt(s1); //Integer ��ǰ�� ����Ͽ� ����ȯ�� �����ش� (String -> int) 
											//cpu���� ��ǰ(��ü) ���� new�� ���̰ų� new������ �ʰ� �빮�ڷ� ����ϴ� ��� -> static // ��, Integer�� ������ �ʿ� ���� ���
				int n2 = Integer.parseInt(s2);	//Integer�� ���� ���̱� ������ static => Ư�� ��������� ���� ���� �ʿ���� �츮�� �����ϰ� ����ϱ� ���ؼ� �޼��� ���
				
				int sum = n1 + n2; //����ȯ �� 2 ������ ���Ͽ� sum�̶� ������ ������ ����
				JOptionPane.showMessageDialog(f, sum); //sum���
				System.out.println(Integer.parseInt(s1)); // ����ȯ�� ����� �ѹ���
				
			}
		});
		b1.setFont(new Font("����", Font.PLAIN, 35));
		b1.setBackground(Color.GRAY); 
		b1.setBounds(140, 287, 297, 82);
		f.getContentPane().add(b1);
		
		JLabel lblNewLabel = new JLabel("\uC22B\uC7901:");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 20));
		lblNewLabel.setBounds(26, 116, 85, 33);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lbll = new JLabel("\uC22B\uC7902:");
		lbll.setFont(new Font("����", Font.PLAIN, 20));
		lbll.setBounds(26, 197, 85, 33);
		f.getContentPane().add(lbll);
		
		JButton b2 = new JButton("\uBE7C\uAE30"); //���� ����
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText(); // �ۼ����� ������ null(����)�� �ƴ� ���� " "�� �޾Ƶ��� -> getText()�� cpu�� �ϴ� ��
				String s2 = t2.getText(); 
				
				System.out.println(s1+s2);
				int n1 = Integer.parseInt(s1); //cpu���� ��ǰ(��ü) ���� new�� ���̰ų� new������ �ʰ� �빮�ڷ� ����ϴ� ��� -> static
				int n2 = Integer.parseInt(s2);//Integer�� ��ü
				
				int minus = n1 - n2;
				JOptionPane.showMessageDialog(f, minus);
				
			}
		});
		b2.setFont(new Font("����", Font.PLAIN, 35));
		b2.setBackground(Color.GRAY);
		b2.setBounds(140, 395, 297, 82);
		f.getContentPane().add(b2);
		f.setSize(600,600);
		f.setVisible(true);
		
		
	}
}
