<%@page import="shop.MemberDB"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
        	//member.jsp에서 입력한 변수 받아서 사용하기 위해 변수에 설정
            String id = request.getParameter("id");
            String pw = request.getParameter("pw");
            String name = request.getParameter("name");
            String tel = request.getParameter("tel");
            
            //db전담하는 부품에서 db에 넣어달라고 할 예정
            MemberDB db = new MemberDB();
            db.create(id, pw, name, tel);
        %>
    
    
    <%
    // DB설정 4단계
    // 1. 커넥터 사용하겠다고 설정해야함
    Class.forName("com.mysql.jdbc.Driver"); //폴더만들기(비지니스용 패키지만들때) 패키지[com:company mysql:회사이름 jdbc:java db connection ]Driver: 클래스(대문자 사용)
    out.write("1. 커넥터 사용 설정 성공. <br>"); //=> 브라우저화면에 보여주기 브라우저니까 띄어쓰기는 <br>
    
    // 2. 커넥터를 이용하여 db연결하기(DB: shop ID: root PW: 1234)
    String url = "jdbc:mysql://localhost:3306/shop"; // url은 길기 때문에 직접써도 되지만 그냥 따로 빼서 수정하기 편하도록 설정
    							  // jdbc:mysql -> mysql사용
    							  // jdbc:mysql:// 여기까진 고정 오라클인경우 mysql대신 오라클 넣으면 됨
    							  // localhost: 내 아이피 사용 -> 근데 톰캣도 같이 사용 따라서 port번호를 부여해서 구분
    							  // mysql 포트 번호 : 3306 => mysql들어가서 status명령어 치기 -> TCP port를 확인하기
    							  //"jdbc:mysql://localhost:3306" -> dbeaver 맨 처음화면까지 연결된거임
    							  //"jdbc:mysql://localhost:3306/shop" -> shop db로 연결
    //jsp에서의 자동 import: 클릭 후, ctrl + shift +m
    //어떤 DB에 연결할 것인가?
   	Connection con = DriverManager.getConnection(url, "root", "1234");//DB주소 , ID, PW 를 이용해서 db연결하기 //커넥션 생성
    //getConnection() -> return 값이 있음 -> 따라서 변수에 넣어서 사용하기
   	//connection -> java.sql로 된 거 사용
   	//con : 참조형 변수
   	out.write("2. DB 연결 성공. <br>"); //2단계 작동잘 되는지 확인하기 위한 문
    
    // 3. (#중요)자바에서 SQL문을 만든다. => 해당부품을 써서 SQL으로 인식하게 해야함 ~> 현재 아래 sql은 그저 문장으로만 인식되기떄문에
    //URL url = new URL("주소값"); => 주소값으로 인식시켜주는 객체
    String sql = "insert into member values (?,?,?,?)"; //sql문안에는 ' ' 로 사용 왜냐면 현재 자바에서는 문장적을 떄 "" 사용하는데 ()안에도 ""로 되면 오류
    																	//현재 컴퓨터는 그저 문장으로 인식 / 사람은 주소로 이해하지만
    																	//-> dbeaver로 넘어가서 데이터가 추가되는거 확인 가능
    PreparedStatement ps = con.prepareStatement(sql); //java.sql로 임포트하기 .. SQL문 관리해주는 객체(이미 램에 저장된것 new키워드 사용할 필요 x)
    												  //2단계에서 얻은 con을 통해 SQL문장 사용
    												  //sql문을 실행시키는 기능을 갖는 객체
    
    ps.setString(1, id);//1번 물음표에는 id를 넣겠다
    ps.setString(2, pw);//2번 물음표에는 pw를 넣겠다
    ps.setString(3, name);//3번 물음표에는 name를 넣겠다
    ps.setString(4, tel);//4번 물음표에는 tel를 넣겠다
    
    out.write("3. SQL문 만들기 성공. <br>"); //3단계 작동잘 되는지 확인하기 위한 문
	    
    // 4. 자바에서 만든 SQL문을 만들어 mySQL서버로 전송한다.
    ps.executeUpdate();
    out.write("4. SQL문을 mySQL서버로 전송성공. <br>"); //4단계 작동잘 되는지 확인하기 위한 문
    %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>