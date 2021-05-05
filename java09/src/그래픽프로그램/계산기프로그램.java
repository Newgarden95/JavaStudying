package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import 클래스연습.계산기2;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class 계산기프로그램 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 22));
		lblNewLabel.setBounds(12, 28, 82, 35);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 24));
		t1.setBounds(92, 28, 144, 35);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(12, 112, 82, 35);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 24));
		t2.setColumns(10);
		t2.setBounds(92, 112, 144, 35);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() { //버튼 클릭시 이벤트 발생시켜주는 부분
			public void actionPerformed(ActionEvent e) { //actionPerformed : 버튼 누른경우 안에 실행
				System.out.println("더하기 버튼 클릭됨");
				//더하기 버튼 눌렀을때 동작하도록 코딩
				int i1 = Integer.parseInt(t1.getText()) ; //입력받은 정보를 정수형으로 형변환하여 i1이라는 변수에 넣어줌
				int i2 = Integer.parseInt(t2.getText()) ; //입력받은 정보를 정수형으로 형변환하여 i2이라는 변수에 넣어줌
				System.out.println(i1);
				System.out.println(i2);
				
				계산기2 cal = new 계산기2(); //계산기 사용을 위해 만들어둔 클래스인 계산기2를 통해 객체생성
				int result = cal.add(i1, i2);	//계산기2에 있는 더하기 기능 사용
				//반환값이 없으므로 변수설정하지 x
				t3.setText(Integer.toString(result)); //결과값을 보여줄 텍스트필드인 t3에 setText()를 사용하여 결과값 출력 #setText의 파라미터는 문자열이다
			}
		});
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 22));
		btnNewButton.setBounds(12, 197, 108, 95);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("빼기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("빼기 버튼 클릭됨");
				int i1 = Integer.parseInt(t1.getText()) ; 
				int i2 = Integer.parseInt(t2.getText()) ; 
				System.out.println(i1);
				System.out.println(i2);
				
				계산기2 cal = new 계산기2();
				int result = cal.minus(i1, i2);
				t3.setText(Integer.toString(result));
			}
		});
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 22));
		btnNewButton_1.setBounds(128, 197, 108, 95);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("곱하기");
		btnNewButton_2.setBackground(SystemColor.activeCaption);
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("곱하기 버튼 클릭됨");
				int i1 = Integer.parseInt(t1.getText()) ; 
				int i2 = Integer.parseInt(t2.getText()) ; 
				System.out.println(i1);
				System.out.println(i2);
				
				계산기2 cal = new 계산기2();
				int result = cal.mul(i1, i2); //반환값이 있기 때문에 변수로 받아줌
				f.setTitle("곱한 값은" + result); //윈도우창 타이틀로 결과값을 작성할 수 있다
				t3.setText(Integer.toString(result));
		
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 22));
		btnNewButton_2.setBounds(252, 197, 108, 95);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("나누기");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("나누기 버튼 클릭됨");
				int i1 = Integer.parseInt(t1.getText()) ; 
				int i2 = Integer.parseInt(t2.getText()) ; 
				System.out.println(i1);
				System.out.println(i2);
				
				계산기2 cal = new 계산기2();
				double result = cal.div(i1, i2);
				String result1 = String.format("%.3f", result); // 소수점자리 지정해서 출력하는 방법
				t3.setText(result1);
			}
		});
		btnNewButton_3.setBackground(SystemColor.activeCaption);
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setFont(new Font("굴림", Font.PLAIN, 22));
		btnNewButton_3.setBounds(364, 197, 108, 95);
		f.getContentPane().add(btnNewButton_3);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 24));
		t3.setColumns(10);
		t3.setBounds(161, 157, 144, 35);
		f.getContentPane().add(t3);
		f.setVisible(true);
	}
}
