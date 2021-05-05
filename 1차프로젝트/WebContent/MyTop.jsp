<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="style.css">
<header>
	<!-- HTML 레이아웃 중 하나인 header 부분에 메뉴를 생성 -->
	<nav id="logo">
		<!-- HTML 레이아웃중 하나인 nav 부분에 생성, id는 logo 로 지정해서 style.css에서 logo를 이용해 style을 만들어줌  -->
		<a href="MainPage.jsp"> <!-- 로고를 누르면 메인페이지를 갈수 있도록 하는 a 태그 생성 -->
			<img src="pictures/MainLogo.png" width="80" height="80"> <!-- 80x80짜리 경로를 따라서 이미지를 가져옴 -->
		</a>
	</nav>
	<!-- 로고 레이아웃 완료 -->

	<nav id="search">
		<!-- search라는 id를 가진 검색부분 레이아웃을 생성 -->
		<form>
			<!-- 이미지를 누르면 검색을 할수 있도록 하기위해서 form 형식으로 생성, 검색 하는것은 추후 추가 예정 -->
			<img id="image" src="pictures/Search.png" width="25" height="25">
			<!-- 검색모양 이미지 -->
			<!-- <input type="text" name="find"> -->
		</form>
	</nav>
	<!-- 검색 레이아웃 완료 -->
	<nav id="menu">
		<!-- menu라는 id를 가진 레이아웃을 생성 -->
		<ul type="circle">
			<!-- menu 레이아웃 부분에는 순서가 없는 리스트가 생성-->
			<!-- 각 메뉴를 누르면 해당 페이지로 넘어가는 리스트를 생성, class는 menu 아이디를 가진 태그 안의 class 테그 들의 스타일을 설정할 때 사용. -->
			<li><a class="menuLink" href="MainPage.jsp">메인페이지</a></li>
			<li><a class="menuLink" href="MyPage.jsp">마이페이지</a></li>
			<li><a class="menuLink" href="Service.jsp">고객센터</a></li>
			<li><a class="menuLink" href="Login.jsp">로그인</a></li>
		</ul>
	</nav>
</header>