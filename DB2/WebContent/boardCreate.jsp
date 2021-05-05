<%@page import="db.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%
   String id = request.getParameter("id");
   String title = request.getParameter("title");
   String content = request.getParameter("content");
   String writer = request.getParameter("writer");
   %>
    <%
    Board board = new Board();
    board.create(id, title, content, writer);
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판입니다.</title>
</head>
<body>
<h3>게시판</h3>
<hr color = "green" size = 5>
작성자:<%=writer %> (<%=id %>)<br>
<hr size = 5 width = "160" align="left" color = "black">
<%=content %><br>


</body>
</html>