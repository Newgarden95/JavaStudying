<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 뷰즈에서 리스트를 받아오기 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src = "resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			//datas = $('form').serialize(); //데이터를 일일이 다 작성할 필요없이 
			$.ajax({
				url:"fruit",//가상주소(controller)
				success: function(result) {//Views파일에서 출력해주는 부분
					$('div').html(result)
				}
					
			})
		})
		$('#b2').click(function() {
			//datas = $('form').serialize(); //데이터를 일일이 다 작성할 필요없이 
			$.ajax({
				url:"tour",//가상주소(controller)
				success: function(result) {//Views파일에서 출력해주는 부분
					$('div').html(result)
				}
					
			})
		})
	})
</script>
</head>
<body>
<button id = "b1">과일 목록을 가지고 와보자</button><br>
<button id = "b2">여행 목록을 가지고 와보자</button>
<div></div>
</body>
</html>