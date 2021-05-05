<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<!-- MVC에서 V(뷰)에 해당하는 부분 -->
<body>
	<h3>회원 로그인</h3>
	<hr color="red">
	<form action="login.mega"> <!-- 실행시 컨트롤러로 가서 처리됨: 가상주소(입력값을 처리하기위해) -->
		아이디: <input type="text" name="id"><br> 
		패스워드: <input type="text" name="pw"><br> 
		패스워드 확인: <input type="text" name="pw2"><br> 
		<input type="submit" value="로그인처리">
	</form>
</body>
</html>