package �迭����;

import javax.swing.JOptionPane;

public class �����������Է� {

	public static void main(String[] args) {
		int[] num = new int[3]; //{0,0,0} �� ���� => �⺻�������̴ϱ�
		System.out.println(num);
		for (int i = 0; i < num.length; i++) {
			String data = JOptionPane.showInputDialog("������ �Է��Ͻÿ�"); // ��� �Է��� String�̴�.
			num[i] = Integer.parseInt(data);// ���ڿ� �����͸� ������ �����ͷ� ĳ���� 
		    //double d = Double.parseDouble(data); ���� ���������°� �Ǽ����� ���	
		}
		for(int x : num) {
			System.out.println(x+" ");
		}
		int sum  = 0;//���� ������ ���� ��������
		
		for (int i = 0; i < num.length; i++) {
			sum+=num[i]; // ���� �������
		}
		System.out.println("����: "+ sum+"��");
		System.out.println("���: "+(double)sum/num.length);
	}

}
