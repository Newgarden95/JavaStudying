<%@page import="jeju.productDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String Classification = request.getParameter("Classification");
	String Name = request.getParameter("Name");
	String Image = request.getParameter("Image");
	String Price = request.getParameter("Price");
	String Location = request.getParameter("Location");
	String Common = request.getParameter("Common");
	String Internal = request.getParameter("Internal");
	String RoomType = request.getParameter("RoomType");
	String Pickup = request.getParameter("Pickup");
	String Info = request.getParameter("Info");
	
	productDB db = new productDB();
	db.create(Classification, Name, Image, Price, Location, Common, Internal, RoomType, Pickup, Info);

%>
<html>
<head>
<meta charset="UTF-8">
<title>등록 완료 확인 창</title>
</head>
<body>
등록이 완료 되었습니다.<br>
<a href="ProductSummary.jsp">
	<button>돌아가기</button>
</a>

</body>
</html>