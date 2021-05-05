package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sun.jndi.url.corbaname.corbanameURLContextFactory;
//DAO : 데이터베이스의 데이터에 접근하기 위해 생성하는 객체
public class ReservationDB {
	Connection con;
	public ReservationDB() throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); //드라이버(java <-> db사이 통신을 위한것)로드
		
		String url = "jdbc:mysql://localhost:3306/db";
		con = DriverManager.getConnection(url,"root","1234"); //드라이버메니저를 통해 db연결(커넥션 생성)
	}
	
	//
	public void create(ReservationVO bag) throws Exception {
		String sql = "insert into reservation values (?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql); //sql 구문 작성
		
		ps.setString(1, bag.getresNo()); //1번째 ?에 들어갈 값 = 가방에서 no에 해당하는것
		ps.setString(2, bag.getId());
		ps.setString(3, bag.getName());
		ps.setString(4, bag.getTel());
		ps.setString(5, bag.getDate());
		ps.setString(6, bag.getPayment());

		ps.executeUpdate();//4.mysql로 생성한 sql문 보냄 -> 쿼리문 처리
		con.close(); //커넥션 해제
		
		
	}
	
	public ArrayList<ReservationVO> read(String id) throws Exception { //입력값이 하나이기 때문에 bag을 받아오지않음
		String sql = "select * from reservation where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1,id);
		
		ResultSet rs = ps.executeQuery(); //ResultSet => db에서 테이블셋을 뜻함(순서를 가지고 꺼낼수 있고, 컬럼명을 가지고 꺼낼수 있음)
				
		
		ArrayList<ReservationVO> list = new ArrayList<ReservationVO>(); //예약정보에 대한 VO형태
		while(rs.next()) { //rs.next() => 테이블셋의 첫번째 행에 값이 있으면 true이기 때문에
						// Record pointer 이동 : Rec Pointer가 있는 지점 자료만 참조 가능 레코드는 한줄씩(row)만 읽어올수 있음
						// Record pointer의 처음 위치는 0번째이기 때문에 next() 로 1번째 레코드로 이동해야 첫번째 자료를 읽어올수있음
			String resNo = rs.getString(1);
			String id1 = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
			String date = rs.getString(5);
			String payment = rs.getString(6);
			
			ReservationVO bag = new ReservationVO(); //반환값이 여러개 이기 때문에 bag(VO)을 생성
			bag.setresNo(resNo);
			bag.setId(id1);
			bag.setName(name);
			bag.setTel(tel);
			bag.setDate(date);
			bag.setPayment(payment);
			
			list.add(bag);//VO를 통해 만든 bag을 list에 쌓는다
		}
		con.close();
		return list;
	}
	
	public ArrayList<ReservationVO> list() throws Exception {
		ArrayList<ReservationVO> list = new ArrayList<ReservationVO>();
		String sql = "select * from reservation";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			ReservationVO bag = new ReservationVO();
			//테이블에 저장되어있는 데이터를 추출해서 각 변수에 저장
			String resNo = rs.getString(1);
			String id = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
			String date = rs.getString(5);
			String payment = rs.getString(6);
			
			//추출한 row에 해당하는 값들을 VO에 저장
			bag.setresNo(resNo);
			bag.setId(id);
			bag.setName(name);
			bag.setTel(tel);
			bag.setDate(date);
			bag.setPayment(payment);
			
			//위 와같이 전체 로우를 bag담고 하나 씩 bag을 list에 넣어둠
			list.add(bag);
		}
		
		return list;
	}
	public void update() {
		
	}
	public void delete(String resNo) throws Exception {
		//예약번호를 통해서 삭제 
		String sql = "delete from reservation where resNo = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate(); //return = void
		
		
		
	}
}
