<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>로그인해보자!</h3>
<!-- session.getAttribute("id") == null이라는 것은 id이름으로 세션이
          설정된 것이 없다라는 의미!! 
     =>로그인이 안됨!
     => 로그인 입력폼을 보여주어야 함.
     -->
<% if(session.getAttribute("id") == null) { %>
	<form action="check2.jsp">
	아이디 : <input type="text" name="id"><br>
	패스워드 : <input type="text" name="pw"><br>
	<button type="submit">로그인요청</button>
	</form>
<%} else {%>
	<%= session.getAttribute("id") %>님 환영합니다.<br>
	<a href="board1.jsp">
		<button type="button">게시판 글쓰기 가기</button>
	</a> <br>
	<a href="logout.jsp">로그아웃</a>
<%} %>
</body>
</html>