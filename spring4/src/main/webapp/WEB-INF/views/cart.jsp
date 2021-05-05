<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="green">
	<h3>장바구니 내용 확인</h3>
	<hr color="gold">
	내 아이디 : ${cartvo.mid}<br>
	상품 아이디 : ${cartvo.pid}<br>
	상품 가격 : ${cartvo.price}<br>
	상품 수량 : ${cartvo.pcount}<br>

</body>
</html>