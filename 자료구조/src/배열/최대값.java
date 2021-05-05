package 배열;

import java.util.Scanner;

public class 최대값 {
	
	public static int max(int[] height) { //static 메서드 ~> 
		int max = height[0];
		
		for (int i = 1; i < height.length; i++) {
			if (max<height[i]) {
				max = height[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//입력 기능있는 객체 생성
		
		System.out.println("키의 최댓값을 구합니다");
		System.out.print("사람의 수 : ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		
		for (int i = 0; i < height.length; i++) {
			
			System.out.print("height["+i+"]"+" = ");
			height[i] = sc.nextInt();
		}
		System.out.println("최대값은 "+max(height));
		
	}
}
