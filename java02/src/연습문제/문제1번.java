package 연습문제;

public class 문제1번 {
	public static void main(String[] args) {
		int phy = 66;
		int math = 77;
		int eng = 88;
		int kor = 99;
		
		int sum = phy + math + eng + kor;
		//자바는 int 와 int 계산의 결과가 항상 int!
		//자바는 하나라도 double(실수)이면 무조건 항상 double => ex) double + int = double
		//평균은 소수점 존재 => 실수값들 계산이면 상관없지만 그렇지 않은 경우 실수형으로 형변환 필수!!
		
		double avg = (double)sum / 4; //원래는 타입이 달랐지만 평균계산을 위해 cpu에서는 형변환필요[casting]
		//cpu가 ram에 있는 데이터를 가져다가 강제로 형변환을 시킴
		// 형변환 시켜서 확인하면 0.5라는 값이 숨겨져 있는걸 확인 가능
		
		// <(cpu)의 강제 캐스팅>
		// (변경하고자하는 타입명)변수 => (double)sum
		
		System.out.println("모든 점수의 합은 "+sum);
		System.out.println("모든 점수의 평균은 "+avg);
	}
}
