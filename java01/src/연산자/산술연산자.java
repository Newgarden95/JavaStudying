package ������;

public class ��������� {

	public static void main(String[] args) {
		//��������� : + - * / %
		//���� ���� : ctrl + Alt + ȭ��ǥ �Ʒ�
		//���� �̵� : Alt + ȭ��ǥ ����
		int x = 200;
		int y = 100;
		
		//����: cpu�� �ϴ� ������ ó��
		//������(��ȣ): ������ ó���� �ڵ��� ��ȣ�� ǥ��
		int sum = x + y;  // int sum (1) = (3) x + y(3)  -> ���������? 1���� ���� ���� 3���� ������ �ϰ� 2������ ����  /// ��� ��������� ���ʿ��� ���� �����
		int sub = x - y;
		int mult = x * y;
		double div = x / y;
		int odd = x % y;
		
		System.out.println(x+"+"+y+"="+sum);
		System.out.println(x+"-"+y+"="+sub);
		System.out.println(x+"*"+y+"="+mult);
		System.out.println(x+"/"+y+"="+div);
		System.out.println(x+"%"+y+"="+odd);

	}
}
