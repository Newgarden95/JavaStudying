package 클래스만들기;
//우리가 만드는 클래스는 메인으로 불러다 사용하는것이기 때문에 메인없이 생성하기

import javax.swing.JOptionPane;
//클래스 = 변수 + 메서드
public class 전화기 {

	//속성(property, attribue)정의 => 티비의 사이즈랑 색상이 어떤지
	//=> 멤버변수
	// 멤버(선택된)변수는 선언만 해준다
	// 멤버변수는 자동초기화됨
	//String color; // 색이란 속성은 갖고있지만 찍어내서 색을 부여하기 위해 비워둠, 참조형은 무조건 null로 초기화
	//int size; // 기본형은 0으로 초기화
	
	//함수(동작)정의 => 이 부품이 처리해야할 기능을 정의
	//function ==> 메서드라 부름 => 어떤 기능을 처리하기 위한 방법을 정의
	public void 전화하다(){
		//void : 반환값 없음 => return과 사용x
		//println, nextint() 와 같이 동작수행하고 바로 끝내는 함수가 
		System.out.println("전화기로 전화하다.");
		String a = JOptionPane.showInputDialog("번호를 입력하기");
		JOptionPane.showMessageDialog(null, a+" 로전화중");
	}
	public void 문자하다() {
		System.out.println("전화기로 문자하다.");
	}
	public void 카톡하다() {
		System.out.println("전화기로  카톡하다.");
	}
	public void 인터넷하다() {
		System.out.println("전화기로 인터넷하다.");
	}
}
