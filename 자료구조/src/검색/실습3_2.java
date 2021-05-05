package 검색;
import java.util.Scanner;

public class 실습3_2 {
//검색할 값을 발견하지 못하고 배열의 끝을 지나간 경우
//검색할 값과 같은 요소를 발견한 경우
	static void search(int[] x, int key) {
		int index = 0;
		for (int i = 0; i <= x.length; i++) {
			if(index == x.length) {
				System.out.println("검색에 대한 결과가 없습니다.");
				break;
			}else if(x[i] == key){
				System.out.println(key+"은[는] x["+i+"]에 있습니다.");
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		for (int i = 0; i < x.length; i++) {
			System.out.print("x["+i+"] = ");
			x[i] = sc.nextInt();
		}
		System.out.print("검색할 값: ");
		int key = sc.nextInt();
		search(x, key);
	}
}
