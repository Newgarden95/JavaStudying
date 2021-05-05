<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<!-- 자바처리 -->
<% 
	String money = request.getParameter("money");
	String choice = request.getParameter("choice");
	int money2 = Integer.parseInt(money);
	if(choice.equals("1")){
		money2 = (int)(money2 * 0.8);/* 카드결제 80% */
	}else if(choice.equals("2")){
		
	}
%>
	<!-- 출력할 부분 -->
결제금액 계산해서 넘길 예정임!!! ==> <%=money%>원, 선택번호<%=choice%>