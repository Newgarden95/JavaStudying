<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>데이터 삭제를 위한 화면</h3>
	<hr color="pink">
	<form action="delete.mega"> <!-- 클라이언트의 요청사항을 가상의 주소인 delete.mega 보내 처리 -->
		아이디 : <input type="text" name="id"> <br>
		<input type="submit"value="삭제하기">
	</form>
</body>
</html>