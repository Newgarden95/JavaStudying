package 순차문;

import javax.swing.JOptionPane;

public class 순차문기본 {
	public static void main(String[] args) { 
		// 순차문: 입력 -> 처리 -> 출력
		
		//입력부분
		String food = JOptionPane.showInputDialog("먹고 싶은 점심 메뉴는?");
		
		//처리부분
		/*
		 아래 주석처리된 코드부분은 간결화 하기전 코드임 => 조건문안에 계속 JOptionPane.showMessageDialog() 메서드를 사용하면서 문장이 길어지고 지저분해짐
		 따라서, 아래 주석처리된 코드를 사용하지 않고 result 변수를 통해 간결화 시킴
		 */
		String result = ""; 
		if (food.equals("짬뽕")) {   //문자열은 비교연산자 사용 불가 => 비교연산자 기본형 데이터를 위한 연산자임
			result = "중국집으로";
			//JOptionPane.showMessageDialog(null,"중국집으로"); //-> 처리부분에 들어가면 코드가 길어지고 복잡해짐
			//System.out.println("나도");
		}
		else if (food.equals("우동")) {
			result = "일식집으로";
			//JOptionPane.showMessageDialog(null, "일식집으로");
		}
		else {
			result = "집으로";
			//JOptionPane.showMessageDialog(null, "집으로");
		}
		//출력부분
		JOptionPane.showMessageDialog(null, result); //위의 조건문마다 작성하는 것 보다 출력부분에 한 번에 처리해주는게 좋은 코드
	}
}
