<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	//session.setAttribute("pageC", "pageC.jsp");
    String pageC = request.getParameter("pageC");
    out.print("C페이지");
	%>
	
		<form action="shoppingbag.jsp">
		<input type="hidden" name = "page" value = "pageC.jsp">
		<button name = "name" value = "알라호텔">장바구니</button> 
	</form>
