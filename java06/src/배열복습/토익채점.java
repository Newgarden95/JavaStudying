package �迭����;

import java.util.Random;

public class ����ä�� {

	public static void main(String[] args) {
		// ���� 990��Ȱ� ������ �ʿ�
		Random r = new Random(42);
		int[] cor = new int[990];
		int[] my_cor = new int[990];
		//1���� 4���� 990������ �ֱ�
		
		for (int i = 0; i < my_cor.length; i++) {
			cor[i] = r.nextInt(4)+1; //��ȿ� 1~4���� ������ ���� ����
			my_cor[i] = r.nextInt(4)+1; //�� ��ȿ� 1~4���� ������ ���� ����
			
		}
		//����Ʈ
		for (int i = 0; i < my_cor.length; i++) {
			System.out.println(+i+"�� ���� ����"+cor[i]+" <-> ���� "+my_cor[i]);
		}
		int count = 0;
		for (int i = 0; i < my_cor.length; i++) {
			if (cor[i] == my_cor[i]) { //����� �� ���� ��ġ�ϴ� �� ī��Ʈ
				count++;
			}
		}
		System.out.println("===============================");
		System.out.println("���� ���� ������ "+count+"�� �Դϴ�.");
		System.out.println("�� ������ "+(count*1)+"�� �Դϴ�.");
	}

}
