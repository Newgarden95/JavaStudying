package 클래스만들기;

public class TV {
	//멤버변수, =/  전역변수(글로벌변수 = 같은 클래스 내에서 사용가능)
	//선언의 위치가 중요함! => ram에 변수가 생성되는 것(선언)
						 //선언의 위치가 변수 사용할 수 있는 범위를 결정하기 때문에
	
	//public 접근제어자를 사용해야 다른 패키지에서도 사용 가능
	public int ch; 
	public int vol;
	public boolean onOff;
	
	//멤버메서드
	public void on() {
		System.out.println("TV를 켜다");
	}
	public void off() {
		System.out.println("TV를 끄다");
	}
	public void changeCh() {
		System.out.println("채널을 바꾸다");
	}
	
	//기존에 있던 메서드를 덮어쓰고 싶으면, 기존에 있던 메서들를 똑같이 써주면 된다. => 클래스 이름 그대로 사용하되 내부 내용수정
	//오버라이딩(재정의), override
	public String toString() {
		return "채널은 "+ch+", 볼륨은"+vol+", 켜져있는지 유무는"+onOff;
		
	
	}
}
