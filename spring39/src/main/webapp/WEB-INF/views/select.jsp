<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시판 검색 정보</h3>
<hr>
게시물 아이디 ${vo.id}<br> <!-- vo = 컨트롤러에서 보내준 모델명 -->
게시물 제목 ${vo.title}<br>
게시물 내용 ${vo.content}<br>
게시물 작성자 ${vo.writer}<br>
</body>
</html>