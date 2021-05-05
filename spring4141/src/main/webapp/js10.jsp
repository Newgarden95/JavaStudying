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
		$('#img').click(function() {
			$('div').append('<br><img width=300 height=300 src="resources/img/ma1.png">')
		})
		
		$('#rep').click(function() {
			reply = $('#reply').val()
			$('div').append('<br>'+reply)
		})
		
		$('#imgrep').click(function() {
			reply = $('#reply').val()
			$('div').append('<br><img width=300 height=300 src="resources/img/ma1.png">'+reply)
		})
	})
</script>
</head>
<body>

댓글입력 : <input id ="reply" type ="text">
<button id ="img">이미지 추가</button>
<button id ="rep">댓글 추가</button>
<button id ="imgrep">이미지+댓글 추가</button>
<div></div>
</body>
</html>