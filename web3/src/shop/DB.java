package shop;

import javax.swing.JOptionPane;

//db기능 담당 클래스
//back-end 부분
public class DB {
	//무슨 기능을 구현해야할까? CRUD 만 구현하면됨
	//회원정보
	
	public void create() {//회원가입시
		//db접속
		JOptionPane.showMessageDialog(null, "db에 회원가입 완료함!");
		//sql문(insert) 만들어서 db로 전송
	}
	public void read() { //회원정보보기
		//db접속				
		//sql문(select) 만들어서 db로 전송
	}
	public void update() { //회원정보 수정
		//db접속				
		//sql문(update) 만들어서 db로 전송
	}
	public void delete() { //회원정보 탈퇴
		//db접속				
		//sql문(delete) 만들어서 db로 전송
	}
}
