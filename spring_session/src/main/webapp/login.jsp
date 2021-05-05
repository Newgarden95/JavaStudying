<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% if(session.getAttribute("userid")==null) {%>
<form action="login">
	아이디: <input type = "text" name = "id"><br>
	패스워드: <input type = "text" name = "pw"><br>
	<button type="submit">로그인처리</button>
<% } else{ %>
	${userid}님 환영합니다.
<%} %>
</form>
</body>
</html>

