package �迭��ȭ;

import java.util.Arrays;
import java.util.Random;

public class �迭���� {
//�����Ͱ� ������ �迭�� �־��!!!
	public static void main(String[] args) {
		int[] num = new int[100];
		Random r = new Random(42);
		
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);
		}
		Arrays.sort(num); //������������ �迭 �������� => ������ �ǵ帲 ~> �ı��Լ�(������ �����Ű�°�)
		for(int x: num) {
			System.out.println(x);
		}
		System.out.println("���� ū��>>>"+num[num.length-1]); //���� ū���� ����Ű�� �ε����� ���̿��� -1 �ϴ� ��
		System.out.println("���� ������>>>"+num[0]);
	}
}
