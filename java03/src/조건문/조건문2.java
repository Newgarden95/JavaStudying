package ���ǹ�;

import java.util.Date;
//switch-case : ������ ���� �� ���, ������ Ư���� ���� ���

public class ���ǹ�2 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth()+1; // �׳� date.getMonth()�ϸ� ���纸�� 1�� ���� ���� ���� +1����
		//2���� 28�� ���� / 4 6 9 11�� 30�� / �������� 31��
		
		System.out.println(month);
		
		
		//if-else if �ᵵ ������ switch-case���� ���� ����غ����� ��� -> but ����� ������
		// switch(����) => ������ ����(int���� 4����Ʈ), ����, ���ڿ� // �Ǽ��� ���Ұ�
		switch(month) {
		case 2:
			System.out.println("28�ϱ��� ����");
			break;     //break�� ����ϸ� case 2�� ������ ��� ����� switch������ ����
		case 4: case 6: case 9: case 11:  //���� ����� ���� case���� ���ٿ� �Ἥ ��� ����
			System.out.println("30�ϱ��� ����");
			break;
		default: //if-else������ else�� �ش��ϴ� �κ� 
			System.out.println("31�ϱ��� ����");
			break;
		}
	}

}
