<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>검색 결과</h3>
<hr>
아이디: ${vo.id}<br>
상품명: ${vo.title}<br>
상품가격: ${vo.price}<br>
상품회사: ${vo.company}<br>

<a href = "product_select.jsp">상품 검색 페이지 이동</a>
</body>
</html>