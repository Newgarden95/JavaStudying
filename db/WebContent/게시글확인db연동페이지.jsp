<%@page import="java.sql.ResultSet"%>
<%@page import="database.Db"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String writer = request.getParameter("writer");
    Db db = new Db();
   	String re = db.read(writer);
   	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	ㅎㅇㅇㅎㅇ
</body>
</html>