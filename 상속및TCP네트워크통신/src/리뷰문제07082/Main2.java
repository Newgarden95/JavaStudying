package 리뷰문제07082;

public class Main2 {
	
	public static void main(String[] args) {
		//다형성
		방송국 bcs = new 프로그램("SBS", 6, "런닝맨", "코미디");  //상위객체 변수에 하위객체생성
		
		System.out.println(bcs); //프로그램 클래스(하위클래스)의 변수출력
		((프로그램)bcs).program(); //프로그램 클래스(하위클래스)의 메서드 출력 ~> 강제 형변환
	}
}
