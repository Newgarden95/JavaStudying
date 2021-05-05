<%@page import="db.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%
   String id = request.getParameter("id");
   String title = request.getParameter("title");
   String content = request.getParameter("content");
   %>
   
    <%
    Board board = new Board();
   	board.update(id,title,content);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판입니다.</title>
</head>
<body>
<h3>게시판</h3>
게시물이 수정되었습니다

</body>
</html>