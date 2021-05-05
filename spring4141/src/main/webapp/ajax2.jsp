<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src = "resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function() {
		$("#b1").click(function() {
			$.ajax({
				url: "money.jsp",
				data:{//서버로 넘어가는 데이터 값 ~> 서버페이지에서 받을 떄 request로 받는다
					money: $("#money").val(),
					choice: $("#choice").val()
				},
				success: function(result) {
					$('div').html(result)
				}
			})
		})
	})
</script>
</head>
<body>
<h3>비동기통신으로 서버와 통신하기</h3>
결제금액: <input id = "money"><br>
결제수단: 1)계좌이체 2)신용카드 3)휴대폰결제 <input id = "choice">
<button id ="b1">결제하기(money.jsp)</button>
<div></div>
<hr color = "red">
회원가입할 id입력: <input id = "id"><br>
<button id = "b2">id중복체크(check.jsp)</button>
<hr color = "red">
인증받을 전화번호 입력: <input id = "tel">
<button id = "b3">인증번호 받기(tel.jsp)</button><br>
인증받은 숫자입력: <input id = "num">
<button id = "b4">인증번호 번호 확인</button>
</body>
</html>