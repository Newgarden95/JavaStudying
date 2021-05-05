package 검색;
import java.util.Scanner;
//이진탐색
public class 실습3_4 {
	static int binSearch(int[] arr, int num, int key){//이진탐색 메서드
		int startIndex = 0; //검색 범위의 시작 인덱스
		int endIndex = num-1; //검색 범위의 끝 인덱스
		int centerIndex = (startIndex + endIndex)/2; //검색 범위의 중앙 인덱스
		
		while(startIndex <= endIndex) { //끝 인덱스가 시작 인덱스보다 크거나 같을때까지
			if( arr[centerIndex]==key) { //중앙값이 키값과 같은지 판별
				return centerIndex; //인덱스값 반환
			}
			else if(arr[centerIndex]<key) { //키값이 중앙값보다 큰 경우 시작인덱스 수정
				startIndex = centerIndex + 1; //시작인덱스 = 중앙인덱스 + 1 수정
				
			}else if(arr[centerIndex]>key) {// 키값이 중앙값보다 작은 경우 끝인덱스 수정
				endIndex = centerIndex - 1; //끝인덱스 = 중앙인덱스 - 1 수정
			}
			centerIndex = (startIndex + endIndex)/2;
		}
		return -1;// 검색 실패후 나온 경우 -1을 리턴해줌
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수: ");
		int num = sc.nextInt(); //요솟수 입력
		System.out.println("오름차순으로 입력하세요.");
		
		int[] arr = new int[num]; 
		
		System.out.print("x[0] :");// 첫번째 인덱스 입력
		arr[0] = sc.nextInt();
		
		for (int i = 1; i < arr.length; i++) {//for문 범위랑 다시 생각해보기
			do {
			System.out.print("x["+i+"] :");
			arr[i] = sc.nextInt(); //오름차순으로 배열 쌓기
			}while(arr[i]<arr[i-1]); //이전 인덱스 값보다 클때만 실행하도록 ~> 오름차순이니까
		}
		System.out.print("검색할 값: ");
		int key = sc.nextInt();// 검색할 값(키값) 입력
		
		//new 실습3_4().binSearch(arr, num, key); 스태틱메서드가 아닌 경우 
		int result = binSearch(arr, num, key);
		if(result == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println(key+"은(는) x["+result+"]에 있습니다.");
		}
	}
}
