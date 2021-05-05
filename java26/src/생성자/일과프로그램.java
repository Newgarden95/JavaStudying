package 생성자;

public class 일과프로그램 {
	public static void main(String[] args) {
		Day d1 = new Day("자바공부", 10, "강남");
		Day d2 = new Day("여행", 15, "강원도");
		Day d3 = new Day("운동", 11, "피트니스");
		
		int sum = d1.time + d2.time + d3.time;
		System.out.println("전체 하는 일의 시간 : "+sum);
		double avg = (double)sum/3;
		System.out.println("평균 하는 일의 시간 : "+ avg);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		System.out.println("며칠 간 했는가? "+(double)sum/24 +"일");
	}
}
