package 클래스만들기;

public class Dog {
	//객체생성할 때 마다 멤버변수는 복사가 된다.
	//public 해야하는 이유는 참조하고자 하는 클래스랑 이 클래스가 다른 패키지안에 존재하고 있기때문
	//접근제어자  안쓰거나(default) , public, private, protect
	
	//멤버변수는 복사됨, 하지만 메서드는 불가 
	public String type;
	public int age;
	
	public void 애교() {
		System.out.println("꾸루루루루루루루루꾸루루");
	}
	
	public void 짖기() {
		System.out.println("월월월월월월월월");
	}
	
	public void 똥싸기() {
		System.out.println("xxxxxxxxxxx");
	}
	
}
