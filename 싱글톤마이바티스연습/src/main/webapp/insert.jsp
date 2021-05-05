<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel= "stylesheet" type = "text/css" href = "resources/css/out.css">
</head>
<body>
	<h3>정보를 입력받는 창입니다</h3>
	<hr color="red">
	<form action="insert.mega"> <!-- 보내는게 .jsp파일이 아닌 controller 부분(백엔드=> 자바코드)으로 보내 처리 -->
		Id: <input type="text" name="id"><br> 
		Pw: <input type="text" name="pw"><br> 
		Name: <input type="text"name="name"><br> 
		Tel: <input type="text" name="tel"><br>
		<input type="submit" value="회원가입처리"><!-- value: 버튼에 들어갈 문구 -->
	</form>
</body>
</html>