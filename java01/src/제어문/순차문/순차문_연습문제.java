package ���.������;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ������_�������� {

	public static void main(String[] args) {
		String hobby = JOptionPane.showInputDialog("����� ��̴�");
		String destination = JOptionPane.showInputDialog("����� ��������");
		
		String result = hobby + destination;
		
		JOptionPane.showMessageDialog(null, "����� "+destination+"�� "+hobby+"�� ��ⷯ ����."); //null �� ��µ� ȭ���� ��� �����ΰ� �˷���
		

	}

}
