<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "stylesheet" type = "text/css" href = "out.css">
</head>
<body>
	<!-- 화면 나누기 위한 태그 div -->
	<!-- 전체 div 구분을 위해 id 설정 -->
	<!-- 실행하면 우리가 원하는 부분으로 못나눔 -> CSS를 이용해서 -->
	<div id = "total">
		<div id ="top">
			<jsp:include page="top.jsp"></jsp:include><!-- top부분 붙이기/ top부분을 포함하라 -->
		</div><!-- 전체 프레임 안에 부분별 화면 -->
		<div id ="top2">
			<jsp:include page="top2.jsp"></jsp:include><!-- top2부분 붙이기 -->
		</div>
		<div id ="center">상품정보 정보가 들어가는 부분</div>
	</div>

</body>
</html>