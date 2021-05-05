package 파일저장;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class 일기쓰기창 {
	private static JTextField t1;
	private static JTextField t2;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(SystemColor.activeCaption);
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		lblNewLabel.setBounds(60, 85, 146, 43);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 제목");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		lblNewLabel_1.setBounds(60, 152, 146, 43);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("오늘의 내용");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		lblNewLabel_2.setBounds(60, 223, 146, 43);
		f.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		t1.setBounds(218, 85, 196, 57);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		t2.setColumns(10);
		t2.setBounds(218, 154, 196, 57);
		f.getContentPane().add(t2);
		
		JTextArea t3 = new JTextArea();
		t3.setFont(new Font("HY견고딕", Font.BOLD, 20));
		t3.setColumns(10);
		t3.setRows(5);
		t3.setBounds(218, 238, 196, 132);
		f.getContentPane().add(t3);
		
		/*
		 * 
		 * */
		
		JButton save = new JButton("파일에 일기 저장");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String date = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				
				try {
					//#####################################################중요#################################################
					//만약 db에 담고 싶으면 dao로 연결시키면됨
					//dao db = new //dao();
					//#####################################################중요#################################################
					
					//해당 폴더와 스트림(통로/연결)을 만든다.
					FileWriter file = new FileWriter("c:/data/"+date+title+".txt"); //저장에 필요한 객체  ~> 파일의 위치는 java27에 생김(초기 설정 -> 경로설정하면 바꿀수있음) 불러올때는 FileReader를 통해!!
					//절대경로 : 위치를 나타낼 때 맨앞에서부터 쭉 써주는 경로
					//상대경로 : 현재 위치를 기준해서 상대적으로 써주는 경로
					file.write(date + "\n");
					file.write(title + "\n");
					file.write(content + "\n");
					file.close(); //반드시 스트림(한 쪽으로 흘러가는것)을 끊어줘야함 -> 모든게 끝나면 
					JOptionPane.showMessageDialog(f, "저장이 완료되었습니다"); //저장버튼 클릭 후 나오는 화면
					
					//저장 후 작성된 것 없애주기
					t1.setText("");
					t2.setText("");
					t3.setText("");
					
					//종료
					//System.exit(0);

				} catch (IOException a) { //IOException : 입출력에 대해서만  // 변수 e를 사용하면 에러남 왜? 위에 actionPerformed라는 메서드에 파라미터 변수랑 같아서
					System.out.println("파일로 저장 중 에러발생");
					System.out.println("에러 정보는 "+a.getMessage());
				} 
			}
				
		});
		save.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		save.setBounds(83, 396, 331, 35);
		f.getContentPane().add(save);
		

		
		f.setVisible(true);
	}
}
