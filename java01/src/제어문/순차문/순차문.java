package ���.������;

import javax.swing.JOptionPane;

public class ������ {

	public static void main(String[] args) {
		//�Է�
		String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���"); //string�� �⺻�����Ͱ� �ƴ϶� �빮��
		//ó��
		String result = name + "�� ȯ���մϴ�.";
		//���
		JOptionPane.showMessageDialog(null, "���� ���� ��� ����ϴ� �� "+ result);
		

	}

}
