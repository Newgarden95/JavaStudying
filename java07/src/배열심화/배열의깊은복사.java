package �迭��ȭ;

public class �迭�Ǳ������� {
//������ �����ϰ� �ణ�� ������ ���� ��� => ��������Ȱ��
	public static void main(String[] args) {
		String[] title = { "����", "����", "����", "����", "��ǻ��" };
		System.out.println(title);
		int[] term1 = { 100, 90, 70, 30, 50 }; // ���� �°� ���� �迭
		// ���� => 55 ��ǻ�� =>77 1�б�, 2�б� ���� ����� ������ �־�� �ϱ� ������ ���� ����! �ʿ�
		int[] term2 = term1.clone(); //clone() �޼��� Ȱ��
		term2[3] = 55;
		term2[4] = 77;

		System.out.println("1�б� ����");
		for (int x : term1) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("2�б� ����");
		for (int x : term2) {
			System.out.print(x + " ");
		}

		int count = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] > term1[i]) {
				count++;

			}
		}
		System.out.println("\n1�б⺸�� ���� ������ ���� " + count + "���Դϴ�.");
	}

}
