<%@page import="jeju.ShoppingBagDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String id = request.getParameter("id");
    String product_name = request.getParameter("product_name");
    
    System.out.println(id);
    System.out.println(product_name);
    
    ShoppingBagDB db = new ShoppingBagDB();
	db.delete(id, product_name);
	
    response.sendRedirect("MyPageContentBasket.jsp");
    %>
