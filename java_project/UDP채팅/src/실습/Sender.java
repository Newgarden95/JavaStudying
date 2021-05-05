package 실습;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Sender {
	public static void main(String[] args) throws IOException {
		DatagramSocket socket = null;
		socket = new DatagramSocket();
		String s = "I am happy";//보낼 데이터
		byte[] buf = s.getBytes();//바이트로 변환시켜서 byte타입의 배열에 넣어줌
		
		InetAddress address = InetAddress.getByName("localhost");//로컬호스트
		DatagramPacket packet = new DatagramPacket(buf,buf.length,address,5000);//보내는 데이터를 담는 패킷에는 받는측의 ip주소와 포트넘버 필요
		socket.send(packet);// packet에 담긴 데이터 소켓으로 보냄
		socket.close(); //소켓닫기
	}
}
