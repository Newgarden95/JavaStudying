package 배열심화;

public class 배열의깊은복사 {
//원본은 유지하고 약간의 변경을 원할 경우 => 깊은복사활용
	public static void main(String[] args) {
		String[] title = { "국어", "수학", "영어", "과학", "컴퓨터" };
		System.out.println(title);
		int[] term1 = { 100, 90, 70, 30, 50 }; // 과목에 맞게 성적 배열
		// 과학 => 55 컴퓨터 =>77 1학기, 2학기 점수 목록이 별도로 있어야 하기 때문에 깊은 복사! 필요
		int[] term2 = term1.clone(); //clone() 메서드 활용
		term2[3] = 55;
		term2[4] = 77;

		System.out.println("1학기 성적");
		for (int x : term1) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("2학기 성적");
		for (int x : term2) {
			System.out.print(x + " ");
		}

		int count = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] > term1[i]) {
				count++;

			}
		}
		System.out.println("\n1학기보다 향상된 과목의 수는 " + count + "개입니다.");
	}

}
