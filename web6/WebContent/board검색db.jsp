<%@page import="shop.BoardVO"%>
<%@page import="shop.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String writer = request.getParameter("writer");
    
    BoardDAO db = new BoardDAO(); //DAO(Data Access Object)클래스
    
    BoardVO bag = db.read(writer); //DAO내 read메서드 활용후 반환값 받기
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
검색된 ID:<%= bag.getId() %><br>
검색된 TITLE:<%= bag.getTitle() %><br>
검색된 CONTENT:<%= bag.getContent() %><br>
검색된 WRITER:<%= bag.getWriter() %><br>
</body>
</html>