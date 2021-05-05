<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- 세션받아와서 하면됨 수정하기!! -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약정보확인페이지</title>
</head>
<body>
	<form action="reservationReadDB.jsp">
		<h3>예약확인</h3>
		<hr color = "red">
		아이디 입력: <input name = "id"><br> <!-- 예약확인을 위해서는 예약자 id필요 -->
		<button type = "submit">예약확인</button>
	</form>
</body>
</html>