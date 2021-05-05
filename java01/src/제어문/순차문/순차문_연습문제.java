package 제어문.순차문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 순차문_연습문제 {

	public static void main(String[] args) {
		String hobby = JOptionPane.showInputDialog("당신의 취미는");
		String destination = JOptionPane.showInputDialog("당신의 여행지는");
		
		String result = hobby + destination;
		
		JOptionPane.showMessageDialog(null, "당신은 "+destination+"로 "+hobby+"를 즐기러 간다."); //null 은 출력될 화면을 어디에 띄울것인가 알려줌
		

	}

}
