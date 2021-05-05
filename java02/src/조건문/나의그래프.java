package 조건문;
package ���ǹ�;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

public class ���Ǳ׷��� {

	/*	�츮�� ��ǰ(��ü)�� ����ϱ� ���� �̾Ƴ�����
	 	new��� Ű���� ����ؼ� �̾Ƴ� 	        
	
	  �⺻Ʋ       JFrame f = new JFrame();
     		f.setSize(500,500);
	  		f.setVisible(true);
	  		
	  �Ʒ��� ���� ��ư���� ������ �ʰ� window builder ��� => �� ���ϰ� ������
	  
	 <window build �����>
	  �ۼ����� Ŭ���� ��Ŭ�� + Openwith -> window builder Ŭ��

	 */
	public static void main(String[] args) {
		
		//å���� ����� ��ư�� �ø���
		JFrame f = new JFrame(); // �츮�� ����� ������(ū Ʋ)�ϳ� ����  => new + ctrl + space -> jfra + ctrl +space ->name ����
		//JButton b1 = new JButton(); //b1�̶�� ��ư �ϳ� ��� 
		//JButton b2 = new JButton(); //b2�̶�� ��ư �ϳ� ���
		//JButton b3 = new JButton(); //b3�̶�� ��ư �ϳ� ���
		
		/*����� ��ǰ�鸸 ��Ƶ� ������-> �� ��ǰ�� ����� ����ϱ� ���ؼ� �Ʒ��� ���� �۾��ؾ���*/
		f.setSize(500,500); //������ ������ ����
		
		/*
		 �����ϰ� GUI�����ϱ� ���ؼ���  window builder�̿��ؼ� ���� ����� ���� #�Ʒ� �ڵ�� windowbuilder �̿��ؼ� ������� �ڵ�
		 palette���� ������ ������ ���� �� �ְ� properties���� ������/�ؽ�Ʈ/��Ʈ/���� ��� ������ ����
		 */
		
	
		JButton b1 = new JButton("\uBD81\uCABD\uBC84\uD2BC");  
		f.getContentPane().add(b1, BorderLayout.NORTH);
		
		JButton b2 = new JButton("\uC11C\uCABD\uBC84\uD2BC");
		f.getContentPane().add(b2, BorderLayout.WEST);
		
		JButton b3 = new JButton("\uAC00\uC6B4\uB370\uBC84\uD2BC");
		b3.setForeground(Color.BLACK);
		b3.setBackground(Color.GREEN);
		b3.setFont(new Font("����", Font.PLAIN, 18));
		f.getContentPane().add(b3, BorderLayout.CENTER);
		
		JButton b4 = new JButton("\uB3D9\uCABD\uBC84\uD2BC");
		f.getContentPane().add(b4, BorderLayout.EAST);
		
		JButton b5 = new JButton("\uB0A8\uCABD\uBC84\uD2BC");
		f.getContentPane().add(b5, BorderLayout.SOUTH);
		//f.add(b1); // add�޼��� : �����ӿ� �ø��� �ø� => window builder �����ϸ� ���� �����ӿ� �÷�����		
		//b1.setText("����������"); //�ø� ��ư�� �۾��� �ְ� ������ (��ư��ǰ[��ü]������).setText()
		
		f.setVisible(true); //true �ؾ� �������� ���� => �̰� �� ���� �ۼ��ؾ��Ѵ�. �׷��� ���� ��� ��ǰ���� Ȯ���� ������
	
	}

}
