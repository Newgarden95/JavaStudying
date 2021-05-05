package shop;

import java.util.Random;

import javax.swing.JOptionPane;

public class 회원DB {
	public int createNo() {
		Random r = new Random(1);
		int no = r.nextInt(10)+1;
		JOptionPane.showMessageDialog(null, "예약번호는 "+no+" 입니다.");
		return no;
	}
	
	public void read() {
		System.out.println("회원정보DB확인");
	}
	public void update() {
		
	}
	public void delete() {
		
	}
}
