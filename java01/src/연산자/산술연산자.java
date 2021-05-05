package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		//산술연산자 : + - * / %
		//한줄 복사 : ctrl + Alt + 화살표 아래
		//한줄 이동 : Alt + 화살표 방향
		int x = 200;
		int y = 100;
		
		//연산: cpu가 하는 간단한 처리
		//연산자(기호): 간단한 처리는 코딩상에 기호로 표시
		int sum = x + y;  // int sum (1) = (3) x + y(3)  -> 실행순서는? 1번이 먼저 생성 3번의 연산을 하고 2번으로 대입  /// 모든 실행순서는 왼쪽에서 먼저 실행됨
		int sub = x - y;
		int mult = x * y;
		double div = x / y;
		int odd = x % y;
		
		System.out.println(x+"+"+y+"="+sum);
		System.out.println(x+"-"+y+"="+sub);
		System.out.println(x+"*"+y+"="+mult);
		System.out.println(x+"/"+y+"="+div);
		System.out.println(x+"%"+y+"="+odd);

	}
}
