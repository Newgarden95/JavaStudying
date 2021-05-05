package 배열복습;

import javax.swing.JOptionPane;

public class 배열사용3 {

	public static void main(String[] args) {
		String[] name = new String[5]; // string은 참조형변수로 초기값은  null로 초기화됨.  #기본형인지 아닌지 파악 중요
		
		
		for (int i = 0; i < name.length; i++) {
			name[i] = JOptionPane.showInputDialog("가고 싶은 장소 입력:");
			
		}
		//넣은 값을 하나씩 출력
		for(String x : name) {
			System.out.println(x+ " ");
		}
		//배열안에 제주도가 있는지 확인하고 싶은경우
		for (int i = 0; i < name.length; i++) {
			if (name[i].equals("제주도")) { //==은 기본형만 사용 가능 name은 string형 참조변수기 때문에 .equals()사용  참조변수가 == 쓰는 경우는 주소값 비교할때
				System.out.println("제주도가 있음.");
				System.out.println("위치는 "+i);
			}
		}
	}

}
