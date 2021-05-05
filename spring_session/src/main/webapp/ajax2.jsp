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
		num1 = ""//전역변수
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
		
		$('#b3').click(function() {
			$.ajax({
				url: "tel.jsp",
				data:{/* 서버로 보내줄 데이터 */
					tel:$("#tel").val()
				},
				success: function(result) {
					alert("인증번호 전송 완료")
					alert("인증번호는 "+ result+"입니다.")
					num1 = result.trim()/* tel.jsp에서 넘겨주는 값(인증번호) 공백제거 */
					console.log(num1)
				}
			})
		})
		$('#b4').click(function() {
			num = $('#num').val()
			console.log(num)
			console.log(num1)
			if(num == num1){
				alert('인증에 성공하셨습니다.')
			}else{
				alert('인증에 실패하셨습니다.')
			}
		})
		
		$("#b2").click(function() {
			$.ajax({
				url: "check.jsp",
				data: {id : $("#id").val()},
				success: function(result) {
					checkId = result.trim()
					console.log(checkId)
					
					id1 = $("#id").val()
					console.log(id1)
					if(id1 == checkId){
						$("#div1").html("중복된 아이디가 있습니다.")
					}else{
						$("#div1").html("사용가능한 아디입니다.")
					}
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
<div id = "div1"></div>
<hr color = "red">

인증받을 전화번호 입력: <input id = "tel">
<button id = "b3">인증번호 받기(tel.jsp)</button><br>
인증받은 숫자입력: <input id = "num">
<button id = "b4">인증번호 번호 확인</button>
</body>
</html>