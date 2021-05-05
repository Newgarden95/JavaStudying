<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 입력폼 만들기</title>
</head>
<body>
	<h3>게시판 입력</h3>
	<hr>
	<form action="insert2.mega">
		아이디: <input type = "text" name = "id"><br>
		제목: <input type = "text" name = "title"><br>
		내용: <textarea rows="5" cols="20" name = "content"></textarea><br>
		작성자: <input type = "text" name = "writer"><br>
		<input type = "submit" value = "게시판 입력">
	</form>
</body>
</html>