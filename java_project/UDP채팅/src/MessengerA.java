import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MessengerA {
	// 멤버변수 설정
	protected JTextField textField;// protected: 접근제어자~ 같은 패키지의 클래스 or 상속관계
	protected JTextArea textArea;
	DatagramSocket socket; // 전송할 수 있는 UDP 소켓 생성
	DatagramPacket packet; // 생성자는 데이터를 보내기 위한 생성자와 데이터를 받기 위한 생성자로 구분
	InetAddress address = null;// 자바에서 IP 주소를 표현할때 사용하는 클래스 ~ 받을 곳의 주소 생성
	/*
	 * InetAddress의 주요 메서드 ->getAddress() - InetAddress 객체의 IP주소를 반환
	 * ->getHostAddress() - IP주소를 반환 ->getHostName() - 호스트 이름을 문자열로 반환
	 */
	final int myPort = 5000; // 내 포트 번호(변경불가)
	final int otherPort = 6000;// 상대 포트 번호(변경불가)

	// MessengerA클래스 생성자
	public MessengerA() throws IOException {
		MyFrame f = new MyFrame();
		address = InetAddress.getByName("127.0.0.1");
		socket = new DatagramSocket(myPort);
	}

	public void process() {
		while (true) {
			try {
				byte[] buf = new byte[256];
				packet = new DatagramPacket(buf, buf.length);// 전송할 데이터 생성
				socket.receive(packet);
				textArea.append("RECIEVED: " + new String(buf) + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void actionPerformed(ActionEvent evt) {
		String s = textField.getText();
		byte[] buffer = s.getBytes();
		DatagramPacket packet;

		packet = new DatagramPacket(buffer, buffer.length, address, otherPort);
		try {
			socket.send(packet);
		} catch (IOException e) {
			e.printStackTrace();
		}
		textArea.append("SENT: " + s + "\n");
		textField.selectAll();
		textArea.setCaretPosition(textArea.getDocument().getLength());
	}

	class MyFrame extends JFrame implements ActionListener { //implements인 경우  반드시 메서드 오버라이딩해서 사용!!

		public MyFrame() {
			super("MessengerA");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			textField = new JTextField(30);
			textField.addActionListener(this);

			textArea = new JTextArea(10, 30);
			textArea.setEditable(false);

			add(textField, BorderLayout.PAGE_END);
			add(textArea, BorderLayout.CENTER);
			pack();
			setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
		}

	}

}
