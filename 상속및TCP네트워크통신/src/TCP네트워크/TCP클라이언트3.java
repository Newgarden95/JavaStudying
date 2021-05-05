package TCP네트워크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP클라이언트3 {
	public static void main(String[] args) throws Exception, Exception {
		for (int i = 0; i < 1000; i++) {
			Socket socket = new Socket("localhost", 9000); //클라이언트 소켓(ip, port)
			System.out.println("클라이언트2가 9000포트 서버에 연결을 요청함");
			//BufferdReader 클래스 : 문자들을 줄단위로 가지고 와서 처리할 수 있는 클래스
			//Reader, Writer 클래스는 문자들만 처리하는 클래스
			/*
			InputStream input = socket.getInputStream(); //서버에서 보낸거 받기(현재 받은게 문잔지 뭔지 모르는 상태), 1byte 단위로 받음
			//1byte로 처리되는 아직 문자인지 인식이 안된 데이터 형태를 2byte 문자로 인식시켜주는 클래스
			
			InputStreamReader reader = new InputStreamReader(input); //1->2 바이트로 변경(글자로 변경해줌=> reader)
			
			BufferedReader buffer = new BufferedReader(reader); //2바이트 단위로 글을 받아줌(글자 처리), 받은것들 줄단위로 받고싶은 경우 => 문자를 줄단위로 받아옴
			//ppt 코드*/
			BufferedReader buffer2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));//역순으로 생각 ()안에서 부터 
			//buffer : 임시 기억장소
			String data = buffer2.readLine(); //buffer2에서 한줄만 읽어오기
			System.out.println("서버로 부터 받은 데이터>>" + data);
		}
	}
}
