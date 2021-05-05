package 상속;

public class Manager extends Employee{
	private int bonus = 300; //bonus 라는 것은 외부에서 사용할 수 없이 이 클래스 내에서만 사용가능하도록 숨기는 기능(private: 접근제어자)
	//접근제어자
	//public(+) protected(#) 아무것도 안 붙힘 private(-)
	
	public void test() {
		System.out.println(bonus+"만원을 받으며 테스트합니다.");
	}
}
