package 배열응용;

import 배열.배열문제;

public class 다른패키지클래스 {

	public static void main(String[] args) {
		//다른 패키지에 있는 클래스 쓰고 싶을때는 바로 객체 생성 불가 -> 위치를 알려줘야함 (import)
		배열문제 name2 = new 배열문제(); // 다른패키지여도 ctrl + space 하면 자동으로 임포트해줌
								  // 혹은, 마우스를 올려두거나 , 마우스를 올려놓고 f2누르기
		
		//많은 양의 자동 import: ctrl + shift + o
			
	}

}
