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
import javax.swing.JOptionPane;

/*<���� ���ϴ� ������ġ�� �������� ��ġ��Ű��>  
	design�� ���� ->components���� getContentPane()���� -> layout�� absolute�� ���� -> ���� ������� �������� ����� ���� �� �ִ�.
*/
public class ���Ǳ׷���3 {
	private static JTextField t1;
	private static JTextField t2;
	public static void main(String[] args) {
		String id = "root";    //id�� pw�� ���ڿ� ������ ����
		String pw = "1234";
		
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
		
		JButton b1 = new JButton("\uB85C\uADF8\uC778 \uBC84\uD2BC");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				   ó������
				  1.�Է��� t1, t2���� ������ �;��Ѵ�.
				  2.���� ������ id/pw�� �������� Ȯ��
				  3.ó�� -> ��� ���
				 */
				//�ܺο��� �Է��� �������� Ÿ���� ��� String�̴�
				String s1 = t1.getText(); // �����Ų�� ȭ�鿡 �Է°��� �ۼ����� ������ null(����)�� �ƴ� ���� " "���� �޾Ƶ���
				String s2 = t2.getText(); 
				
				if (s1.equals(id) && s2.equals(pw)) { //&&(and) ������ Ȱ���Ͽ� �Ѵ� True �϶� True
					JOptionPane.showMessageDialog(f, "�α��� �Ϸ�");
				}else {
					JOptionPane.showMessageDialog(f, "�α��� ����");
				}
				
			}
		});
		b1.setFont(new Font("����", Font.PLAIN, 35));
		b1.setBackground(Color.GRAY);
		b1.setBounds(140, 287, 297, 82);
		f.getContentPane().add(b1);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514"); //�۾� �ۼ��� �� ���
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 20));
		lblNewLabel.setBounds(26, 116, 85, 33);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lbll = new JLabel("\uD328\uC2A4\uC6CC\uB4DC");
		lbll.setFont(new Font("����", Font.PLAIN, 20));
		lbll.setBounds(26, 197, 85, 33);
		f.getContentPane().add(lbll);
		f.setSize(600,600);
		f.setVisible(true);
		
		
	}
}
