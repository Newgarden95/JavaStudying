package ����;

import javax.swing.JOptionPane;

/*������
 * 1. � �Է��� �޾�(1~2��) : ���� ����
 * 2. ������ ó�� : ���, �ѽ� , �߽�
 * 3. ó�� ����� ���
 */
public class ����1 {

	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("��õ �ް� ���� ���� �޴��� �����ϼ���(�ѽ�/�߽�/���)");
		String result = "";

		if (input1.equals("�ѽ�")) {
			result = "������";
		} else if (input1.equals("���")) {
			result = "������ũ";
		} else if (input1.equals("�߽�")) {
			result = "¥���";
		}
		JOptionPane.showMessageDialog(null, "��õ���� ���ɸ޴��� " + result);

		String input2 = JOptionPane.showInputDialog("��õ �ް� ���� ���� �޴��� �����ϼ���(�ѽ�/�߽�/���)");
		String result1 = "";
		if (input2.equals("�ѽ�")) {
			result1 = "������";
		} else if (input2.equals("���")) {
			result1 = "������ũ";
		} else if (input2.equals("�߽�")) {
			result1 = "¥���";
		}

		JOptionPane.showMessageDialog(null, "��õ���� ���ɸ޴��� " + result);
		JOptionPane.showMessageDialog(null, "��õ���� ����޴��� " + result1);
	}

}
