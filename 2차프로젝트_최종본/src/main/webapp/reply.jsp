<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String qid = request.getParameter("qid");
String qtype = request.getParameter("qtype");
String qtitle = request.getParameter("qtitle");
String qcontents = request.getParameter("qcontents");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a class="btn btn-primary btn-lg" href="productSummary2.jsp">방찾기</a>
	<a class="btn btn-primary btn-lg" href="#">마이페이지</a>
	<!-- href에 각자 만든 페이지 주소 넣어주기 -->
	<a class="btn btn-primary btn-lg" href="#">방내놓기</a>
	<!-- href에 각자 만든 페이지 주소 넣어주기 -->
	<a class="btn btn-primary btn-lg" href="#">고객센터</a>
	<!-- href에 각자 만든 페이지 주소 넣어주기 -->
	<a class="btn btn-primary btn-lg" href="ruser_update.jsp">회원정보수정</a>
	<!-- href에 각자 만든 페이지 주소 넣어주기 -->
	<a class="btn btn-primary btn-lg" href="ruser_delete.jsp">회원탈퇴</a>
	<!-- href에 각자 만든 페이지 주소 넣어주기 -->
	<div class="btn btn-primary btn-lg">${userid}님환영합니다.</div>
	<a class="btn btn-primary btn-lg" href="ruser_logout.jsp">로그아웃</a>
	<!-- href에 각자 만든 페이지 주소 넣어주기 -->
	<div id="reply_wrap" class="text-center">
		<form action="rinsert">
			<h2>문의하기</h2>
			<h5>
				궁금하신 점을 문의해주세요<br>문의내용과 답변은<span color="blue">'1:1 문의내역'</span>에서
				확인하실 수 있습니다.
			</h5>
			문의 유형 : <select name="qtype" readonly>
				<option selected><%=qtype%></option>
			</select><br> 제목 :
			<%=qtitle%><br> 내용 :
			<%=qcontents%><br> 답변 :
			<textarea rows="12" cols="30" name="reply"></textarea>
			<br>
			<button type="submit" value="제출버튼">답변하기</button>
			<input type="text" name="qid" value="<%=qid%>" style="display: none">
			<input type="hidden" value="${userid}" name="userid">
		</form>
	</div>
</body>
</html>

