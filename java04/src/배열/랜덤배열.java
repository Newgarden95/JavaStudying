package �迭;

import java.util.Random;

//���� 100�� �α���ǥ���õ� �ǽ��ϱ�

/*
 ������ �� 1000���� ��������. 
 ������ 0~999������ ��
 300�̻��� ����
 400�̻��� ����
 500�̻��� ����
 600�̻��� ������ ����Ʈ
 */
public class �����迭 {
	public static void main(String[] args) {
		Random r = new Random(1);
		int[] rand = new int[1000];
		for (int i = 0; i < rand.length; i++) {
			rand[i] = r.nextInt(1000);
		}
		
		for(int x : rand) {
		System.out.print(rand[x]+"\t");
		}
		
		//1.������ �ش��ϴ� �͸� ī��Ʈ�� �� �ֵ��� ���ǹ������� ���
		
		//int thr = 0;
		//int fou = 0;
		//int fif = 0;
		//int six = 0;
		
		int[] count1 = new int[4]; // ���� �ּ�ó���� ī��Ʈ ������ �迭�� ���� ǥ��
		
		
		for (int i = 0; i < rand.length; i++) { // �ߺ��� �ȵ����� ó�� ���ǹ��� ������ ������
			if (rand[i] >= 600) {
				//six++;
				count1[3]++;
			} else if (rand[i] >= 500) {
				//fif++;
				count1[2]++;
			} else if (rand[i] >= 400) {
				//fou++;
				count1[1]++;
			} else if (rand[i] >= 300) {
				//thr++;
				count1[0]++;
			}
		}
		System.out.println("=======================");
		//System.out.println("300�̻�: " + thr + "��");
		//System.out.println("400�̻�: " + fou + "��");
		//System.out.println("500�̻�: " + fif + "��");
		//System.out.println("600�̻�: " + six + "��");
		System.out.println("300�̻�: " + count1[0] + "��");
		System.out.println("400�̻�: " + count1[1] + "��");
		System.out.println("500�̻�: " + count1[2] + "��");
		System.out.println("600�̻�: " + count1[3] + "��");

		 
		//2.if������ break�� ����� Ȯ���� �� �ִ� �κ� ��, ���� ���� ���� ������ �����ϸ� ī��Ʈ �� �̻��� �������� ī��Ʈ�� �Ұ��ϵ��� ���ǹ� ����
		int c3 = 0;
		int c4 = 0;
		int c5 = 0;
		int c6 = 0;

		for (int i = 0; i < rand.length; i++) {
			if (rand[i] >= 300) { //  600�̶�� ���ڰ� �ԷµǸ� if���� ����� ������ �´� else if ������ �ɸ��� ������ if������ break�ɷ��� ����
				c3++; // 415�� �����ص� 300�̻��̶� if���� �ɸ� ��� �����ϰ� break.
			} else if (rand[i] >= 400) {
				c4++;
			} else if (rand[i] >= 500) {
				c5++;
			} else if (rand[i] >= 600) {
				c6++;
			}
		}
		System.out.println("=======================");
		System.out.println("300�̻�: " + c3 + "��"); // �ߺ��ɰ� ������ �ȵ� �ֳĸ� if���� �����ϸ� if�� ���� ������ �ϰ� ��ü break��
		System.out.println("400�̻�: " + c4 + "��");
		System.out.println("500�̻�: " + c5 + "��");
		System.out.println("600�̻�: " + c6 + "��");

		//3. 300�̻��� ������ "������"���� ���ǹ��� �ɸ����� ����
		int c300 = 0;
		int c400 = 0;
		int c500 = 0;
		int c600 = 0;

		for (int i = 0; i < rand.length; i++) { 
			if (rand[i] >= 300) { // �� if���� ���� 300 �̻� �ش��ϴ� ���� ���ؼ��� �� ī��Ʈ => 1��
				c300++;
			}
			if (rand[i] >= 400) { // �� if���� ���� 400 �̻� �ش��ϴ� ���� ���ؼ��� �� ī��Ʈ => 2��
				c400++;
			}
			if (rand[i] >= 500) { // �� if���� ���� 500 �̻� �ش��ϴ� ���� ���ؼ��� �� ī��Ʈ=> 3��
				c500++;
			}
			if (rand[i] >= 600) { // �� if���� ���� 600 �̻� �ش��ϴ� ���� ���ؼ��� �� ī��Ʈ=> 4��
				c600++;
			}
		}
		System.out.println("=======================");
		System.out.println("300�̻�: " + c300 + "��");
		System.out.println("400�̻�: " + c400 + "��");
		System.out.println("500�̻�: " + c500 + "��");
		System.out.println("600�̻�: " + c600 + "��");
	}
}
