package ��������;

public class ����1�� {
	public static void main(String[] args) {
		int phy = 66;
		int math = 77;
		int eng = 88;
		int kor = 99;
		
		int sum = phy + math + eng + kor;
		//�ڹٴ� int �� int ����� ����� �׻� int!
		//�ڹٴ� �ϳ��� double(�Ǽ�)�̸� ������ �׻� double => ex) double + int = double
		//����� �Ҽ��� ���� => �Ǽ����� ����̸� ��������� �׷��� ���� ��� �Ǽ������� ����ȯ �ʼ�!!
		
		double avg = (double)sum / 4; //������ Ÿ���� �޶����� ��հ���� ���� cpu������ ����ȯ�ʿ�[casting]
		//cpu�� ram�� �ִ� �����͸� �����ٰ� ������ ����ȯ�� ��Ŵ
		// ����ȯ ���Ѽ� Ȯ���ϸ� 0.5��� ���� ������ �ִ°� Ȯ�� ����
		
		// <(cpu)�� ���� ĳ����>
		// (�����ϰ����ϴ� Ÿ�Ը�)���� => (double)sum
		
		System.out.println("��� ������ ���� "+sum);
		System.out.println("��� ������ ����� "+avg);
	}
}
