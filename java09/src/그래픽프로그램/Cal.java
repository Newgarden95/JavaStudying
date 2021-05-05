package 그래픽프로그램;

public class Cal {
	//더하기 기능, 뺴기, 곱, 나누기
	public int add(int...x) { //가변인자는 배열값을 갖는다 
		int result = 0;
		for(int a : x) {
			result+=a;
		}
		System.out.println(result);
		return result;
	}
	public int sub(int...x) { //가변인자는 배열값을 갖는다 
		int result = 0;
		for(int a : x) { 
			result-=a;
		}
		int result1 = result +x[0]*2; // 맨 처음 들어온 숫자도 -로 처리해버리기 때문에 처음 숫자에 2배한걸 더하면 원하는 빼기 결과를 얻음
		System.out.println(result1);
		
		return result1;
	}
	public int mul(int...x) { //가변인자는 배열값을 갖는다 
		int result = 1;
		for(int a : x) {
			result*=a;
		}
		System.out.println(result);
		
		return result;
	}
	public double div(int...x) { //가변인자는 배열값을 갖는다 
		double result = 1;//##########반드시 double형으로 취해야 하는 이유 => 계산 값들이 int형태인데 이게 0.xxx 값이 나오면 정수는 0으로 보기때문에 
		for (int a: x) {
			result = result / a; // 이런 식으로 해야지 2 4 2
		}
		 double result1 = result*x[0]*x[0]; //제곱을 곱해야 하는이유 생각해보기!!
		System.out.println(result1);
		
		
		return result1;
	}
	
}
