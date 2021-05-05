<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이 페이지</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<nav id = "myMain">
		<nav id = "MyTop">
			<jsp:include page="MyTop.jsp"></jsp:include>
		</nav>

		<nav id = "MyPageContent">
			<jsp:include page="MyPageContent.jsp"></jsp:include>
		</nav>
	</nav>

</body>
</html>