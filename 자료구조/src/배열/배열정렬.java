package 배열;

import java.util.Scanner;

public class 배열정렬 {
	//1. 배열 생성
	//2. 스왑
	
	static void swap(int[] newX, int index1, int index2) { //배열안에서 요소간 자리바꿈을 위한 메서드  #파라미터: 자리변경할 배열, 자리변경을위한 배열의 인덱스1, 자리변경을위한 배열의 인덱스1
		int temp = newX[index1];
		newX[index1] = newX[index2];
		newX[index2] = temp;
	}
	
	static void reverse(int[] x) {
		int[] newX = x;
		for (int i = 0; i < newX.length/2; i++) {
			swap(newX,i,newX.length-1-i); //스왑해주는 메서드 사용
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수 : ");
		
		int num = sc.nextInt();//요솟수 입력받기
		int[] x = new int[num];//배열 생성 
		
		for (int i = 0; i < x.length; i++) {
			System.out.print("x["+i+"] : ");
			int val = sc.nextInt();
			x[i] = val;
		}
		System.out.println("요소를 역순으로 정렬했습니다.");
		reverse(x); //역순처리 해줄 메서드 
		for (int i = 0; i < x.length; i++) {
			System.out.println("x["+i+"] = "+x[i]);//메서드 처리후 결과를 보여줌
		}
		
	}
}
