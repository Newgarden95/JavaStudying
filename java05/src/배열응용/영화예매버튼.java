package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 영화예매버튼 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(800,650);
		
		for (int i = 0; i < 200; i++) {
			JButton b = new JButton();
			b.setText(i+"번좌석");
			b.setBackground(Color.yellow);
			//물흐르듯이 순서대로 배치해주는 부품이 필요
			FlowLayout flow = new FlowLayout();
			f.setLayout(flow);
			f.add(b);
			b.addActionListener(new ActionListener() {//버튼에 액션기능을 붙여줘
				
				@Override
				public void actionPerformed(ActionEvent e) { //버튼누른경우 실행
					System.out.println("버튼을 눌렀군요!");	
					b.setBackground(Color.red); //눌렀을때 색들어가게
					System.out.println(b.getText()); 
				}
			});
		}
		
		f.setVisible(true);
	}

}
