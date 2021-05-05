<%@page import="java.sql.ResultSet"%>
<%@page import="db.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String writer = request.getParameter("writer");
    
    Board board = new Board();
    ResultSet writer1 = board.read(writer);
    String a = writer1.getString(1);
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= a%>
</body>
</html>