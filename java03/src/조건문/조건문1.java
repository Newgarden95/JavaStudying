package ���ǹ�;

import java.util.Date;

public class ���ǹ�1 {

	public static void main(String[] args) {
		//new Ű���带 �̿��ؼ� DateŬ������ ���� ��ü�� ��(=DateƲ�� ���� ��ǰ�� ��)
		Date date = new Date();  //date��� ������ �־� Ram�� ���� => ��¥�� �ð��� ���� ������ �˷��ִ� Ŭ����
		int hour = date.getHours(); // ���� ��� ������� get_____�� ���̻��
		System.out.println("���� �ð��� "+hour);
		
		System.out.println("�λ縦 ����ϼ���!");
		
		if (hour <= 11 ) {
			System.out.println("�¸��!");
		}
		else if ( hour <= 16) {
			System.out.println("�¿����ʹ�!");
		}
		else if ( hour <= 22) {
			System.out.println("���̺��!");
		}
		else {
			System.out.println("�³���!");
		}
		
	}

}
