<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 입력폼 만들기</title>
</head>
<body>
	<h3>개인정보검색</h3>
	<hr>
	<form action="select2">
		아이디: <input type = "text" name = "id"><br>
		<input type = "submit" value = "개인 정보 검색">
	</form>
	<a href = "select2?id=root">root회원 검색</a> <!-- 위와 여기는 같은 검색임~> fomr이나 a태그는 클라이언트의 요청이므로 -->
</body>
</html>