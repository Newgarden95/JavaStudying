package �迭��ȭ;

public class ���������� {

	public static void main(String[] args) {
		int[] x = {100,200,300}; //���� �� 4�� => x���� �ּ�(������)+ �迭�� �� ����(x�� ����ִ� �ּҷ� �� ������ �ε����� �����ϰ���) +�迭���� 
								//�б� ���� ���� length
		//int[] y = x; //�ּҰ��� �־��� => ���� �����ּҸ� �����ִ� �迭���� ��Ұ� �ٲ�� �ڿ������� �ּҸ� ���� �༮�� �ٲ�Ե� //�迭�� �ּҸ� �����ϴ� �� = ��������
		
		//�迭�� ���� ���縦 �ؾ� Ŭ���� ����
		int[] y = x.clone();  // ���� ���� = �迭�� �ּҰ� ����Ű�� ������ ����� ����(�ε����� ����Ű�� ���� ������)
		
		System.out.print("������ x: ");
		for( int a : x) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		System.out.print("������ y: ");
		for( int a : y) {
			System.out.print(a + " ");
	}	
		x[0] = 999;
		System.out.println();
		System.out.println("---------------");
		System.out.print("������ x: ");
		for (int a : x) {
			System.out.print(a+ " ");
		}
		System.out.println();
		System.out.print("������ y: ");
		for (int a : y) {
			System.out.print(a+ " ");
		}
		//�⺻�� ���� ��� �� �����Ŀ� y���� ������ �ȵ� ������ �� �迭(������)������ ���ϴ°�? �⺻�� ������ ���� �����ϴ� �Ű� �������� �ּҰ��� 
		
	}

}
