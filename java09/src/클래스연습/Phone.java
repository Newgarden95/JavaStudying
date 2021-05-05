package 클래스연습;

public class Phone {
	String type;
	String color;
	
	public void call() {
		System.out.println("전화를 겁니다.");
	}
	public void message(String a, String b, int c) {
		System.out.println("메시지 보내기");
		System.out.println(a+"에게 "+b+" 이라고 " + c+"시에 문자보내기");
	}
	public void internet(String a, int b, String c) {
		System.out.println(a+"를 "+c+" "+b+"시간 서핑했다");
	}
}
