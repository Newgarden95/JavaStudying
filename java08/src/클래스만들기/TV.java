package 클래스만들기;
// 클래스는 무조건 대문자로 시작!!!!
// 함수는 소문자로 시작!!!
public class TV {
	public String color;
	public int size;
	
	public void on() {
		System.out.println("TV를 키다.");
	}
	
	public void off() {  //자동완성하고 Tab누르면 박스칸 이동
		System.out.println("TV를 끄다.");
	}
	
	public void ch() {
		System.out.println("TV채널을 바꾸다.");
	}
	
}
