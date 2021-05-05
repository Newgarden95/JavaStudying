package TCP네트워크;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

//TCP(전송계층) : 연결형 => 즉, 상호간 대화가 있어야함

public class TCP날짜시간서버 {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9000); // 9000번에 대기하는 서버소켓 생성(승인용)
		System.out.println("날짜시간관련 서버 소켓 시작!");
		System.out.println("클라이언트의 요청을 기다리는 중....");
		while(true) {
			Socket socket = server.accept(); //서버&클라이언트 소켓 연결 => 클라이언트 포트가 9000번으로 연결될때까지 무한 대기 
																									//연결되면 accept()메소드는 Socket객체를 반환
			System.out.println("클라이언트의 요청을 승인함...");
			//socket.getOutputStream() => 연결된 소켓으로 데이터를 내보내
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true); //서버에서 소켓을 통해 클라이언트로 
																													 //Stream : 바이트 단위의 입출력
																												     //양이 적어도 보내겠다 true(옵션)
			Date date = new Date(); //날짜 객체 생성
			String date1 = date.toString(); // 보낼 날짜 데이터를 문자열로 형변환해준다.
			
			out.print(date1); //작성된거 보내기
			
			out.close();
			socket.close(); //서버와 클라이언트 연결 끊기
		}
	}
}
