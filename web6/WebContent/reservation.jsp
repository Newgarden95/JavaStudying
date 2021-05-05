<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="reservationDB">
	사용자 아이디:<br>
	<input name = "id"><br>
	예약자 이름:<br> 
	<input name = "name"><br>
	예약자 전화번호:<br>
	<input name = "tel"><br>
	예약일 :<br> 
	<input type = "date" name = "date"><br>
	결제방식:<br>
	<input type = "radio"  name ="pay">현장결제
	<input type = "radio"  name ="pay">카드결제<br>
	<input type = "radio"  name ="pay">계좌이체
	<input type = "radio"  name ="pay">휴대폰결제<br>

	<button type = "submit">결제하기</button>
</form>
</body>
</html>