package 파일저장;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일에저장 {
	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("날짜입력");
		String s2 = JOptionPane.showInputDialog("제목입력");
		String s3 = JOptionPane.showInputDialog("내용입력");
		try {
			//해당 폴더와 스트림(통로/연결)을 만든다.
			FileWriter f = new FileWriter("c:/data/"+s1+".txt"); //저장에 필요한 객체  ~> 파일의 위치는 java27에 생김(초기 설정 -> 경로설정하면 바꿀수있음) 불러올때는 FileReader를 통해!!
			//절대경로 : 위치를 나타낼 때 맨앞에서부터 쭉 써주는 경로
			//상대경로 : 현재 위치를 기준해서 상대적으로 써주는 경로
			
			f.write(s1 + "\n");
			f.write(s2 + "\n");
			f.write(s3 + "\n");

			f.close(); //반드시 스트림(한 쪽으로 흘러가는것)을 끊어줘야함 -> 모든게 끝나면 
		} catch (IOException e) { //IOException : 입출력에 대해서만 
			System.out.println("파일로 저장 중 에러발생");
			System.out.println("에러 정보는 "+e.getMessage());
		} 
	}
}
