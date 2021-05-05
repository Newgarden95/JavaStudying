package 클래스사용;

import 클래스만들기.TV;

public class TV사용 {
	public static void main(String[] args) {
		//마우스 올려서 import 선택(f2)
		//자동완성
		//컨트롤 쉬프트 o(영문 오)
		TV myTv = new TV(); // 현재 myTv에는 아래 멤버변수들이 저장된 주소를 갖고있음
		myTv.ch = 7;
		myTv.vol = 9;
		myTv.onOff = true;
											 // 원래는 주소가 찍힘, 하지만 TV.java에서 오버라이딩해서 변경됨
		System.out.println(myTv.toString()); //.찍었을 때 만들지 않은 변수와 메서드들 이외 찍히는 것들은 부모클래스가 물려주는 것(상속)
		
		TV yourTv = new TV(); // 현재 myTv에는 아래 멤버변수들이 저장된 주소를 갖고있음
		yourTv.ch = 7;
		yourTv.vol = 9;
		yourTv.onOff = true;
	}
}
