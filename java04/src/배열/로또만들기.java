package �迭;

import java.util.Random;

public class �ζǸ���� {
	public static void main(String[] args) {
		int[] lotto = new int[6]; //�ߺ�üũ�� �ݵ�� �ʼ� => �迭��� set�� �ֱ�
		Random r = new Random(42); //10�� �����Ƿ� ��� ��ȭ�������� seed���� ������ �� �õ忡 ���� ������ �������� ����
		//System.out.println(r.nextInt());
		
		for (int i = 0; i < lotto.length; i++) {
			//System.out.println(r.nextInt(45)+1);
			lotto[i] = r.nextInt(45)+1; // �迭�� 1~45�� �������·� 6�� �ݺ��� ��´�
		}
		for(int x : lotto) { 
			System.out.print(x+" ");
		}
		int count = 0;
		for (int y : lotto) {
			if(y >= 30) {
				count++;
			}
		}
		System.out.println(count);
	}
}
