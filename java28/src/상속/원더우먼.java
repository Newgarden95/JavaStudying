package 상속;

public class 원더우먼 extends 우먼 {
	int power = 10000;
	
	public void 악당을물리치다() {
		System.out.println("이름이 "+name+"인 원더우먼이 적을 물리쳤습니다.");
	}

	@Override
	public String toString() {
		return "원더우먼 [power=" + power + ", sense=" + sense + ", name=" + name + ", age=" + age + "]";
	}
	
}
