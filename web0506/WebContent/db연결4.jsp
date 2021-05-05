<%@page import="shop.MemberVO"%>
<%@page import="shop.MemberDB"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//입력해서 전송된 데이터를 받아야 한다.
        String id = request.getParameter("id");
        
        //db전담하는 부품에서 db에 넣어달라고 할 예정.
        MemberDB db = new MemberDB();
        MemberVO bag; //1.bag변수 미리 만들어두었다가
        bag = db.read(id); //2.read한 결과를 만들어두었던 bag에 넣음.
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원검색이 완료되었습니다.
<hr> <!-- 표현식, expression -->
검색된 id: <%= bag.getId() %><br>
검색된 pw: <%= bag.getPw() %><br>
검색된 name: <%= bag.getName() %><br>
검색된 tel: <%= bag.getTel() %><br>









</body>
</html>