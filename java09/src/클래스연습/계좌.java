package 클래스연습;

import javax.swing.JOptionPane;

public class 계좌 {
	String name;
	String account;
	int money;
	//자바에서의 변수는 언제 만들어지나?
	//타입 변수명;(선언)
	//선언할 떄 변수가 만들어진다.
	//선언의 변수가 사용할 수 있는 범위
	//클래스 아래에서 선언됨
	//클래스 전역에서 사용 가능
	//전역변수, 글로벌 변수
	//전역변수는 자동초기화됨
	
	public void deposit(int x) {
		System.out.println("입금");
		System.out.println(name+"는 입금하다.");
		System.out.println(money+ x +"원 입금");
	}
	
	public void withdraw(int y) {
		System.out.println("출금");
		System.out.println(name+"는 출금하다.");
		System.out.println(money - y +"원 남았습니다");
	}
	
	/*
	public void member() {
		name = JOptionPane.showInputDialog("이름");
		account = JOptionPane.showInputDialog("계좌");
		money = Integer.parseInt(JOptionPane.showInputDialog("금액")); 
	}*/ //직접 입력받도록 작성
}
