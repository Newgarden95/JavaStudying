package �迭����;

public class �迭���2 {

	public static void main(String[] args) {
		String[] name = {"ȫ�浿","�ڱ浿","���浿","�̱浿"};
		for (int i = 0;  i < name.length; i++) {
			System.out.println(name[i]);
		}
		for (String s : name) { //s����¿� ��, ù��° loop�� s���� ȫ�浿 ���� ��� �̷������� �ڱ浿 ���浿 ... �� 4���� �ݺ�
			System.out.println(s+" ");
		}
		//char �����ְ�, ���
		//boolean ��ħ�Ծ��� �ְ�, ���
		//double �÷³ְ�, ���
		//int ���ְ̳�, ���
		//for-each������ Ȯ���غ��� => �ܼ� ����� for-each�� �� ������
		
		String[] sex = {"����", "����","����","����"};
		boolean[] morning = {true,true,true,false};
		double[] eye = {1.05, 0.55,1.50,0.30};
		int[] age = {60,56,29,27};
		
		System.out.println("�̸�: "+name[0]+" "+"����: "+sex[0]+" "+"��ħ: "+morning[0]+ " "+"�÷�: "+ eye[0]+ " "+"����: "+age[0]);
		System.out.println("================================================");
		System.out.println("������ ���� ����");
		for (int i = 0; i < age.length; i++) {
			System.out.println("�̸�: "+name[i]+" "+"����: "+sex[i]+" "+"��ħ: "+morning[i]+ " "+"�÷�: "+ eye[i]+ " "+"����: "+age[i]);
		}
		System.out.println("================================================");
		
		//for�� �ȿ� �ִ� i�� ���������̹Ƿ� ���������� ����ص� ���� => for�� �ȿ����� ����ϱ� ������ �������
		System.out.println("���� ����");
		for (int i = 0; i < sex.length; i++) {
			System.out.print(sex[i]+ "\t ");
		}
		
		System.out.println("");
		System.out.println("��ħ�Ļ� ����");
		for (int i = 0; i < morning.length; i++) {
			System.out.print(morning[i]+ "\t ");
		}
		
		System.out.println("");
		System.out.println("�÷�");
		for (int i = 0; i < eye.length; i++) {
			System.out.print(eye[i]+ "\t ");	
		}
		
		System.out.println("");
		System.out.println("���� ����");
		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i]+ "\t ");
			
		}
	}

}
