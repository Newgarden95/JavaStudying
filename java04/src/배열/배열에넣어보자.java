package �迭;

public class �迭���־�� {

	public static void main(String[] args) {
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t"); // \t : ��ũ�⸸ŭ ����
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			num[i] = 100;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
	}
	

}
