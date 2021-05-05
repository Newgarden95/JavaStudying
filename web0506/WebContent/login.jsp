<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//로그인이 안되어있다라는 얘기
	if(session.getAttribute("id") == null){
%>
	<form action="check.jsp">
		아이디: <input name="id"><br>
		패스워드: <input name="pw"><br>
		<button>로그인 처리</button>
	</form>
<%} else { %>
	<%= session.getAttribute("id") %>님 로그인중입니다.<br>
<%} %>
</body>
</html>