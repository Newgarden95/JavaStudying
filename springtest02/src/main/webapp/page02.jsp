<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String level = request.getParameter("level");
	String work = request.getParameter("work");
	String pay = request.getParameter("pay");
	String indate = request.getParameter("indate");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>직원정보 등록확인하는 화면입니다.</h3>
			아이디: <%=id%><br>
			이름: <%=name%><br>
			직위: <%=level%><br>
			직무: <%=work%><br>
			월급: <%=pay%>원<br>
			입사일: <%=indate%><br>
</body>
</html>