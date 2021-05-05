package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//오래 쓰기 위해서는 반드시 클래스로 만들기!!!
public class MemberDB { // 테이블 마다 새로운 거 설정해줘야함

	public void create(MemberVO bag) throws Exception { // 가방의 주소값을 받음

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. 커넥터를 이용하여 db연결하기(DB: shop ID: root PW: 1234)
		String url = "jdbc:mysql://localhost:3306/shop2";

		Connection con = DriverManager.getConnection(url, "root", "1234");

		System.out.println("2. DB 연결 성공. <br>"); // 2단계 작동잘 되는지 확인하기 위한 문

		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, bag.getId());// 1번 물음표에는 id를 넣겠다
		ps.setString(2, bag.getPw());// 2번 물음표에는 pw를 넣겠다
		ps.setString(3, bag.getName());// 3번 물음표에는 name를 넣겠다
		ps.setString(4, bag.getTel());// 4번 물음표에는 tel를 넣겠다

		System.out.println("3. SQL문 만들기 성공. <br>"); // 3단계 작동잘 되는지 확인하기 위한 문

		// 4. 자바에서 만든 SQL문을 만들어 mySQL서버로 전송한다.
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL서버로 전송성공. <br>"); // 4단계 작동잘 되는지 확인하기 위한 문
	}

	public void delete(String id) throws Exception { // 삭제에는 프라이머리키인 id만 있으면됨

		// 1. 커넥터 사용하겠다고 설정해야함
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. 커넥터를 이용하여 db연결하기(DB: shop ID: root PW: 1234)
		String url = "jdbc:mysql://localhost:3306/shop2";

		Connection con = DriverManager.getConnection(url, "root", "1234");

		System.out.println("2. DB 연결 성공. <br>"); // 2단계 작동잘 되는지 확인하기 위한 문

		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, id);// 1번 물음표에는 id를 넣겠다

		System.out.println("3. SQL문 만들기 성공. <br>"); // 3단계 작동잘 되는지 확인하기 위한 문

		// 4. 자바에서 만든 SQL문을 만들어 mySQL서버로 전송한다.
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL서버로 전송성공. <br>"); // 4단계 작동잘 되는지 확인하기 위한 문
	}

	public void update(Member3VO bag) throws Exception { // 에러나는 부분 오른쪽클릭 declare한후
		// throws Exception(예외처리)
		// 네트워크 연결과 같이 외부연결에서는 반드시 강제로 예외처리해야함!!!!
// 1. 커넥터 사용하겠다고 설정해야함
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

// 2. 커넥터를 이용하여 db연결하기(DB: shop ID: root PW: 1234)
		String url = "jdbc:mysql://localhost:3306/shop2";

		Connection con = DriverManager.getConnection(url, "root", "1234");

		System.out.println("2. DB 연결 성공. <br>"); // 2단계 작동잘 되는지 확인하기 위한 문

		String sql = "update member set pw = ?, tel = ? where id = ?"; // id검색하고 비번이랑 전화번호 변경하라 set:입력(수정) / get:반환
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, bag.getPw());// 1번 물음표에는 pw를 넣겠다
		ps.setString(2, bag.getTel());// 2번 물음표에는 tel를 넣겠다
		ps.setString(3, bag.getId());// 4번 물음표에는 id를 넣겠다

		System.out.println("3. SQL문 만들기 성공. <br>"); // 3단계 작동잘 되는지 확인하기 위한 문

// 4. 자바에서 만든 SQL문을 만들어 mySQL서버로 전송한다.
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL서버로 전송성공. <br>"); // 4단계 작동잘 되는지 확인하기 위한 문
	}

	public ReadBag read(String id) throws Exception { //한 사람에 대한 정보만 보고싶음(행)
		// 1. 커넥터 사용하겠다고 설정해야함
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. 커넥터를 이용하여 db연결하기(DB: shop ID: root PW: 1234)
		String url = "jdbc:mysql://localhost:3306/shop2";

		Connection con = DriverManager.getConnection(url, "root", "1234");

		System.out.println("2. DB 연결 성공. <br>"); // 2단계 작동잘 되는지 확인하기 위한 문

		String sql = "select * from member where id = ?"; 
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, id);// 1번 물음표에는 id를 넣겠다

		System.out.println("3. SQL문 만들기 성공. <br>"); // 3단계 작동잘 되는지 확인하기 위한 문

		// 4. 자바에서 만든 SQL문을 만들어 mySQL서버로 전송한다.
		ResultSet rs = ps.executeQuery(); //ResultSet => db에서 테이블셋을 뜻함(순서를 가지고 꺼낼수 있고, 컬럼명을 가지고 꺼낼수 있음)
		System.out.println("4. SQL문을 mySQL서버로 전송성공. <br>"); // 4단계 작동잘 되는지 확인하기 위한 문
		
		//1. 검색결과가 있는지 체크해야한다.
		//System.out.println(rs.next()); //결과값 = boolean ~> 쿼리문이 true면 안에 검색결과가 있다. =>이거 주석처리 안하면 검색결과 null로 나옴
										// 아래 보면 if문에도 rs.next()가 있잖아 총 2번 내려감 -> rs.next()할때마다 아래 행을 가르킴 현재 우리는 특정 id인경우 검색하면 1개의 레코드만있는데 이걸
										// 두번 해버리니까 null값을 가맄킴
		
		//2. 만약에 결과가 있으면, 테이블에서 원하는 데이터 항목을 꺼내주면 됨
		ReadBag bag = new ReadBag();
		if(rs.next()) {
			//꺼내주는 방법은 2가지, 1) 항목명, 2) 항목의 인덱스를 통해
			String id2 = rs.getString("id");
			String pw2 = rs.getString("pw");
			String name2 = rs.getString("name");
			String tel2 = rs.getString("tel");
			
			bag.setId2(id2);
			bag.setPw2(pw2);
			bag.setName2(name2);
			bag.setTel2(tel2);
			
		}//4개의 데이터를 member2db연결에 넘겨서 브라우저에 띄어야함 ~> VO(1개)가 필요
		return bag; //return 할때는 모든지 묶어서 보내야함!!!! 따로따로 못보냄 id2, pw2, name2, tel2 이런식으로
	}
}
