<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Bootstrap core CSS -->
<link href="resources/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css">

<!-- Custom fonts for this template -->
<link href="resources/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link href="resources/vendor/bootstrap/css/bootstrap.css"
	rel="stylesheet" type="text/css">
<link
	href="resources/vendor/fontawesome-free/css/all.min.css/vendor/simple-line-icons/css/simple-line-icons.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic"
	rel="stylesheet" type="text/css">

<!-- Custom styles for this template -->
<link href="resources/css/landing-page.min.css" rel="stylesheet"
	type="text/css">
<link href="resources/css/landing-page.css" rel="stylesheet"
	type="text/css">

</head>
<body>
	<!-- Navigation : 맨 위 메뉴바 부분/ 모든 페이지에 공통적으로 들어갈 부분(메뉴바)-->
	<nav class="navbar navbar-light bg-light static-top">
		<div class="logo">
			<a class="navbar-brand" href="main.jsp">내 집은 신촌에 있나방</a>
		</div>
		<div id="menu">
			<!-- 세션처리 -->
			<a class="btn btn-primary btn-lg" href="productSummary2.jsp">방찾기</a>
			<a class="btn btn-primary btn-lg" href="#">마이페이지</a>
			<!-- href에 각자 만든 페이지 주소 넣어주기 -->
			<a class="btn btn-primary btn-lg" href="#">방내놓기</a>
			<!-- href에 각자 만든 페이지 주소 넣어주기 -->
			<a class="btn btn-primary btn-lg" href="qnamain.jsp">고객센터</a>
			<!-- href에 각자 만든 페이지 주소 넣어주기 -->
			<a class="btn btn-primary btn-lg" href="ruser_update.jsp">회원정보수정</a>
			<!-- href에 각자 만든 페이지 주소 넣어주기 -->
			<a class="btn btn-primary btn-lg" href="ruser_delete.jsp">회원탈퇴</a>
			<!-- href에 각자 만든 페이지 주소 넣어주기 -->
			<div class="btn btn-primary btn-lg">${userid}님환영합니다.</div>
			<a class="btn btn-primary btn-lg" href="ruser_logout.jsp">로그아웃</a>
			<!-- href에 각자 만든 페이지 주소 넣어주기 -->
		</div>
	</nav>
	<!-- navigation 종료 -->
	<div id="qna_wrap" class="text-center">
		<form action="qinsert">
			<h2>문의하기</h2>
			<h5>
				궁금하신 점을 문의해주세요<br>문의내용과 답변은<span color="blue">'1:1 문의내역'</span>에서
				확인하실 수 있습니다.
			</h5>
			문의 유형 : <select name="qtype">
				<option selected>선택</option>
				<option value="일반문의">일반문의</option>
				<option value="허위매물">허위매물</option>
			</select><br> 제목 : <input type="text" name="qtitle"><br> 내용
			:
			<textarea rows="12" cols="30" name="qcontents"
				placeholder="내용을 입력하세요."></textarea>
			<br> <input type="submit" value="문의하기"> <input
				type="hidden" value="${userid}" name="userid">
		</form>
	</div>
</body>
</html>