<%@page import="shop.MemberDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	
    	MemberDB db = new MemberDB();
    	int result = db.read(id, pw);
    	if(result == 1){
    		session.setAttribute("id", id);
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= session.getAttribute("id") %>님 환영합니다.<br>
<a href="login.jsp">로그인 페이지로</a>
</body>
</html>