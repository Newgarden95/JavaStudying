package 연습문제;

public class 문제3번 {
public static void main(String[] args) {
	/*문자 비교를 위해 두개의 문자형 변수 생성과 초기화*/
	char pw = 'p';
	char pw1 = 'q';
	
	/*만약 위에 선언한 문자가 같은 경우 pass를 출력  다른경우 재입력 출력*/
	if (pw == pw1) {
		System.out.println("Pass!");
	}else {
		System.out.println("재입력!");
		}//else end
	}//main end
}//class end
