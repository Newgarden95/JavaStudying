<%@page import="shop.계산기"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//HttpServletRequest request = new HttpServletRequest();
	String n1 = request.getParameter("n1"); //"200"
	String n2 = request.getParameter("n2"); //"100"
	int s1 = Integer.parseInt(n1);
	int s2 = Integer.parseInt(n2);
	계산기 cal = new 계산기();
	int result = cal.mul(s1, s2);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신의 두 수의 곱은 <%= result %>
</body>
</html>