package 배열심화;

public class 참조형복사 {

	public static void main(String[] args) {
		int[] x = {100,200,300}; //변수 총 4개 => x에는 주소(참조형)+ 배열의 각 공간(x에 들어있는 주소로 각 값들을 인덱스로 접근하게함) +배열길이 
								//읽기 전용 변수 length
		//int[] y = x; //주소값을 넣어줌 => 따라서 원본주소를 갖고있는 배열내의 요소가 바뀌면 자연스럽게 주소를 받은 녀석도 바뀌게됨 //배열의 주소를 복사하는 것 = 얕은복사
		
		//배열은 깊은 복사를 해야 클론이 생김
		int[] y = x.clone();  // 깊은 복사 = 배열의 주소가 가르키는 값들의 목록을 복사(인덱스가 가르키는 값을 복사함)
		
		System.out.print("변경전 x: ");
		for( int a : x) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		System.out.print("변경전 y: ");
		for( int a : y) {
			System.out.print(a + " ");
	}	
		x[0] = 999;
		System.out.println();
		System.out.println("---------------");
		System.out.print("변경후 x: ");
		for (int a : x) {
			System.out.print(a+ " ");
		}
		System.out.println();
		System.out.print("변경후 y: ");
		for (int a : y) {
			System.out.print(a+ " ");
		}
		//기본형 같은 경우 값 변경후에 y값은 변경이 안됨 하지만 왜 배열(참조형)변수는 변하는가? 기본형 변수는 값을 변경하는 거고 참조형은 주소값을 
		
	}

}
