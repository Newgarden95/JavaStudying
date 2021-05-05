<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!-- jstl이용을 위한 설정 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시판 검색 정보</h3>
<hr>
<!-- 자바의 핵심적인 문법은 tag로 편하게 쓰자!! -->
<!-- jstl: java standard tag library -->
<!-- 자바문법쓸때 열고닫지 않으려고-->

<c:forEach var="vo" items="${list}"> <!-- vo에 담아주겠다 -->
게시물 아이디 ${vo.id}<br> <!-- vo = 컨트롤러에서 보내준 모델명 -->
게시물 제목 ${vo.title}<br>
게시물 내용 ${vo.content}<br>
게시물 작성자 ${vo.writer}<br>
==============================<br>
</c:forEach>
</body>
</html>