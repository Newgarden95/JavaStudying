package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Board {
	// 1. 커넥션 설정
	// 2. db연동
	// 3. sql문작성
	// 4. sql문 보내기
	Connection con; // 전역변수 설정 => 모든 메소드에서 사용해야 하니까 밖으로 뽑아냄

	public Board() throws Exception { // 생성자 => 현재 모든 메소드에서 반복되서 사용하는 부분을 하나의 메소드로 만들어서 실행
		// throws Exception(예외처리)
		// 네트워크 연결과 같이 외부연결에서는 반드시
		// 강제로 예외처리해야함!!!!
		// 1. 커넥터 사용하겠다고 설정해야함
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. 커넥터를 이용하여 db연결하기(DB: shop ID: root PW: 1234)
		String url = "jdbc:mysql://localhost:3306/shop";

		con = DriverManager.getConnection(url, "root", "1234");

		System.out.println("2. DB 연결 성공. <br>"); // 2단계 작동잘 되는지 확인하기 위한 문

	}

	public void create(String id, String title, String content, String writer) throws Exception { // 에러나는 부분 오른쪽클릭
																									// declare한후

		String sql = "insert into board values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, id);// 1번 물음표에는 id를 넣겠다
		ps.setString(2, title);// 2번 물음표에는 pw를 넣겠다
		ps.setString(3, content);// 3번 물음표에는 name를 넣겠다
		ps.setString(4, writer);// 4번 물음표에는 tel를 넣겠다

		System.out.println("3. SQL문 만들기 성공. <br>"); // 3단계 작동잘 되는지 확인하기 위한 문

// 4. 자바에서 만든 SQL문을 만들어 mySQL서버로 전송한다.
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL서버로 전송성공. <br>"); // 4단계 작동잘 되는지 확인하기 위한 문
		con.close();
	}

	public void delete(String id) throws Exception { // 삭제에는 프라이머리키인 id만 있으면됨
		String sql = "delete from board where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, id);// 1번 물음표에는 id를 넣겠다

		System.out.println("3. SQL문 만들기 성공. <br>"); // 3단계 작동잘 되는지 확인하기 위한 문

// 4. 자바에서 만든 SQL문을 만들어 mySQL서버로 전송한다.
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL서버로 전송성공. <br>"); // 4단계 작동잘 되는지 확인하기 위한 문
		con.close();
	}

	public void update(String id, String title, String content) throws Exception { // 에러나는 부분 오른쪽클릭 declare한후
		String sql = "update board set title = ?, content = ? where id = ?"; // id검색하고 비번이랑 전화번호 변경하라 set:입력(수정) / get:반환
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, title);// 1번 물음표에는 pw를 넣겠다
		ps.setString(2, content);// 2번 물음표에는 tel를 넣겠다
		ps.setString(3, id);// 4번 물음표에는 id를 넣겠다

		System.out.println("3. SQL문 만들기 성공. <br>"); // 3단계 작동잘 되는지 확인하기 위한 문

//4. 자바에서 만든 SQL문을 만들어 mySQL서버로 전송한다.
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL서버로 전송성공. <br>"); // 4단계 작동잘 되는지 확인하기 위한 문
		con.close();
	}
	
	public String read(String id) throws Exception {
		String sql = "select * from board where writer = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, id);
		ResultSet result = ps.executeQuery();
		
		String a = result.getString(id);
		String b = result.getString(title);
		String c = result.getString(content);
		
		System.out.println(result);
		con.close();
		
		return a;
	}
}
