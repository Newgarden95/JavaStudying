package 조건문;
package ���ǹ�;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class ���Ǳ׷���2 {
	private static JTextField t1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(600,800);
		
		
		t1 = new JTextField();
		t1.setForeground(Color.MAGENTA);
		t1.setFont(new Font("����", Font.PLAIN, 40));
		f.getContentPane().add(t1, BorderLayout.NORTH);
		t1.setColumns(10);
		
		JButton b1 = new JButton("\uB098\uB97C \uD074\uB9AD\uD574\uC8FC\uC138\uC694"); // JButton() �ȿ� ���°� text
		
		//��ư�� ������ �� �̺�Ʈ�� �����ϱ� ���ؼ��� �����ο��� component�� �ִ� �ۼ��� ��ư�� ����Ŭ���ϸ� �ҽ��ڵ� �κ����� Ŀ���� ���ƿ�
		//�� �� �Ʒ��� ���� �̺�Ʈ �߻��޼��� Ȱ��
		b1.addActionListener(new ActionListener() {    //��ư Ŭ���� �̺�Ʈ �߻� (ex) ��ư�� ������� �޽����� �����ų� �ؽ�Ʈ�� �Է��ؼ� ����ϴ� ���....  
													   // b1�̶� ��ư�� ����� �־��ְڴ� �ǹ�
													   // ��ư ����Ŭ���� �ڵ� ����
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "��ư�� �����̱���");
				String s1 = t1.getText(); //��ư ������ �ۼ��� �Է°��� s1�̶�� ���ڿ� ������ ����
				JOptionPane.showMessageDialog(f, "����� �Է°���"+s1); //����� s1 ���
			}
		});
		
		b1.setBackground(Color.CYAN);
		b1.setForeground(Color.ORANGE);
		b1.setFont(new Font("����", Font.PLAIN, 55));
		f.getContentPane().add(b1, BorderLayout.CENTER);
		f.setVisible(true);
		
		
	}

}
