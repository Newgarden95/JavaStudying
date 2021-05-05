package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.xml.namespace.QName;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.mysql.fabric.xmlrpc.base.Member;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Annotated;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Annotation;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.SimpleType;
import com.sun.xml.internal.txw2.Document;
import com.sun.xml.internal.txw2.TypedXmlWriter;

import shop.BoardVO;
import shop.ReadBag;

public class Db {
	Connection con; // connection 객체를 모든 메서드에서 사용 할 수있도록 전역변수로 설정

	public Db() throws Exception {// 생성자 (public 클래스명(){}꼴) => 현재 모든 메소드에서 반복해 사용하는 부분을 하나의 메소드로 만들어서 실행(#반드시
									// 클래스명과 동일!!)
		Class.forName("com.mysql.jdbc.Driver"); // 1단계: mysql 드라이버 로드과정
												// db연동과 네트워크 연결과 같은 외부연결에서는 반드시 강제로 예외처리해야함!!!!
												//

		String url = "jdbc:mysql://localhost:3306/db"; // 2단계: 연결할 db주소
		con = DriverManager.getConnection(url, "root", "1234");// 2단계: connection 객체 생성 , 드라이버 설치후 드라이버 메니저가
	}

	public void create(MemberVO bag) throws Exception {
		/*
		 * Class.forName("com.mysql.jdbc.Driver"); // 1단계: mysql 드라이버 로드과정
		 * 
		 * String url = "jdbc:mysql://localhost:3306/db"; // 2단계: 연결할 db주소 Connection
		 * con = DriverManager.getConnection(url, "root", "1234");// 2단계: connection 객체
		 * 생성 , 드라이버 설치후 드라이버 메니저가
		 */

		String sql = "insert into member values (?,?,?,?)";// 3단계: sql문
		PreparedStatement ps = con.prepareStatement(sql); // 3단계: statement 객체 생성 : sql 쿼리를 생성
		ps.setString(1, bag.getId());
		ps.setString(2, bag.getPw());
		ps.setString(3, bag.getName());
		ps.setString(4, bag.getTel());

		ps.executeUpdate(); // 4단계: 쿼리문 처리해주는 단계

	}

	public boolean check(String id, String pw) throws Exception { // 로그인 정보 체크

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");
		String url = "jdbc:mysql://localhost:3306/db";

		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = "select * from member where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, id);
		ps.setString(2, pw);

		ResultSet rs = ps.executeQuery(); // ResultSet => db에서 테이블셋을 뜻함(순서를 가지고 꺼낼수 있고, 컬럼명을 가지고 꺼낼수 있음)
		ReservationVO bag = new ReservationVO();
		// 이제 id, pw가 있는지 없는지만 확인하면됨
		boolean result = false; // 있는지 없는지를 리턴하기위해 boolean값 설정
		if (rs.next()) {
			result = true; // 위에 쿼리를 만족하면 결과값으로 true를 넘겨라
		}
		return result;
	}

	// 대용량 read => 일반 read는 하나의 가방만 들어오니까 bag으로
	public ArrayList<MemberVO> list() throws Exception {
		ArrayList<MemberVO> list = new ArrayList<>(); // 전체를 담을 컨테이너를 생성

		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/db";
		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = " select * from member "; // 전체 데이터
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) { // 반복문 동안 가방을 계속 만들어야함
			// rs.next()를 호출 할 때 마다 한 행씩 내려가서 그 행이 있는지를 체크한다: boolean(반환값)
			// true이면 각 항목의 값들을 꺼내주어야한다 -> 가방에 만들어 넣어준다

			// 각 열에 해당하는 데이터를 변수에 담아두기
			String id = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);

			MemberVO bag = new MemberVO(); // while문 밖에 생성하지 않는 이유: 밖에 설정하면 가방이 하나만 만들어짐
											// while문 돌때마다 가방만들어서 넣어야 하기때문에 while문 안에 설정
			bag.setId(id);
			bag.setPw(pw);
			bag.setName(name);
			bag.setTel(tel);
			// 다만든 가방은 컨테이너에 넣어준다
			list.add(bag);
		}
		return list;
	}

	public void delete() {

	}
}
