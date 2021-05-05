package 네트워크;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP클라이언트 {
	public static void main(String[] args) throws Exception, Exception {
		for (int i = 0; i < 1000; i++) {
			Socket socket = new Socket("localhost", 9000); //클라이언트 소켓(ip, port) -> 요청해주는 객체
			System.out.println(i+" 번: 클라이언트가 9000포트 서버에 연결을 요청함");
		}
	}
}
