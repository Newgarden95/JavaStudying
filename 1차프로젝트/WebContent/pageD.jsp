<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	//session.setAttribute("pageD", "pageD.jsp");
    String pageD = request.getParameter("pageD");
    out.print("D페이지");
	%>    
		<form action="shoppingbag.jsp">
		<input type="hidden" name = "page" value = "pageD.jsp">
		<button name = "name" value = "화원호텔">장바구니</button> 
	</form>
