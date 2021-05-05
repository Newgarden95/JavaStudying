package 반복문;

import javax.swing.JOptionPane;

//조건문4번문제와 연계
//몇 건의 투표를 받았는지를 확인 -> 누적 -> 누적할 변수가 적으면 변수선언 but, 누적대상이 많으면 배열사용
public class 반목문while {

	public static void main(String[] args) {
		int iu = 0; // 변수는 초기화를 시켜주어야함 -> 쓰레기 값때문에
		int suzy = 0;
		int heysu = 0;

		// 무한 반복
		while (true) {
			String data = JOptionPane.showInputDialog("0)아이유, 1)수지, 2)박혜수), 3)종료");
			if (data.equals("3")) { // 무한루프를 끝내기 위해서는 반드시 종료시키는게 있어야함
				System.out.println("투표시스템을 종료합니다.");
				System.out.println("아이유: " + iu + "표"); // 이 출력부는 무한루프를 종료시키는 코드안에 혹은 while문 밖에 위치시킴
				System.out.println("수지: " + suzy + "표");
				System.out.println("박혜수: " + heysu + "표");
				JOptionPane.showMessageDialog(null, "투표시스템을 종료");
				break;
			}
			switch (data) {
			case "0":
				System.out.println("아이유 선택");
				iu = iu + 1; // 증가 시켰으면 저장을해야함 iu++;
				break;
			case "1":
				System.out.println("수지 선택");
				suzy = suzy + 1;
				break;
			case "2":
				System.out.println("박혜수 선택");
				heysu = heysu + 1;
				break;

			}
		}
	}
}
