package �迭����;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ��ȭ���Ź�ư {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(800,650);
		
		for (int i = 0; i < 200; i++) {
			JButton b = new JButton();
			b.setText(i+"���¼�");
			b.setBackground(Color.yellow);
			//���帣���� ������� ��ġ���ִ� ��ǰ�� �ʿ�
			FlowLayout flow = new FlowLayout();
			f.setLayout(flow);
			f.add(b);
			b.addActionListener(new ActionListener() {//��ư�� �׼Ǳ���� �ٿ���
				
				@Override
				public void actionPerformed(ActionEvent e) { //��ư������� ����
					System.out.println("��ư�� ��������!");	
					b.setBackground(Color.red); //�������� ������
					System.out.println(b.getText()); 
				}
			});
		}
		
		f.setVisible(true);
	}

}
