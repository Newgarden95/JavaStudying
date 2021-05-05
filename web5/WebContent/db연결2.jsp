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
    

     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원가입이 완료되었습니다.
</body>
</html>