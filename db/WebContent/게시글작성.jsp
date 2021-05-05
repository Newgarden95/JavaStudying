<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href = "list.jsp">전체 정보보기</a> <!-- 전체등록정보확인  -->
	
	
	
	
	<form action="게시글db연동페이지.jsp">
	<!-- 로그인후니까 아이디 자동으로 들어가게 해야함  -->
	<!-- 로그인후 세션종료(브라우저닫기) 안하면 아이디 유지가능  -->
	<!-- <%= session.getAttribute("id") %>이거만 가져다 쓰면됨 -->
		아이디 = <input name ="id" value =<%= session.getAttribute("id") %> readonly="readonly"><br> <!-- input 속성, require:입력안하면 오류, readonly:수정불가 ...  -->
		제목 = <input name ="title" req><br>
		내용 = <input name ="content"><br>
		작성자 = <input name ="writer"><br>
		
		<button type = "submit">작성하기</button>
	</form>
</body>
</html>