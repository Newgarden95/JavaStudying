package 스태틱;

public class 직원 {
	String name;
	String sex;
	int age;
	
	//스태틱 변수 선언
	//공통적으로 사용
	//객체생성없이 사용가능
	static int num;
	static double ageAvg;
	
	
	public 직원(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		num++;
		ageAvg = ageAvg + age;
	}
	
	public static void getAvg() {
		//static 메서드안에서는 static변수만을 사용할 수 있다.
		//static 메서드 사용하면 객체생성하지 않고 사용가능!!
		System.out.println(ageAvg/num);
	}


	@Override
	public String toString() {
		return "직원 [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
}
