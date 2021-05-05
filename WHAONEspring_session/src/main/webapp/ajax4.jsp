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
		$('#b1').click(function() {
			titleVal = $('#title').val()
			costVal = $('#cost').val()
			
			//비동기 통신을 위한설정
			$.ajax({
				url: "movie", // 컨트롤러로 보내는 이유는? 단순히 생각해서 MVC2에서는 데이터 처리를 위해서 컨트롤러로 보내고 그 안에서 처리!!
							  
				data: {// 서버에서는 받아주는 데이터들(requtes.getParameter("title"))
					title : titleVal,
					cost : costVal
				},
				success: function(result) {//컨트롤러에서 수행 후 views에 있는 결과를 보여줌
					$('div').html(result)
				}
			})
		})
	})
</script>
</head>
<body>
영화제목: <input id = "title"><br>
영화관람료: <input id = "cost"><br>
<button id = "b1">확인</button>
<hr color="green">
<div></div>
</body>
</html>