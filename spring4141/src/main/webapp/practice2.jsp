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
		$('#i2').keyup(function() {
			pw1 = $('#i1').val()
			pw2 = $('#i2').val()
			
			if(pw1 == pw2){
				$('#d1').html('일치합니다')}
			else{
				$('#d1').html('불일치합니다')
			}
		})
		
		$('#b2').click(function() {
			d1 = $('#i3').val()
			$("#d2").append("<br>"+"-"+d1)
		})
	})
</script>
</head>
<body>
비밀번호입력 : <input id = "i1"><br>
비밀번호재입력 : <input id = "i2"><br>
<div id = "d1"></div>
<hr align="left" width="300px" size="5" color="green">

<!-- 로그인된 사람만 하려면 백엔드에서 세션처리 받아서 현재 아이디를 ${}통해서 받아와서 -->
댓글: <input id = "i3">
<button id = "b2">댓글추가</button>
<div id="d2"></div>

</body>
</html>