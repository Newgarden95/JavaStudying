package TCP네트워크;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TCP서버 {
	public static void main(String[] args) throws Exception{
		//클라이언트의 요청을 승인해주기 위한 서버
		ServerSocket server = new ServerSocket(9000); //서버소켓객체 port 넣기 아무거나 넣으면 (승인을 위한 객체)
		System.out.println("서버 소켓 시작됨");
		System.out.println("클라이언트의 요청을 기다리는 중...");
		
		int count = 0;
		while(true) {
			Socket socket = server.accept(); //클라이언트와 서버간 소켓 생성
			count++;
			System.out.println("서버가 "+count+" 개의 클라이언트 요청을 승인함.");
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true); //소켓을 통해 클라이언트로 보내주기  , 양이 적어도 보내겠다 true(옵션)
			Date date = new Date(); //날짜 객체 생성
			String date1 = date.toString(); //
			
			out.print(date1); //작성된거 보내기
			
			out.close();
			socket.close();
		}
		
	}
}
