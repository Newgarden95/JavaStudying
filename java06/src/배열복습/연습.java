package 배열복습;

import javax.swing.JOptionPane;

public class 연습 {

	public static void main(String[] args) {
		//1. 작년에 가고 싶었던 곳 세곳을 입력받아 넣으세요.
		// 제주도, 양양, 속초
		//2. 올해에 가고 싶었던 곳 세곳을 입력받아 넣으세요.
		// 제주도, 부산, 울산
		// 일치하는 항목이 있으면 어디인지 위치를 찾아주세요.
		String[] name = new String[3];
		String[] new_name = new String[3];
		
		for (int i = 0; i < name.length; i++) {
			name[i] = JOptionPane.showInputDialog("작년에 가고 싶었던 곳 세곳을 입력하시오:");
		}
		for (int i = 0; i < new_name.length; i++) {
			new_name[i] = JOptionPane.showInputDialog("올해에 가고 싶었던 곳 세곳을 입력하시오:");
		}
		int count = 0;
		for (int i = 0; i < new_name.length; i++) {
			if ( name[i].equals(new_name[i])) {
				count++;
				System.out.println("일치하는 항목은"+i+ " 번째입니다.");
				System.out.println("장소는 "+name[i]+" 입니다");
			}
		}
		System.out.println("일치하는 항목의 갯수는 "+count+"개 입니다.");
	}
}
