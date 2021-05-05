<%@page import="database.ReservationDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    // 지우기 위해선 예약번호가 필요 -> 마이페이지에서 가져올거임
    String resNo = request.getParameter("del");
    
    ReservationDB db = new ReservationDB();
	db.delete(resNo);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>