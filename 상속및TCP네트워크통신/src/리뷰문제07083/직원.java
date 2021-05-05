package 리뷰문제07083;

public class 직원 {
	//직원의 이름, 나이, 전화번호에 해당하는 멤버변수
	String name;
	int age;
	String telNum;
	
	//생성자(객체 생성시 반드시 실행되는 부분)
	public 직원(String name, int age, String telNum) {
		this.name = name;
		this.age = age;
		this.telNum = telNum;
	}
	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", telNum=" + telNum + "]";
	}
}
