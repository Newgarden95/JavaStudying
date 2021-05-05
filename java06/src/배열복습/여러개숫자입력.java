package 배열복습;

import javax.swing.JOptionPane;

public class 여러개숫자입력 {

	public static void main(String[] args) {
		int[] num = new int[3]; //{0,0,0} 인 상태 => 기본형변수이니까
		System.out.println(num);
		for (int i = 0; i < num.length; i++) {
			String data = JOptionPane.showInputDialog("점수를 입력하시오"); // 모든 입력은 String이다.
			num[i] = Integer.parseInt(data);// 문자열 데이터를 정수형 데이터로 캐스팅 
		    //double d = Double.parseDouble(data); 만약 데이터형태가 실수형일 경우	
		}
		for(int x : num) {
			System.out.println(x+" ");
		}
		int sum  = 0;//점수 누적을 위한 변수선언
		
		for (int i = 0; i < num.length; i++) {
			sum+=num[i]; // 점수 누적계산
		}
		System.out.println("총점: "+ sum+"점");
		System.out.println("평균: "+(double)sum/num.length);
	}

}
