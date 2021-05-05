package 배열;

public class 배열에넣어보자 {

	public static void main(String[] args) {
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t"); // \t : 텝크기만큼 띄어쓰기
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			num[i] = 100;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
	}
	

}
