package 그래픽2;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class 카운트다운 extends JFrame { //JFrame이 가지고 있던 메서드, 멤버변수 다 가지고 태어남
	JLabel count, image, day; //추가한 멤버변수
	
	//생성자 메서드
	//구현하고자 하는 기능 넣기 or 메서드 새로 생성해서 main에서 사용하기
	public 카운트다운() {
		setSize(800,300); // 내거니까(현재 jframe 상속을 받아기 때문에 f.setsize할필요 없음 => 객체생성할필요없이)
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(112, 76, 115, 50);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(413, 31, 231, 141);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(112, 190, 529, 61);
		getContentPane().add(lblNewLabel_2);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new 카운트다운(); // 같은클래스 안에 있기 때문에 이것만 써도됨
	}
}
