package ������;

import javax.swing.JOptionPane;
//ctrl + shift + f => �ڽ� ����
public class �������������� {

	public static void main(String[] args) {
		String purchase = JOptionPane.showInputDialog("�����׸�");  //�����׸��� �Է��� �ޱ� ���� ���ڿ�Ÿ���� ���� ����� 
																//JOptionPane.showInputDialog() �޼��� ���
		int money = 5000; // ���ұݾ� ������Ÿ�� ������ �ֱ�
		String result = ""; // �Ʒ� ���ǹ� ��� ����� ����ϰ� �ϱ� ���� result �� ���ڿ� ������ ���� 
		
		if (purchase.equals("����")) { // ���ڿ� �񱳸� ���� equals()�޼��� ���
			result = "���ڶ�� ����̱���"; // ���ǹ��� ����ϸ� result��� ���� �ش��ϴ� ������� �ִ´�
		} else if (purchase.equals("���")) { // �����׸��� ���ڰ� �ƴ� ��� ���� ���Ͽ� ���� ���� ������ �ݺ��Ѵ�.
											// ����, �����׸��� ����̶�� ���� ���ǹ��� �������� �ʰ� break
			result = "����̸� �����̱���";
		} else if (purchase.equals("Ŀ��")) {
			result = "Ŀ�Ǹ� ���ְԵ弼��";
		} else {
			result = "���𰡸� �򱺿�";
		}
		JOptionPane.showMessageDialog(null, result); //JOptionPane.showMessageDialog()�� ���� ����� ȭ�鿡 ���

		
		String vip = JOptionPane.showInputDialog("����� vip�Դϱ�?"); //vip ������ �Է°� �ޱ�
		String result1 = ""; // ���� �����׸� ���� ó�� ����� ����� ���� result1 �̶�� ���� ����
		
		if (vip.equals("yes")) { // �Է°��� yes�� ���
			int money_new = money - 1000; //money_new��� ������ ���� ���� ����� ����� �־��ش�.
			result1 = "1000���� �����Ͽ� �����Ǿ� " + money_new + "���Դϴ�."; //���ϴ� ��°�

		} else if (vip.equals("no")) {
			result1 = "���űݾ��� ���� ���� " + money + "���Դϴ�.";
		}
		JOptionPane.showMessageDialog(null, result1); //JOptionPane.showMessageDialog()�� ���� ����� ȭ�鿡 ���
	}

}
