package ������;

import javax.swing.JOptionPane;

public class �������⺻ {
	public static void main(String[] args) { 
		// ������: �Է� -> ó�� -> ���
		
		//�Էºκ�
		String food = JOptionPane.showInputDialog("�԰� ���� ���� �޴���?");
		
		//ó���κ�
		/*
		 �Ʒ� �ּ�ó���� �ڵ�κ��� ����ȭ �ϱ��� �ڵ��� => ���ǹ��ȿ� ��� JOptionPane.showMessageDialog() �޼��带 ����ϸ鼭 ������ ������� ����������
		 ����, �Ʒ� �ּ�ó���� �ڵ带 ������� �ʰ� result ������ ���� ����ȭ ��Ŵ
		 */
		String result = ""; 
		if (food.equals("«��")) {   //���ڿ��� �񱳿����� ��� �Ұ� => �񱳿����� �⺻�� �����͸� ���� ��������
			result = "�߱�������";
			//JOptionPane.showMessageDialog(null,"�߱�������"); //-> ó���κп� ���� �ڵ尡 ������� ��������
			//System.out.println("����");
		}
		else if (food.equals("�쵿")) {
			result = "�Ͻ�������";
			//JOptionPane.showMessageDialog(null, "�Ͻ�������");
		}
		else {
			result = "������";
			//JOptionPane.showMessageDialog(null, "������");
		}
		//��ºκ�
		JOptionPane.showMessageDialog(null, result); //���� ���ǹ����� �ۼ��ϴ� �� ���� ��ºκп� �� ���� ó�����ִ°� ���� �ڵ�
	}
}
