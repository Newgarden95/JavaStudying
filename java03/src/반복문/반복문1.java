package 반복문;

import javax.swing.JOptionPane;

public class 반복문1 {

	public static void main(String[] args) {
		/*
		 * Line(13~17) : 범위에 해당하는 점수의 개수 카운트
		 * Line18 : 입력된 점수 중복시키는 변수                      Line19 : 점수를 입력한
		 * 인원수 카운트
		 */
		int rem = 0;
		int six = 0;
		int sev = 0;
		int eig = 0;
		int nin = 0;
		int score_result = 0;
		int sum = 0;
		// 중요!!!!!!!!!!!!
		// 카운트를 위한 혹은 초기화를 위한 변수 설정은 이부분
		// 계산을 위한 변수 선언은 처리부 혹은 출력부에 설정하여 사용

		// 무한반복을 위해 while문 사용
		while (true) {
			String score = JOptionPane.showInputDialog("점수를 입력하세요(종료0)"); // 점수에 대한 입력값을 담을 변수 설정(입력은 항상 문자열형태)
			if (score.equals("0")) { // 무한루프를 벗어나기 위한 조건 설정 => 위에서 입력받은 값이 "0"이면 break하게 만듬 + 출력문 안에 인원수와 평균점수 출력
				double avg = (double) score_result / sum; // 출력부분에서 입력받은 점수들의 평균을 위한 계산 변수 설정 => 평균은 실수처리해야함!!~>강제캐스팅
				System.out.println("프로그램을 종료합니다.");
				System.out.println("--------------------");
				System.out.println("60점 미만: " + rem + "명");
				System.out.println("60점 이상: " + six + "명");
				System.out.println("70점 이상: " + sev + "명");
				System.out.println("80점 이상: " + eig + "명");
				System.out.println("90점 이상: " + nin + "명");
				System.out.println("--------------------");
				System.out.println("총 " + sum + "명의 평균은 " + avg + "점");
				break;
			}

			/*
			 * 위에서 입력받은 점수는 문자열임 => 계산을 위해서는 정수형으로 형변환이 필요하다. 문자열은 객체로 강제 형변환이 불가 ->
			 * Integer.parseInt()라는 부품을 사용해서 형변환, 아래 if-else if - else 문을 보면 조건으로 입력받은 값과 비교를
			 * 하여 조건에 만족하면 조건문 안으로 들어가서 그 범위에 해당하는 인원수, 점수대와 점수를 누적해준다.
			 */
			int score_new = Integer.parseInt(score);
			if (score_new >= 90) {
				nin++;
				sum++;
				score_result += score_new;

			} else if (score_new >= 80) {
				eig++;
				sum++;
				score_result += score_new;

			} else if (score_new >= 70) {
				eig++;
				sum++;
				score_result += score_new;

			} else if (score_new >= 60) {
				eig++;
				sum++;
				score_result += score_new;

			} else {
				rem++;
				sum++;
				score_result += score_new;
			}
		}
	}

}
