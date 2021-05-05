<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src = "resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function() { //body 태그 안부터 ram에 읽어들여라!! ~> Dom Tree
		$("#b2").click(function() {
			$.ajax({
				url: "all2",
				success: function(result) {
					alert('all2연결 성공')
					console.log('결과는 '+ result)
					$(result).each(function(index, vo) {
						console.log(index, vo)
						console.log(index, vo.id)// vo.id는 위도 혹은 경도에 대한 데이터임 ~> 따라서 위도 배열을 만들어서 위도 따로/ 경도 배열만들어서 경도 따로 넣어서해보기
					})
				},
				error: function() {
					alert('all2연결 실패.!!!')
				}
			})
		})
	})
</script>
</head>
<body>
<button id = "b1">string으로 controll에서받아오자</button><br> <!-- 버튼 눌렀을때 페이지 이동이 아닌 ajax사용 -->
<button id = "b2">JSON으로 받아오자</button><br>
</body>
</html>