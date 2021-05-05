<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src = "../resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function() {
		$('button').click(function() {
			//datas = $('form').serialize(); //데이터를 일일이 다 작성할 필요없이 
			$.ajax({
				url:"../receipt",//가상주소(controller)
				data:{//controller로 보낼 데이터들
					com : $('#com').val(),
					comType : $('#comType').val(),
					mouse : $('#mouse').val(),
					mouseType : $('#mouseType').val(),
				},
				success: function(result) {//Views파일에서 출력해주는 부분
					$('div').html(result)
				}
					
			})
		})
	})
</script>
</head>
<body>
컴퓨터 가격: <input id ="com"><br>
컴퓨터 종류: <input id ="comType"><br>
마우스 가격: <input id ="mouse"><br>
마우스 종류: <input id ="mouseType"><br>
<button>전체구매 내용 확인</button>
<div></div>
</body>
</html>