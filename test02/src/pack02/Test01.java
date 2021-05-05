package pack02;

public class Test01 {

	public static void main(String[] args) {
		int[] arr = new int[1000]; //길이가 1000인 정수형타입 배열 선언&생성
		arr[0] = 100;
		arr[4] = 200;
		arr[9] = 300;
		arr[999] = 500;
		int count = 0;//배열에 들어있는 값들의 개수를 카운트 하기 위한 변수
		
		System.out.println("배열에 들어 있는 값들의 개수: " + arr.length  );
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) { //배열에 초기값 이외에 숫자가 들어간 경우(즉, 배열에 숫자를 넣은경우) 카운트하기 위한 조건문
			count++;
			System.out.println((i+1)+"번째 위치: " + arr[i]);
			}
		}System.out.println("대입한 값들의 개수: " + count +"개");
	}
}
