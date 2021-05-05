package 순차문;

import javax.swing.JOptionPane;
//ctrl + shift + f => 박스 정렬
public class 순차문연습문제 {

	public static void main(String[] args) {
		String purchase = JOptionPane.showInputDialog("구매항목");  //구매항목의 입력을 받기 위해 문자열타입의 변수 선언과 
																//JOptionPane.showInputDialog() 메서드 사용
		int money = 5000; // 지불금액 정수형타입 변수에 넣기
		String result = ""; // 아래 조건문 결과 출력을 깔끔하게 하기 위해 result 빈 문자열 변수를 선언 
		
		if (purchase.equals("과자")) { // 문자열 비교를 위해 equals()메서드 사용
			result = "과자라면 어린아이군요"; // 조건문을 통과하면 result라는 변수 해당하는 결과값을 넣는다
		} else if (purchase.equals("라면")) { // 구매항목이 과자가 아닌 경우 라면과 비교하여 위와 같은 동작을 반복한다.
											// 만약, 구매항목이 라면이라면 다음 조건문은 실행하지 않고 break
			result = "라면이면 성인이군요";
		} else if (purchase.equals("커피")) {
			result = "커피면 맛있게드세요";
		} else {
			result = "무언가를 샀군요";
		}
		JOptionPane.showMessageDialog(null, result); //JOptionPane.showMessageDialog()를 통해 결과를 화면에 출력

		
		String vip = JOptionPane.showInputDialog("당신은 vip입니까?"); //vip 유무의 입력값 받기
		String result1 = ""; // 위에 구매항목 문제 처럼 결과값 출력을 위해 result1 이라는 변수 선언
		
		if (vip.equals("yes")) { // 입력값이 yes인 경우
			int money_new = money - 1000; //money_new라는 변수에 할인 값을 계산한 결과를 넣어준다.
			result1 = "1000원을 할인하여 결제되어 " + money_new + "원입니다."; //원하는 출력값

		} else if (vip.equals("no")) {
			result1 = "구매금액은 할인 없이 " + money + "원입니다.";
		}
		JOptionPane.showMessageDialog(null, result1); //JOptionPane.showMessageDialog()를 통해 결과를 화면에 출력
	}

}
