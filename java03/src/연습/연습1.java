package 연습;

import javax.swing.JOptionPane;

/*순차문
 * 1. 어떤 입력을 받아(1~2개) : 점심 저녁
 * 2. 간단한 처리 : 양식, 한식 , 중식
 * 3. 처리 결과를 출력
 */
public class 연습1 {

	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("추천 받고 싶은 점심 메뉴를 선택하세요(한식/중식/양식)");
		String result = "";

		if (input1.equals("한식")) {
			result = "한정식";
		} else if (input1.equals("양식")) {
			result = "스테이크";
		} else if (input1.equals("중식")) {
			result = "짜장면";
		}
		JOptionPane.showMessageDialog(null, "추천받은 점심메뉴는 " + result);

		String input2 = JOptionPane.showInputDialog("추천 받고 싶은 저녁 메뉴를 선택하세요(한식/중식/양식)");
		String result1 = "";
		if (input2.equals("한식")) {
			result1 = "한정식";
		} else if (input2.equals("양식")) {
			result1 = "스테이크";
		} else if (input2.equals("중식")) {
			result1 = "짜장면";
		}

		JOptionPane.showMessageDialog(null, "추천받은 점심메뉴는 " + result);
		JOptionPane.showMessageDialog(null, "추천받은 저녁메뉴는 " + result1);
	}

}
