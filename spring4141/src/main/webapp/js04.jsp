<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	/* 브라우저에게 스크립트 영역을 알려줌*/
	//alert('야 ~~턴이다!!')
	jumsu = [100,200,300] //js 배열
	//alert(jumsu) //자바의 ArrayList 처럼 주소가 아닌 스트링값으로 찍힘 ~ 배열이면 원래 주소가 찍힘
	//alert(jumsu.length)// 배열의 개수
	
	for (var i = 0; i < jumsu.length; i++) {
		alert(i+"번은 " +jumsu[i]+"점")
	
	}
</script>
</head>
<body>

</body>
</html>
