<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- 로그인 유무확인하기 -->
    <!-- 세션설정 받아오기 -->
    <%
    // 현재는 확인을 위해 아이디 세션설정된 상태로 가정
       //session.setAttribute("id", "받아들인값")
       session.setAttribute("id", "whaone2");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약화면</title>
</head>
<body>
<!-- 로그인 유무 확인해주기 -->
<!-- 로그인 아이디 세션설정된 게 없는 경우 -->
<% if (session.getAttribute("id")==null){ %>
	<a href = "로그인세션.jsp">로그인하기</a>
	
<%} else{ %>
	<form action="reservationDB.jsp">
	사용자 아이디:<br>
	<input name = "id" value = <%= session.getAttribute("id") %> readonly="readonly" ><br> <!-- readonly : 수정 불가 읽기만 가능 -->
	예약자 이름:<br> 
	<input name = "name" required="required"><br> <!-- required : 반드시 채워야함 -->
	예약자 전화번호:<br>
	<input name = "tel" required="required"><br>
	예약일 :<br> 
	<input type = "date" name = "date" required="required"><br>
	결제방식:<br>
	<input type = "radio"  name ="payment" value = "place" required="required">현장결제
	<input type = "radio"  name ="payment" value = "card" required="required">카드결제<br> <!-- 카드인 경우 카드결제로 넘어가도록 설정 -->
	<input type = "radio"  name ="payment" value = "transfer" required="required">계좌이체
	<input type = "radio"  name ="payment" value = "phone" required="required">휴대폰결제<br>
	<!-- 숙소고유번호도 입력 -->
	<!-- 숙소고유번호를 통해 예약확인부분에서 read할거거든 -->
	<button type = "submit">결제하기</button>
	</form>
<%} %>
	
</body>
</html>