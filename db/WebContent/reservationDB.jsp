<%@page import="database.ReservationDB"%>
<%@page import="database.ReservationVO"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- 예약을 위해 DAO 관련 Java 부분 -->
    <%
    	String resNo = null; // int는 null로 초기화 불가 ~> String으로 null 초기화 가능
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String tel = request.getParameter("tel");
        String date = request.getParameter("date");
        String payment = request.getParameter("payment");
        
        //난수 활용해서 예약번호 생성 => 중복체크필요
        //Resno no = new Resno();
        //String No = no.no(id);
        
        ReservationVO bag = new ReservationVO(); // VO생성
        /* 24~30줄 까지 입력값들을 가방에 넣어준다. */
        bag.setresNo(resNo); 
        bag.setId(id);
        bag.setName(name);
        bag.setTel(tel);
        bag.setDate(date);
        bag.setPayment(payment);
        
    	ReservationDB db = new ReservationDB();
    	db.create(bag);// 보낼 데이터가 많기 때문에 가방에 담아서 보내줌
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