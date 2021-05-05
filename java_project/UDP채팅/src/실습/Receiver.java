package 실습;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receiver {
	public static void main(String[] args) throws IOException{
		byte[] buf = new byte[256];
		
		DatagramSocket socket = new DatagramSocket(5000);//클라이언트의 포트 넘버
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		socket.receive(packet);
		System.out.println(new String(buf));
	}
}
