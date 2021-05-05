<%@page import="shop.계산기2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- n1과 n2의 값을 받아줘야함 -->
<!-- n1과 n2를 int로 바꿔야함 -->
<!-- 만들어둔 계산기에게 두 개를 더해달라고 함 -->
<!-- 더한 반환값을 받아와서 클라이언트에게 전송(html로 만든후 전송 아래 자동완성되어있는거) -->

<%
	String n1 = request.getParameter("n1"); //"n1": input name이 n1인것을 넣어라
	String n2 = request.getParameter("n2");
	
	int s1 = Integer.parseInt(n1);
	int s2 = Integer.parseInt(n2);
	계산기2 cal = new 계산기2();
	int result = cal.add(s1,s2);
	
%>

<!-- 클라이언트가 볼 수 있는 부분은 요 아래 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신의 두 수의 합은 <%= result %>
</body>
</html>