package �迭����;

import javax.swing.JOptionPane;

public class �迭���3 {

	public static void main(String[] args) {
		String[] name = new String[5]; // string�� ������������ �ʱⰪ��  null�� �ʱ�ȭ��.  #�⺻������ �ƴ��� �ľ� �߿�
		
		
		for (int i = 0; i < name.length; i++) {
			name[i] = JOptionPane.showInputDialog("���� ���� ��� �Է�:");
			
		}
		//���� ���� �ϳ��� ���
		for(String x : name) {
			System.out.println(x+ " ");
		}
		//�迭�ȿ� ���ֵ��� �ִ��� Ȯ���ϰ� �������
		for (int i = 0; i < name.length; i++) {
			if (name[i].equals("���ֵ�")) { //==�� �⺻���� ��� ���� name�� string�� ���������� ������ .equals()���  ���������� == ���� ���� �ּҰ� ���Ҷ�
				System.out.println("���ֵ��� ����.");
				System.out.println("��ġ�� "+i);
			}
		}
	}

}
