package �ݺ���;

import java.util.Random;

import javax.swing.JOptionPane;

public class �ݺ���2 {

	public static void main(String[] args) {
		//int cor = 55;
		int o = 0; // 
		int x = 0; // ������ ���� �õ��� Ƚ��
		Random r = new Random();
		int cor = r.nextInt(100);
		
		while (true) {
			String data = JOptionPane.showInputDialog("���� �Է¶�:"); //�Էµ����� ����
			int data2 = Integer.parseInt(data);  //���ڿ� -> ������ ����ȯ

			if (data2 == cor) { //�Է��� �����Ϳ� ���䵥���Ͱ� ��ġ�Ҷ�
				o++;
				System.out.println("���α׷��� �����մϴ�."+"\n�� �õ� Ƚ����"+x+"ȸ �Դϴ�." + "\n�� ���� ���䰳���� " + o + "���Դϴ�.");
				break;
			} else { //���� �Էµ����Ϳ� ���䵥���� ����ġ �� ���
				System.out.println("������ �ƴմϴ�.");
				if (data2 > cor) { //�Էµ����Ͱ� ���䵥���ͺ��� ū ���
					x++; //�õ� Ƚ�� ++
					System.out.println("���亸�� ũ��.");
				} else { //�Էµ����Ͱ� ���䵥���ͺ��� ���� ���
					x++; 
					System.out.println("���亸�� �۴�.");

				}

			}

		}
	}
}
