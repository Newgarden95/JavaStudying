<%@page import="db.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%
   String id = request.getParameter("id");
   %>
  
    <%
    Board board = new Board();
   	board.delete(id);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판입니다.</title>
</head>
<body>
<h3>게시판</h3>
게시물이 삭제 되었습니다.

</body>
</html>