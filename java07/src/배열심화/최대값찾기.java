package �迭��ȭ;

import java.util.Random;

public class �ִ밪ã�� {

	public static void main(String[] args) {
		// Ÿ���� ������ ���� ���� �����Ͱ� ������ �迭�� ��������.
		// �ݺ��� ���ؼ� ���� ���� �����͸� ȿ�������� �ٷ� �� ����.
		//int[] num = {11, 33, 55, 22, 44};
		//������ ���ο� �ִ� ������ 2���� ���Ͽ� ū�Ÿ� �ϳ��� ������ ���� �̰� ����ؼ� => CPU + RAM ��뷮 ���Ƽ� ��ǻ� ���� ���� ���� �����
		//������� : �ϳ��� ������ for�� �������� ���� �� ���� ������ �־ Ȯ���ϱ�
		int[] num = new int[1000];
		Random r = new Random(42);
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);
		}
		
		int max = num[0]; //�ʱ�ȭ�� �� 0�� �ƴ� num[0]�� �ִ� ����: ���� �迭�� �����θ� ������ ��� 0�� �����Ϳ� ����Ȱ� �ƴѵ� �ִ밪�� �Ǳ⶧���� ���ʿ���
		
		for (int i = 0; i < num.length; i++) {
			if (max<num[i]) {
				max = num[i];
			}
		}
		System.out.println("�ִ밪�� "+max+"�Դϴ�.");
		for(int x : num) {
			if(max<x) {
				max = x;
			}
		}
		System.out.println("�ִ밪�� "+max+"�Դϴ�.");
		
		
		//�ִ밪�� ���� �� ����
		//�ִ밪�� ���� �ε���
		//�迭�� ###����ũ��###�϶� ȿ������ => �ִ밪�� ���� �ε����� �迭�� �ִ°� ���� ��why? �ε����� ����� ���ݾ�.
		int max_count = 0;
		String sum = ""; //�ִ밪�� �ε����� ���ڿ��� �ٿ��ֱ� ���� ����
		
		for (int i = 0; i < num.length; i++) {
			if( num[i] == max) {
				max_count++;
				System.out.println("�ε��� ��ȣ"+i+" ");
				sum = sum + i + " ";// ���ڿ��� �����
			}
		}
		System.out.println("�ִ밪�� ���� ����"+max_count);
		System.out.println(sum);
		String[] s = sum.split(" "); //split�� String �迭�� ����� �ش�. ����� ������ ���� ������
		System.out.println(s[0]);
		System.out.println(s[1]);
			}
}
