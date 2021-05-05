<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board</title>
</head>
<body>
	<form action = "boardUpdate.jsp">
		아이디: <input name = "id"><br>
		제목: <input name = "title"><br>
		내용: <br>
		<textarea rows="10" cols="50" name = "content"></textarea><br>
		<button type = "submit">작성하기</button>
	</form>
</body>
</html>