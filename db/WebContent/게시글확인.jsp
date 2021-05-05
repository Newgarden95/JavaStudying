<%@page import="java.sql.ResultSet"%>
<%@page import="database.Db"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="게시글확인db연동페이지.jsp">
		작성자: <input name = "writer">
		<button>확인</button>
	</form>
</body>
</html>