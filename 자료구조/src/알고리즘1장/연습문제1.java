package 알고리즘1장;

public class 연습문제1 {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if(b>max) {
			max = b;
		}
		if(c>max) {
			max = c;
		}
		if(d>max) {
			max = d;
		}
		return max; //최대값 리턴
	}
	public static void main(String[] args) {
		System.out.println("max3(3,2,1,6) = " + max4(3,2,1,6));
		
	}
}
