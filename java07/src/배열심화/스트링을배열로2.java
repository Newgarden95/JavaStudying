package �迭��ȭ;

public class ��Ʈ�����迭��2 {

	public static void main(String[] args) {
		String all = "����, ����, ����, ��ǻ��";
		//1. String[]�� �ٲپ����. 
		//2. �ٲپ�����  ������ ���ԵǾ��ִٸ�, ������ ��� ���� �� , �ٽ� �迭�� ��������.
		//3. �������?
		//4. ��ǻ���� ��ġ��?
		//5. ��� ������ ���ڼ���?
		//6. ������ �̸��� �������?
		
		//1
		String[] s = all.split(",");
		//2
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			s[i] = s[i].trim();
		}
		System.out.println(s[1]);
		//3
		System.out.println("�����: "+s.length+"��");
		//4
		for (int i = 0; i < s.length; i++) {
			if(s[i].equals("��ǻ��")) {
				System.out.println("��ǻ���� ��ġ�� "+(i+1)+"��°");
			}
		}
		//5
		int sum = 0;
		for(String x : s) {
			sum += x.length();
		}
		System.out.println("��� ���ڼ��� "+sum+"�� �Դϴ�.");
		//6 
		int count = 0;
		for(String x : s) {
			if(x.length()<3) {
				count++;
			}
		}
		System.out.println("�� ���� �̸��� ������" + count + "���Դϴ�.");
				
		System.out.println("========================================");
		String s1 = "���� ���α׷��Ӿ�";
		String s2 = "��¥!!";
		System.out.println(s1+s2);//��Ʈ�� ����
		System.out.println(s1.concat(s2));//��Ʈ�� ����(�� ������ ����)
		System.out.println(s1.charAt(0)); //0��° ����(���� �ѱ��� ����)
		System.out.println(s1.endsWith("��"));// Ư���� ���ڷ� ��������
		System.out.println(s1.substring(3)); //�ε��� 3���� ���ڵ� ��� ����
		System.out.println(s1.substring(3, 8)); //�ε��� 3~7���� ����
		System.out.println(s1.contains(s2)); //s1�� s2�� ���ԵǾ��ִ���
		System.out.println(s1.lastIndexOf("��"));//s1�� "��" ������ġ �������� Url �����ö� ��� 
												//ex) www.naver.com/web1/member.html�̸� �츮�� member.html�� ��� �����ñ�?
												// lastIndexOf("/")�� ����ؼ� ���� �������� �ش��ϴ� �ε����� ���� �� substring(���� �ε���) ����Ͽ� �ּҸ� ���� �� ����
		System.out.println(s1.toUpperCase());//�빮�ڷ� ����
		System.out.println(s1.toLowerCase());//�빮�ڷ� ����
		System.out.println(s.length);//���ڼ�
		System.out.println(s1.replace("��", "��"));//����
	}
}
