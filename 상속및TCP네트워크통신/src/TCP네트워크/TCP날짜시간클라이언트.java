package TCP네트워크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP날짜시간클라이언트 {
	public static void main(String[] args) throws Exception, Exception {
		for (int i = 0; i < 500; i++) {
			Socket socket = new Socket("localhost", 9000); //현재 자신의 아이피주소로 9000번대 서버소켓에 연결된 클라이언트 소켓 생성
			System.out.println("클라이언트가 서버와 연결되었습니다.");
			
			//socket.getInputStream() => 소켓을 통해 서버에서 넘어온 데이터 안으로 받아(입력해)
			InputStream input = socket.getInputStream(); //서버에서 보낸거 받기(현재 받은게 문잔지 뭔지 모르는 상태), 1byte 단위로 받음
			//1byte로 처리되는 아직 문자인지 인식이 안된 데이터 형태를 2byte 문자로 인식시켜주는 클래스
			
			//Reader/Writer : Char(1byte) 단위의 입출력(데이터를 받고/보내기)
			InputStreamReader reader = new InputStreamReader(input); //1->2 바이트로 변경(글자로 변경해줌=> reader) 
			
			BufferedReader buffer = new BufferedReader(reader); //2바이트 단위로 글을 받아줌(글자 처리), 받은것들 줄단위로 받고싶은 경우 => 문자를 줄단위로 받아옴
			
			String data = buffer.readLine(); //buffer에서 한줄만 읽어오기
			System.out.println(i+"번째로 서버로 부터 받은 데이터>>" + data);
			
			Thread.sleep(10);//시간조절
		}
	}
}
