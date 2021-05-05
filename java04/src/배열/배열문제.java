package 배열;

public class 배열문제 {
/*
  1. 정수 5개 크기의 배열을 만들어서 10,20,30,40,50을 순서대로 넣는다.
           첫번째 값과 세번쨰 값을 더해서 프린트
*/
	public static void main(String[] args) {
		int[] num = new int[5]; //길이가 5인 정수형 배열선언과 생성
		//num[0] = 10;
		//num[1] = 20;
		//num[2] = 30;
		//num[3] = 40;
		//num[4] = 50;
		
		
		for (int i = 0; i<num.length; i++) { //for문을 통해 배열 길이만큼 반복해줌
			num[i] = 10*(i+1); // 10의 배수만큼 값을 각각의 num인덱스에 맞게 대입
		}
		int sum = num[0] + num[2]; // 첫번쨰 세번째 인덱스에 해당하는 데이터의 덧셈 계산을 위해 변수 설정
		System.out.println("첫 번쨰 값: " + num[0]+"\n두 번째 값: "+num[2]+"\n합: "+sum);
		
		
/*
 2. 스트링 3개 크기의 배열을 만들어서 자바, 스프링, JSP를 순서대로 넣는다.
  	=> "자바 보다는 스프링"로 출력 
 */
		String[] str = new String[3]; //문자열 데이터타입의 길이가 3인 배열 선언
		//String total = "자바,스프링,JSP";
		//String[] result = total.split(",");
		str[0] = "자바";  //각각의 인덱스에 데이터 저장
		str[1] = "스프링";
		str[2] = "JSP";
		
		System.out.println(str[0]+" 보다는 "+str[1]); // 출력
		
	}

}
