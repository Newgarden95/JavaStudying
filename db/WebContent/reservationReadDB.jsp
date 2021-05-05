<%@page import="database.ReservationVO"%>
<%@page import="database.ForReservationDb"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 임의로 세션 잡아줘야함 -->
<!-- session.getAtribute~~~  -->
<!-- 예약정보확인을 위한 DAO관련 Java 부분 -->
<!--  -->
<%
	String id = request.getParameter("id"); //입력된 예약자 id를 id변수에 넣어준다.
	ForReservationDb db = new ForReservationDb();
	ReservationVO bag = db.read(id); //가지고 들어갈게 id하나뿐이라 bag필요 없음  => read메서드를 통해 데이터 추출 반드시 가방을통해서 보내줘
						//why? 확인할 데이터 양은 많은데 return은 무조건 1개만 가능하니까 가방에 넣어와서 여기서 풀러
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	예약 번호:
	<%=bag.getresNo()%><br> 
	예약 아이디:
	<%=bag.getId()%><br> 
	예약자 이름:
	<%=bag.getName()%><br> 
	예약자 번호:
	<%=bag.getTel()%><br> 
	예약일:
	<%=bag.getDate()%><br> 
	결제방법:
	<%=bag.getPayment()%><br>
	<!-- 숙소정보에대한 정보도 불러오도록 수정하기! -->
	
	<!-- 여기에 딜리트랑 업데이트 추가 왜 why? 예약현황페이지에 read출력부분 + delete부분 + update부분이 다 있으니까 -->
	<form method = "post" action="reservationDeleteDB.jsp"> <!-- method = "post" 는 다른페이지로 데이터를 전송을 위해 설정 -->
		<button type = "submit" name="del" value = <%=bag.getresNo()%> >취소</button><!-- 위에서 Read를 통해 얻은 값을 delete 실행할 수 있는 페이지로 전달 -->
	</form>
	<form method = "post" action="reservationUpdateDB.jsp">
		<button type = "submit" name = "upd" value = <%=bag.getresNo()%>>변경</button>
	</form>
</body>
</html>