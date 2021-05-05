package 파일저장;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의일기장 {
	private static JTextField t1;
	private static JTextField t2;
	public static void main(String[] args) {
		JFrame f = new JFrame(); //생성자 메소드 존재 4개있음
		//static변수: 객체생성하지 않아도 언제든 클래스이름으로 접근해서 바로 그 변수의 값을 가져다 쓸 수 있는 변수
		//			 그래픽 프로그램에서는 Font의 속성, Color의 값등을 자주 쓰므로 Static변수로 만들어 두어서 편하게 언제든 쓸 수 있음
		f.getContentPane().setBackground(SystemColor.activeCaption);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton login = new JButton("");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//로그인 처리
				String s1 = t1.getText(); //id 입력
				String s2 = t2.getText(); //pw 입력
				
				if (s1.equals("root") & s2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인성공");
					t1.setText("");
					t2.setText("");
					일기쓰기창 diary = new 일기쓰기창(); //일기쓰기창 객체 생성 ~> 기능 사용하려고
					diary.main(args);// 일기쓰기창 매인메소드 사용
				}else {
					JOptionPane.showMessageDialog(f, "로그인실패");
					t1.setText("");
					t2.setText("");
				}
			}
		});
		login.setBounds(95, 312, 133, 89);
		f.getContentPane().add(login);
		ImageIcon icon1 = new ImageIcon("left.PNG");//아이콘 경로설정
		login.setIcon(icon1);//아이콘사용
		
		JButton reset = new JButton("");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//인터페이스라는 문법
				//버튼을 클릭했을 때 처리 내용
				//t1, t2 입력한 내용 지우기 ~> 공백으로 만들기
				t1.setText("");
				t2.setText("");
			}
		});
		reset.setBounds(277, 312, 133, 89);
		f.getContentPane().add(reset);
		ImageIcon icon2 = new ImageIcon("right.PNG");//아이콘 경로설정
		reset.setIcon(icon2);//아이콘사용
		
		JLabel lblNewLabel = new JLabel("아이디:");
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 29));
		lblNewLabel.setBounds(85, 161, 152, 42);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호:");
		lblNewLabel_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 29));
		lblNewLabel_1.setBounds(85, 223, 152, 42);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		t1.setBounds(249, 167, 175, 42);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		t2.setColumns(10);
		t2.setBounds(249, 223, 175, 42);
		f.getContentPane().add(t2);
		
		JLabel top = new JLabel("");
		top.setBounds(123, 10, 301, 141);
		f.getContentPane().add(top);
		ImageIcon icon = new ImageIcon("top.PNG");//이미지 넣기 위해 객체 생성 ~> 생성자 중 이미지 이름을 통해찾기
		top.setIcon(icon);//실행
		
		f.setVisible(true);
	}
}
