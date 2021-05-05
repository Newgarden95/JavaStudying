package 형변환;

public class 기본형형변환2 {
	public static void main(String[] args) {
		int sum = 333;
		int count = 5;
		//평균을 내는 경우, 하나라도 double이면
		//결과가 double임
		double avg = (double)sum/count;
		//333을 333.0으로 형변환 시키고 5로 나눔  66.6
		double avg2 = (double)(sum/count); //int형인 값(정수 간 계산은 무조건 정을 double로 바꿔라 라는 뜻
		//(double)66 -----------> 66.0 다른 데이터타입인 경우 무조건 강제형변환
	}
}
