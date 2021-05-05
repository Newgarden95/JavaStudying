package No1기본알고리즘;

public class 다중루프 {

	public static void main(String[] args) {
		System.out.println("  |  1  2  3  4  5  6  7  8  9");
		System.out.println("--+---------------------------");
		for (int i = 1; i <= 9; i++) {	
			System.out.print(i+" |");
			for (int j = 1; j <= 9; j++) {
				System.out.format("%3d",i*j); //3개씩 공간할당
			}System.out.println();
		}
	}
}
