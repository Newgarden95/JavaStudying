package �ݺ���;

import javax.swing.JOptionPane;

//���ǹ�4�������� ����
//�� ���� ��ǥ�� �޾Ҵ����� Ȯ�� -> ���� -> ������ ������ ������ �������� but, ��������� ������ �迭���
public class �ݸ�while {

	public static void main(String[] args) {
		int iu = 0; // ������ �ʱ�ȭ�� �����־���� -> ������ ��������
		int suzy = 0;
		int heysu = 0;

		// ���� �ݺ�
		while (true) {
			String data = JOptionPane.showInputDialog("0)������, 1)����, 2)������), 3)����");
			if (data.equals("3")) { // ���ѷ����� ������ ���ؼ��� �ݵ�� �����Ű�°� �־����
				System.out.println("��ǥ�ý����� �����մϴ�.");
				System.out.println("������: " + iu + "ǥ"); // �� ��ºδ� ���ѷ����� �����Ű�� �ڵ�ȿ� Ȥ�� while�� �ۿ� ��ġ��Ŵ
				System.out.println("����: " + suzy + "ǥ");
				System.out.println("������: " + heysu + "ǥ");
				JOptionPane.showMessageDialog(null, "��ǥ�ý����� ����");
				break;
			}
			switch (data) {
			case "0":
				System.out.println("������ ����");
				iu = iu + 1; // ���� �������� �������ؾ��� iu++;
				break;
			case "1":
				System.out.println("���� ����");
				suzy = suzy + 1;
				break;
			case "2":
				System.out.println("������ ����");
				heysu = heysu + 1;
				break;

			}
		}
	}
}
