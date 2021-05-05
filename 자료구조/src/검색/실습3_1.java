package 검색;
import java.util.Scanner;
//선형검색
public class 실습3_1 {
	static int search(int x[], int num, int key) {
		int index = 0;
		while(true) {
			// 배열에서 요소값 검색에 있어 종료 조건 2가지
			//1. 배열내에 원하는 요소값(키값)이 없는 경우 
			if(index == num) { //순차적으로 마지막 인덱스 까지 확인 후 인덱스 범위를 벗어난 경우 
							   //즉, 배열의 끝을 지났다. => 일치하는 값이없으므로 검색 실패!
				return -1; //return문은 함수에서의 탈출을 의미한다.
			}
			//2. 배열내에 원하는 요소값(키값)이 있는 경우
			else if(x[index]==key) { //배열안에 검색에 해당하는 요소값이 있는 경우
				return index;
			}
			index++;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수: ");
		int num = sc.nextInt();

		int[] x = new int[num];
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextInt();
		}
		System.out.print("검색할 값: ");
		int key = sc.nextInt();
		int result = search(x, num, key);
		
		if(result == -1) {
			System.out.println("해당하는 요소값이 없습니다.");
		}
		else {
			System.out.println(key+"은(는) x["+result+"]에 있습니다.");
		}
	}

}
