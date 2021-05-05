<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String qid = request.getParameter("qid");
String qtype = request.getParameter("qtype");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="qnaupdate_wrap" class="text-center">
		<form action="qupdate">
			<h2>문의하기</h2>
			<div>
				궁금하신 점을 문의해주세요<br>문의내용과 답변은<span color="blue">'1:1 문의내역'</span>에서
				확인하실 수 있습니다.
			</div>
			문의 유형 : <select name="qtype" readonly>
				<option selected><%=qtype%></option>
			</select><br> 제목 : <input type="text" name="qtitle"><br> 내용
			:
			<textarea rows="12" cols="30" name="qcontents"
				placeholder="내용을 입력하세요."></textarea>
			<br>
			<button type="submit" value="제출버튼">문의하기</button>
			<input type="text" name="qid" value="<%=qid%>"
				style="display: none">
		</form>
	</div>
</body>
</html>

