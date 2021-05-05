package 배열;

public class 배열만들기 {

	public static void main(String[] args) {
		//배열: 늘어놓다라는 의미
		//array(어레이)
		
		//int[] num = new int[1000]; // num이라는 변수에 길이가 1000인 배열 생성 ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ 복도식 아파트 처럼 생김 7층에 첫번쨰 집 
		
		int[] num2 = new int[5]; //int만 넣겠다는 얘기, 같은 타입만 사용가능/ 고정된 크기를 갖는다(크기 변경 불가!!)
		/* 1. 그림을 그려보세요 1. 그림그리기
							ㅁ ㅁㅁㅁㅁㅁ ㅁ
						  7층    각 호수  lenght(랭스)
		 * 2.전체 변수가 몇개 생겼나요? 
		 * 3.각 변수에는 무엇이 들어있을까요? num2: 데이터들이 들어있는 주소   int[5]: 자동초기화된 값, 0으로 초기화됨
		 * 4.첫번째를 가리킬 때는 num2[0]
		 *   얼마가 들어있을까요?
		 * 5.두번째 num2[1] 위치를 나타냄. 300을 넣어서 print 
		 * 6.num2에는 무엇이 들어있는가? 주소
		 */
		
		System.out.println(num2); //배열 변수(저장공간)의 주소
		System.out.println(num2.length); //length : 읽기전용, 배열에 들어간 저장공간의 개수
		System.out.println(num2[0]); //아무것도 안넣었는데도 0이라는 정수가 들어가있음 자동적으로!!
		num2[1] = 300;
		System.out.println(num2[1]);
		
	}

}
