<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<% 
	//상품페이지(ProductDetail.jsp)에서 예약하기 버튼을 파라미터값으로 방이름과 방가격을 받는다.	
	String res_room = request.getParameter("res_room");
	String res_cost = request.getParameter("res_cost");
	%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결제 화면</title>
<link rel="stylesheet" type="text/css" href="style.css">
<style type="text/css">
			.a {
				font-size: 30px;
				text-align: center;
			}
			
			#Reservationleft {
				float: left;
				width: 400px;
				height: 600px;
				background: #16b4f7;
				margin: 50px 5px 0px 90px;/*상위 박스에서 30px: Reservationleft의 박스를 위에서 30px 내리고 오른쪽에서 왼쪽으로 5px 이동 왼쪽에서 오른쪽으로 80px */
			}
	
			#Reservationright {
			
				float: left;
				width: 400px;
				height: 600px;
				background: #16b4f7;
				margin: -418px 0px 0px 350px;
				
			}
			
			#leftbox {
				float: left;
				width: 400px;
				height: 400px;
				margin: 0px 0px 0px 10px;
				
			}
			#reservationform{
				margin: 15px 5px 0px 90px;
				font-size: 20px;
			}
			
			#rightbox {
				float: left;
				width: 300px;
				height: 400px;
				margin: -5px 0px 30px 50px;
				font-size: 20px;
			}
			#b{
				margin: 500px 0px 0px 170px;
				font-size: 30px;
			}
		</style>
</head>
<body>
	<nav id="myMain">
		<nav id="MyTop">
			<jsp:include page="MyTop.jsp"></jsp:include>
		</nav>
		<nav id="ReservationSection">
		<!-- 위에서 받아온 상품이름과 가격을 reservationsection.jsp로 다시 파라미터값으로 넘겨준다 -->
			<jsp:include page="ReservationSection.jsp?res_room=<%=res_room%>&res_cost=<%=res_cost%>"></jsp:include> 
		</nav>
	</nav>

</body>
</html>