package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 반복문2 {

	public static void main(String[] args) {
		//int cor = 55;
		int o = 0; // 
		int x = 0; // 정답을 위해 시도한 횟수
		Random r = new Random();
		int cor = r.nextInt(100);
		
		while (true) {
			String data = JOptionPane.showInputDialog("정답 입력란:"); //입력데이터 저장
			int data2 = Integer.parseInt(data);  //문자열 -> 정수형 형변환

			if (data2 == cor) { //입력한 데이터와 정답데이터가 일치할때
				o++;
				System.out.println("프로그램을 종료합니다."+"\n총 시도 횟수는"+x+"회 입니다." + "\n총 맟준 정답개수는 " + o + "개입니다.");
				break;
			} else { //만약 입력데이터와 정답데이터 불일치 할 경우
				System.out.println("정답이 아닙니다.");
				if (data2 > cor) { //입력데이터가 정답데이터보다 큰 경우
					x++; //시도 횟수 ++
					System.out.println("정답보다 크다.");
				} else { //입력데이터가 정답데이터보다 작은 경우
					x++; 
					System.out.println("정답보다 작다.");

				}

			}

		}
	}
}
