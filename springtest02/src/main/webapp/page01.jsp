<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>직원정보 등록하는 화면입니다.</h3>
	<hr>
	<form action="page02.jsp">
	ID: <input type="text" name = "id" style="text-align=center"><br>
	NAME: <input type="text" name = "name" style="text-align=center"><br>
	LEVEL: <input type="text" name = "level" style="text-align=center"><br>
	WORK: <input type="text" name = "work" style="text-align=center"><br>
	PAY: <input type="text" name = "pay" style="text-align=center"><br>
	INDATE: <input type="text" name = "indate" style="text-align=center"><br>
	<button type = "submit">제출</button>
	</form>
</body>
</html>