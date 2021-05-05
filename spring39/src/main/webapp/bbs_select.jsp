<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 입력폼 만들기</title>
</head>
<body>
	<h3>게시판 글검색</h3>
	<hr>
	<a href = "all">전체검색</a><!-- all이라는 가상주소 다 가져오기 -->
	<form action="select">
		아이디: <input type = "text" name = "id"><br>
		<input type = "submit" value = "게시판 입력">
	</form>
</body>
</html>