<%@page import="java.util.ArrayList"%>
<%@page import="DB.ShoppingBagVO"%>
<%@page import="DB.ShoppingBagDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%	
    	/* 상품페이지에서 장바구니담기 버튼을 누를시 shoppingbag.jsp파일로 상품주소 및 상품이름을 파라미터값으로 받아온다. */
    	session.setAttribute("id","whaone2");
    	String id = (String)session.getAttribute("id"); //현재 로그인되있는 사람인 경우 가능
    	String product = request.getParameter("page"); //장바구니에 담을 상품주소 받아오기
    	String product_name = request.getParameter("name");//장바구니에 담을 상품이름 받아오기
        
        ShoppingBagDB db = new ShoppingBagDB();
        ShoppingBagVO bag = new ShoppingBagVO();
       
        bag.setId(id);
        bag.setProduct(product);
        bag.setProduct_name(product_name);
        
        /* 로그인된 상태에서 같은아이디가 같은 상품을 계속해서 담는것(중복)을 막기위한 설정 */
        if(db.check(id, product) == false ){
        	db.create(bag); //장바구니 정보들 db에 담기	
        }
    	
    	response.sendRedirect(product);//장바구니 담기 버튼을 누른 그 페이지(현재있는페이지로)로 다시 돌아간다
    %>