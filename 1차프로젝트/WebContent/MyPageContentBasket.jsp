<%@page import="DB.ShoppingBagVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DB.ShoppingBagDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String id = "whaone2";//아이디 세션 임시처리

/* 장바구니에 담은 상품을 보여주기 위해 db처리해주는 코드 */
ShoppingBagDB db = new ShoppingBagDB();
ArrayList<ShoppingBagVO> list = db.read(id);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이 페이지</title>
<link rel="stylesheet" type="text/css" href="style.css">
<style type="text/css">
.part { /* li태그에 대한 영역 */
	/* margin vs padding */
	/* margin: 바깥쪽 여백의 속성을 지정 => 쉽게 말해 박스와 박스 사이를 조절 위 오른쪽 아래 왼쪽 순으로 밀어주는 느낌 */
	/* padding: 안쪽 여백의 속성을 지정 */
	list-style: none;
	padding: 25px;
	background: #16b4f7; /* li 영역의 배경색 설정 */
	margin: 0px 40px 0px 0px;
	border-radius: 40px 80px; /* 각 li태그마다 둥글게 */
	text-align: center; /* 글씨를 중앙에 맞춤 */
}

.a {
	font-size: 20px;
}

#MyPagehr {
	margin: 0px 0px 5px 0px;
}

#MyPageleft { /* 왼쪽부분에 해당하는 화면 */
	float: left;
	width: 200px;
}

#MyPageright { /* 오른쪽부분에 해당하는 화면 */
	float: left;
	width: 700px;
	margin: 0px 0px 50px 0px;
}

#MyPagecenter { /* 내용이 들어갈 영역 */
	float: left;
	width: 700px;
	height: 450px;
	background: white;
}
</style>
</head>
<body>
	<nav id="myMain">
		<nav id="MyTop">
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
		</nav>
		<nav id="MyPageContent">
			<nav id="Content">
				<!-- 마이페이지 목록부분 -->
				<div id="MyPageleft">
					<ul type="circle">
						<li class="part">
							<!-- class속성은 CSS에서 내가 li태그에 해당하는 부분을 공통적으로 수정하고자 할 때 class사용 -->
							<a href="MyPageContentInquiry.jsp">예약조회</a>
						</li>
						<li class="part"><a href="MyPageContentBasket.jsp">장바구니</a></li>
					</ul>
				</div>
				<!-- 장바구니 화면부분 -->
				<div id="MyPageright">
					<p class="a">장바구니</p>
					<hr id="MyPagehr" color="#16b4f7" size=6>
					<div id="MyPagecenter">
						<!-- right라는 영역안에 center라는 영역을 만들기 위해 설정 -->
						<!-- 세션 설정해서 장바구니 만들기 ArrayList -->
						<!-- 장바구니페이지(session필요x + arraylist)-상품창에서 장바구니담기 버튼 누름 -> java서버에서 버튼 누른 페이지에 대한 주소값 받아오기  -->
						<%
							for (int i = 0; i < list.size(); i++) {
							ShoppingBagVO bag = list.get(i);
						%>
						<form>
						<table border="1">
							<tr>
								<td>관심상품</td>
								<td><a href=<%=bag.getProduct()%>><%=bag.getProduct_name()%></a></td>
								<td><button formaction="shoppingbagDelete.jsp">장바구니삭제</button></td>
								<input type = "hidden" name = "id" value =<%=bag.getId()%>>
								<input type = "hidden" name = "product_name" value =<%=bag.getProduct_name()%>>
								<!-- 상품이름에 하이퍼링크 설정(상품페이지) -->
							</tr>
						</table>
						</form>
						<%
							}
						%>
					</div>
				</div>
			</nav>
		</nav>
	</nav>

</body>
</html>