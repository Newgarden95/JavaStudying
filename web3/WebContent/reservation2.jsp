<%@page import="java.util.Random"%>
<%@page import="shop.결제DB"%>
<%@page import="shop.회원DB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String name = request.getParameter("name");
String tel = request.getParameter("tel");
String room = request.getParameter("room");
String date = request.getParameter("date");
String payment = request.getParameter("payment");
%>
<%
Random r = new Random(1);
int no = r.nextInt(10)+1;
결제DB db1 = new 결제DB();
int data = db1.createNo(no);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>예약을 성공했습니다.</h3>
<hr color = "green">
예약자 번호: <%=tel %><br>
에약번호: <%= data %><br>
예약한 방: <%=room %><br>
예약일: <%=date %><br>
<a href = "reservation.html">홈화면으로 이동</a>
</body>
</html>