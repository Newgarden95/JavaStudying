package �迭����;

import javax.swing.JOptionPane;

public class ���� {

	public static void main(String[] args) {
		//1. �۳⿡ ���� �;��� �� ������ �Է¹޾� ��������.
		// ���ֵ�, ���, ����
		//2. ���ؿ� ���� �;��� �� ������ �Է¹޾� ��������.
		// ���ֵ�, �λ�, ���
		// ��ġ�ϴ� �׸��� ������ ������� ��ġ�� ã���ּ���.
		String[] name = new String[3];
		String[] new_name = new String[3];
		
		for (int i = 0; i < name.length; i++) {
			name[i] = JOptionPane.showInputDialog("�۳⿡ ���� �;��� �� ������ �Է��Ͻÿ�:");
		}
		for (int i = 0; i < new_name.length; i++) {
			new_name[i] = JOptionPane.showInputDialog("���ؿ� ���� �;��� �� ������ �Է��Ͻÿ�:");
		}
		int count = 0;
		for (int i = 0; i < new_name.length; i++) {
			if ( name[i].equals(new_name[i])) {
				count++;
				System.out.println("��ġ�ϴ� �׸���"+i+ " ��°�Դϴ�.");
				System.out.println("��Ҵ� "+name[i]+" �Դϴ�");
			}
		}
		System.out.println("��ġ�ϴ� �׸��� ������ "+count+"�� �Դϴ�.");
	}
}
