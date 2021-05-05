<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 입력폼 만들기</title>
<link rel = "stylesheet" type = "text/css" href = "resources/css/out.css">
<script type="text/javascript" src= "resources/js/out.js"></script><!-- 설정(연결) -->
<script type="text/javascript">
	alert('내가시작')
	sum = add(300,200)/* 함수는 호출할 떄, 사용될 떄 실행됨.! */
	minus(sum)
</script>
</head>
<body>
	<h3>게시판 입력</h3>
	<hr>
	<img src = "resources/img/ma.jpg">
	<form action="insert2.mega">
		아이디: <input type = "text" name = "id" class="in"><br>
		제목: <input type = "text" name = "title" class="in"><br>
		내용: <textarea rows="5" cols="20" name = "content" class="in"></textarea><br>
		작성자: <input type = "text" name = "writer" class="in"><br>
		<input id= "b" type = "submit" value = "게시판 입력" class="in">
	</form>
</body>
</html>