<%@page import="shop.계산기2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
    <%
	String n1 = request.getParameter("n1");
	String n2 = request.getParameter("n2");
	
	int s1 = Integer.parseInt(n1);
	int s2 = Integer.parseInt(n2);
	계산기2 cal = new 계산기2();
	int result = cal.minus(s1,s2);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
두 수의 차는 <%= result %>
</body>
</html>