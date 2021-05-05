<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	//session.setAttribute("pageB", "pageB.jsp");
    String pageB = request.getParameter("pageB");
    out.print("B페이지");
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>A상품의 상세페이지</title>
</head>
<body>
	<!-- 상품페이지를 보면 장바구니와 예약하기 버튼이 있다. 버튼을 누르면 해당 페이지로 넘어간다 -->
	<!-- 중복처리해야함!!! 같은 아이디 사람이 또 누르면 또 장바구니에 들어감 -->
	<!-- 장바구니 버튼 누를시 상품페이지주소와 상품이름을 파라미터값으로 보내줘야함 -->
	
	<!-- action에 "shoppingbag.jsp?name=신라호텔&page=pageA.jsp" 안되는 이유가 뭔지 찾기...  -->
	<form action="shoppingbag.jsp">
		<input type="hidden" name = "page" value = "pageB.jsp">
		<button name = "name" value = "한라호텔">장바구니</button> 
	</form>
	
	<form action="ReservationPage.jsp">
		<button>예약하기</button>
	</form>
</body>
</html>