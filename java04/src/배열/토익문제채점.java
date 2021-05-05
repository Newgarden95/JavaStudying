package 배열;

public class 토익문제채점 {
public static void main(String[] args) {
	//int[] 정답 = new int[999];
	//int[] 내답 = new int[999];
	
	int[] num = new int[5];
	System.out.println(num[0]);
	System.out.println(num[1]);
	System.out.println(num[2]);
	System.out.println(num[3]);
	System.out.println(num[4]);
	
	
	//i : index
	//for : 배열에 데이터를 넣거나, 꺼내거나, 위치값을 알고 싶거나 등등 -> 다양한 용도를 위해 사용
	for (int i = 0; i <num.length; i++) {
		System.out.println(i+": "+num[i]);
	}
	
	//for - each : 알아서 인덱스 0부터 끝까지 1씩 증가하면서 하나씩 꺼내오기 -> 심플하지만 제약이있음
	// 배열에서 순서대로 꺼내어 특정한 처리할 때만 사용
	for ( int x : num) { //num 배열 인덱싱값을 하나씩 차례대로
		System.out.println("for-each:"+x);
	}
}
}
