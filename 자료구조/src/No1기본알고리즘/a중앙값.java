package No1기본알고리즘;

import java.util.Scanner;

public class a중앙값 {
	
	static int med3(int a, int b, int c) { //중앙값 계산을 위한 메서드 ~> 결정트리를 이용하여 생각해보기
		if(a>=b) {
			if(b>=c) {
				return b;
			}
			else if(c>=b) {
				return c;
			}
			else if(c>=a) {
				return a;
			}
		}
		else if(a>=c) {
			return a;
		}
		else if(b>=c) {
			return c;
		}
		else {
			return b;
		}
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a의 값은: ");
		int a = sc.nextInt();
		System.out.print("b의 값은: ");
		int b = sc.nextInt();
		System.out.print("c의 값은: ");
		int c = sc.nextInt();
		
		System.out.println("중앙값은 "+med3(a,b,c)+" 입니다.");
	}
}
