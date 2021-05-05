package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 예제2 {

   public static void main(String[] args) {
      JFrame f = new JFrame();
      f.setSize(1000, 450);
      //물흐르듯이 순서대로 배치를 해주는 부품 필요
      FlowLayout flow = new FlowLayout();
      f.setLayout(flow);
      
      int[] seat = new int[200]; //{1,0,0,....} 
      
      for (int i = 0; i < 200; i++) {
         JButton b = new JButton();
         b.setText(i + "");
         f.add(b);
         b.setBackground(Color.yellow);
         
         b.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               System.out.println("버튼을 눌렀군요.!");
               b.setBackground(Color.red);
               System.out.println("좌석번호는 " + b.getText()); //"100"
               //좌석번호가 seat배열의 index역할! => int
               int index = Integer.parseInt(b.getText()); //100
               //배열의 각 index의 값 0인 경우: 예매가 안된 상황이라고 가정
               //배열의 각 index의 값 1로 변경한 경우: 예매가 된 상황이라고 가정
               seat[index] = 1;  //seat[100] = 1;
               b.setEnabled(false); //클릭기능을 막음.
            }
         });
      }
      JButton b2 = new JButton();
      b2.setText("결제하기");
      f.add(b2);
      b2.setBackground(Color.green);
      
      b2.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            //seat배열에 있는 값 하나씩 가지고 와서, 각 값이 1인 경우 
            //예매된 자리입니다라고 프린트!
        	 int count =0;
        	 for (int i = 0; i < seat.length; i++) {
				if (seat[i] == 1) {
					System.out.println(i+">>예매된 자리입니다");
					count++;	
				}
			}
        	 System.out.println("총  금액은 "+ 10000*count+"원 입니다.");
         }
      });

      f.setVisible(true);
   }

}