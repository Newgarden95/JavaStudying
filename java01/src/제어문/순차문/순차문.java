package 제어문.순차문;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		//입력
		String name = JOptionPane.showInputDialog("이름을 입력하세요"); //string은 기본데이터가 아니라 대문자
		//처리
		String result = name + "님 환영합니다.";
		//출력
		JOptionPane.showMessageDialog(null, "나는 실행 결과 출력하는 곳 "+ result);
		

	}

}
