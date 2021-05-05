package 형변환;

import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 참조형형변환3 {

	public static void main(String[] args) {
		JFrame	f = new JFrame();
		f.setSize(500,500);
		
		//자동형변환(LayoutManager(큰) <------------- FlowLayout(작은))
		f.setLayout(new FlowLayout()); //주소가 들어가야함
		JButton me = new JButton("나를 눌러요");
		//자동형변환(Component(큰)<------------ 참조형형변환3.javaJButton(작은))
		f.add(me);
		
		f.setVisible(true);
	}
}
