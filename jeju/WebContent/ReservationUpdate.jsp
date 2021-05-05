<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    /* 예약조회페이지(MyPageContentInquiry.jsp)에서 수정버튼을 눌렀을때 예약번호 받아오기 */
    String res_num = request.getParameter("upd");
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="ReservationUpdateDB.jsp"><!-- 업데이트 기능이 있는 페이지로 아래 값들을 넘겨준다 -->
	<input type="hidden" name = upd1 value = <%=res_num%>>
	변경할 예약자이름: <input name = "upd_name">
	변경할 예약자번호: <input name = "upd_tel">
	<button>수정하기</button>
	</form>
</body>
</html>