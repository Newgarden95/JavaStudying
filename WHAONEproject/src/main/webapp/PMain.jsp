<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>방 내놓기 메인페이지</title>
</head>
	<body>
		<form action="select">
		매물거래시 연락 가능한 번호를 입력해주세요(-생략)<br> 
		<!-- 입력한 번호값을 controller의 가상주소 select로 보내준다. -->
		<input name = "contact">
		<button>방 내놓기</button>
		</form>
	</body>
</html>