<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
/* 서비스영역 */
	$(function() {
		xV = '';
		//1. b1을 클릭했을때, 
		//2. tel에 입력한 값을 가지고 와야함.
		//3. mvc2에서는 controller에서 내가 넘긴 값을 받아서 다음 처리를 진행하게 함.
		//4. ajax의 url은 컨트롤로의 requestMapping과 동일해야함.
		$('#b1').click(function() {
			telVal = $('#tel').val()
			$.ajax({
				url: "text",
				data: {
					tel : telVal//서버에서는 tel로 받아줌(requtes.getParameter("tel"))
				},
				success: function(x) {
					xV = x
					$('#result').html('<h3>' + xV + '</h3>')
				}
			}) //ajax
		})	//b1
		$('#b2').click(function() {
			numVal = $('#num').val()
			if(numVal == xV){
				$('#result').append("성공하셨습니다")
			}
			else{
				$('#result').append("실패하셨습니다")
			}
			
		})
	}) //start
</script>
<body>
인증받을 전화번호: <input id="tel"><input id="b1" type="button"  value="인증번호 받기"><br>
인증받은 번호 넣어서 본인 확인: <input id="num"><input id="b2" type="button" value="인증번호 확인"><br>
<hr color="red">
<div id="result"></div>
</body>
</html>