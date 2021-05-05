package 알고리즘1장;

public class 연습문제2 {
	static int min3(int a, int b, int c) {
		int min = a;
		
		if(min > b) {
			min = b;
		}
		if(min > c) {
			min = c;
		}
		return min; //최소값 리턴
	}
	public static void main(String[] args) {
		System.out.println("min3(3,2,1) = " + min3(3,2,1));
	}
	
}
