package ��������;

public abstract class ����2�� { //abstract �� ���̸� �ҿ����ϴٴ� ������ ������ �ʿ��ϴٴ� �� ����
	public static void main(String[] args) {
		final double PI = 3.14; //���̴� �����Ǿ��־� => ����Ұ� ( finalŰ���� �̿� ~> �������� �빮�ڷ�)
		double r = 2.2;	//�������� ���� �� ����
		double area = PI * r * r; //�ϳ��� double �̸� double�̶� ���������� Ÿ���� double
		
		//�ŵ����� ���� �޼��� �̿��� ���Ѱ��
		double rr = Math.pow(r, 2); //�ŵ����� ���� �޼���
		double result = PI * rr;
		
		System.out.println("���� ������"+' '+area);
		System.out.format("���� ������ %.2f" ,result);// �Ҽ��� �ڸ� �ڸ���(print ��� format �޼��� ����ϱ�)
		
	}
}
