package 배열;

public class 실습2_3 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = a; //b는 a의 배열을  참조(주소를 복사 : 얕은복사)
		
		b[3] = 0;
	  System.out.print("b = ");
	  for (int i = 0; i < b.length; i++) {
		System.out.print(" "+b[i]);
	}
	  System.out.println();
	  System.out.print("a = ");
	  for (int i = 0; i < a.length; i++) {
		System.out.print(" "+a[i]);
	}
	}
}
