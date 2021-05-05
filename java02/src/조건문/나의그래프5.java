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

public class ���Ǳ׷���5 {

	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(600, 600);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\uBA39\uACE0\uC2F6\uC740 \uC74C\uC2DD");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 40));
		lblNewLabel.setBounds(12, 58, 288, 63);
		f.getContentPane().add(lblNewLabel);

		t1 = new JTextField();
		t1.setForeground(Color.BLACK);
		t1.setFont(new Font("����", Font.PLAIN, 20));
		t1.setBackground(Color.MAGENTA);
		t1.setBounds(321, 48, 205, 80);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		JButton b1 = new JButton("\uC5B4\uB514\uB85C \uAC08\uAE4C\uC694?");
		b1.setBackground(Color.ORANGE);
		b1.addActionListener(new ActionListener() {  // ��ư�� ������ �� �̺�Ʈ �߻�
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText(); // �԰���� ���Ŀ� ���� text�ڽ��� �Էµ� ���ڸ� s1�� ����
				
				if (s1.equals("«��")) {   //���ǹ��� ���� ��
					JOptionPane.showMessageDialog(f, "�߱������� ������");
				} else if (s1.equals("�쵿")) {
					JOptionPane.showMessageDialog(f, "�Ͻ������� ������");
				} else {
					JOptionPane.showMessageDialog(f, "�ƹ��ų� �弼��");
					;
				}
			}
		});
		b1.setFont(new Font("����", Font.PLAIN, 20));
		b1.setBounds(12, 138, 514, 52);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("\uB098\uC758 \uB0B4\uB144 \uB098\uC774\uB294?");
		b2.setBackground(Color.ORANGE);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = t2.getText();
				JOptionPane.showMessageDialog(f, "������ ���̴� " + (Integer.parseInt(s2) + 1) + "�� �Դϴ�."); // +���� �����ϱ�
			}
		});
		b2.setFont(new Font("����", Font.PLAIN, 20));
		b2.setBounds(12, 290, 514, 52);
		f.getContentPane().add(b2);

		JLabel lblNewLabel_1 = new JLabel("\uB2F9\uC2E0\uC758 \uB098\uC774\uB294");
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(12, 210, 288, 63);
		f.getContentPane().add(lblNewLabel_1);

		t2 = new JTextField();
		t2.setForeground(Color.BLACK);
		t2.setFont(new Font("����", Font.PLAIN, 20));
		t2.setBackground(Color.BLUE);
		t2.setColumns(10);
		t2.setBounds(321, 200, 205, 80);
		f.getContentPane().add(t2);

		JLabel lblNewLabel_1_1 = new JLabel("\uAD6D\uC5B4\uC810\uC218");
		lblNewLabel_1_1.setFont(new Font("����", Font.PLAIN, 40));
		lblNewLabel_1_1.setBounds(12, 362, 288, 63);
		f.getContentPane().add(lblNewLabel_1_1);

		t3 = new JTextField();
		t3.setForeground(Color.BLACK);
		t3.setFont(new Font("����", Font.PLAIN, 20));
		t3.setBackground(Color.CYAN);
		t3.setColumns(10);
		t3.setBounds(321, 362, 205, 46);
		f.getContentPane().add(t3);

		JButton b3 = new JButton("\uB450\uACFC\uBAA9 \uC810\uC218\uC758 \uD3C9\uADE0\uC740?");
		b3.setBackground(Color.ORANGE);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s3 = t3.getText();
				String s4 = t4.getText();
				int sum = Integer.parseInt(s3) + Integer.parseInt(s4);
				double avg = (double) sum / 2;

				JOptionPane.showMessageDialog(f, "�ΰ��� ������ ��հ��� " + avg + "�Դϴ�.");
			}
		});
		b3.setFont(new Font("����", Font.PLAIN, 20));
		b3.setBounds(12, 499, 514, 52);
		f.getContentPane().add(b3);

		JLabel lblNewLabel_1_1_1 = new JLabel("\uC218\uD559\uC810\uC218");
		lblNewLabel_1_1_1.setFont(new Font("����", Font.PLAIN, 40));
		lblNewLabel_1_1_1.setBounds(12, 426, 288, 63);
		f.getContentPane().add(lblNewLabel_1_1_1);

		t4 = new JTextField();
		t4.setForeground(Color.BLACK);
		t4.setFont(new Font("����", Font.PLAIN, 20));
		t4.setBackground(Color.CYAN);
		t4.setColumns(10);
		t4.setBounds(321, 426, 205, 46);
		f.getContentPane().add(t4);
		f.setVisible(true);

	}
}
