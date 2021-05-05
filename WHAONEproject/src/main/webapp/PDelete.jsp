<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String pnum = request.getParameter("pnum");
	String contact = request.getParameter("contact");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>등록한 매물 삭제 페이지</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function() {
		$("#b1").click(function() {
			if (confirm("<%=pnum%>번 매물를 삭제하시겠습니까 ?") == true) {
				$.ajax({
					url : "delete",
					data : {
						pnum : $("#pnum").val()
					},
					success : function() {
						alert("삭제가 완료되었습니다.")

					}
				})
				
				location.href = "select?contact=" + $("input[name=contact]").val()
			}
		})
	})
</script>
</head>
<body>
	<h3>등록 매물 삭제 페이지 입니다.</h3>
	<hr color="red">
		삭제할 매물 번호를 확인해주세요 : <input id="pnum" value="<%=pnum%>" readonly><br>
		삭제할 매물과 연결된 번호 확인 : <input name="contact" value="<%=contact%>" readonly><br>
		<!-- 삭제할 매물 번호가 입력된다. -->
		<button type="button" id="b1">삭제하기</button>
	<a href="select?contact=${contact}">
		<button>돌아가기</button>
	</a>
</body>
</html>