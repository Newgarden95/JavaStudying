package 배열;

public class 배열만들기2 {

	public static void main(String[] args) {
		double[] num = new double[3];
		
		for ( int i = 0 ; i< num.length ; i++) {
			System.out.println(i + ": "+num[i]);
		}
		
		for (double y : num) {
			//인덱스가 없어서 꺼낼때만 사용
			//for - each문에서 y는 num.length만큼 재사용
			System.out.println(y);
		}
	}

}
