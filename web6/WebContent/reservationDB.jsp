<%@page import="com.sun.org.apache.bcel.internal.generic.NEW"%>
<%@page import="shop.ReservationVO"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String id = request.getParameter("id");
    String name = request.getParameter("name");
    String tel = request.getParameter("tel");
    String date = request.getParameter("date");
    String pay = request.getParameter("pay");
    
    /* 예약번호는 랜덤하게 입력 */
   // int num = Random
   
   ReservationVO bag = new ReservationVO();
    bag.setId(id);
    bag.setName(name);
    bag.setTel(tel);
    bag.setDate(date);
    bag.setPay(pay);
    
    Db db = new Db(bag);
    
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