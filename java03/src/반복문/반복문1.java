package �ݺ���;

import javax.swing.JOptionPane;

public class �ݺ���1 {

	public static void main(String[] args) {
		/*
		 * Line(13~17) : ������ �ش��ϴ� ������ ���� ī��Ʈ
		 * Line18 : �Էµ� ���� �ߺ���Ű�� ����                      Line19 : ������ �Է���
		 * �ο��� ī��Ʈ
		 */
		int rem = 0;
		int six = 0;
		int sev = 0;
		int eig = 0;
		int nin = 0;
		int score_result = 0;
		int sum = 0;
		// �߿�!!!!!!!!!!!!
		// ī��Ʈ�� ���� Ȥ�� �ʱ�ȭ�� ���� ���� ������ �̺κ�
		// ����� ���� ���� ������ ó���� Ȥ�� ��ºο� �����Ͽ� ���

		// ���ѹݺ��� ���� while�� ���
		while (true) {
			String score = JOptionPane.showInputDialog("������ �Է��ϼ���(����0)"); // ������ ���� �Է°��� ���� ���� ����(�Է��� �׻� ���ڿ�����)
			if (score.equals("0")) { // ���ѷ����� ����� ���� ���� ���� => ������ �Է¹��� ���� "0"�̸� break�ϰ� ���� + ��¹� �ȿ� �ο����� ������� ���
				double avg = (double) score_result / sum; // ��ºκп��� �Է¹��� �������� ����� ���� ��� ���� ���� => ����� �Ǽ�ó���ؾ���!!~>����ĳ����
				System.out.println("���α׷��� �����մϴ�.");
				System.out.println("--------------------");
				System.out.println("60�� �̸�: " + rem + "��");
				System.out.println("60�� �̻�: " + six + "��");
				System.out.println("70�� �̻�: " + sev + "��");
				System.out.println("80�� �̻�: " + eig + "��");
				System.out.println("90�� �̻�: " + nin + "��");
				System.out.println("--------------------");
				System.out.println("�� " + sum + "���� ����� " + avg + "��");
				break;
			}

			/*
			 * ������ �Է¹��� ������ ���ڿ��� => ����� ���ؼ��� ���������� ����ȯ�� �ʿ��ϴ�. ���ڿ��� ��ü�� ���� ����ȯ�� �Ұ� ->
			 * Integer.parseInt()��� ��ǰ�� ����ؼ� ����ȯ, �Ʒ� if-else if - else ���� ���� �������� �Է¹��� ���� �񱳸�
			 * �Ͽ� ���ǿ� �����ϸ� ���ǹ� ������ ���� �� ������ �ش��ϴ� �ο���, ������� ������ �������ش�.
			 */
			int score_new = Integer.parseInt(score);
			if (score_new >= 90) {
				nin++;
				sum++;
				score_result += score_new;

			} else if (score_new >= 80) {
				eig++;
				sum++;
				score_result += score_new;

			} else if (score_new >= 70) {
				eig++;
				sum++;
				score_result += score_new;

			} else if (score_new >= 60) {
				eig++;
				sum++;
				score_result += score_new;

			} else {
				rem++;
				sum++;
				score_result += score_new;
			}
		}
	}

}
