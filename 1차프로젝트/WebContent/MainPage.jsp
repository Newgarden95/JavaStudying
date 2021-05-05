<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지 테스트</title>
<link rel="stylesheet" type="text/css" href="style.css">
<!-- style.css와 연결 -->
</head>

<body>
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
				<img id="SearchImage" src="pictures/Search.png" width="25"
					height="25">
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
		<!-- menu 레이아웃 완료 -->

	</header>
	<!-- 헤더 레이아웃 완료 -->


	<!-- 최근 방문페이지(session + arraylist) 로그인/비로그인 둘다 사용가능 -->
	<nav id="FixedBasket">
		<!-- 오른쪽에 고정될 장바구니 디스플레이를 만들기위해서 FixedBasket 아이디를 가진 nav 레이아웃 생성 -->
		<table id="BasketContent" style="width: 100%">
			<!-- 장바구니는 아래로 쭉 나와야 하기 때문에 하나의 열을 가진  테이블을 생성-->
			<!-- 최근에 방문한 페이지 보여주기 -->
			<!-- 방문페이지를 저장하고 있는 list에서 맨 마지막에 위치하는게(제일 마지막에 등록된게 가장최근) 가장 최근 방문한 페이지 -->
			<!-- 아래와 같이 조건문을 통해 방문한 페이지가 있는 경우(ArrayList에 담겨져 있는 경우)추출해서 보여주고 없는 경우는 비워둠 -->
			
			<!-- 배열리스트가 비어있지 않는경우 -->
			<% if (session.getAttribute("productlist")!=null){ 
					/* arraylist_basket.jsp에서 세션으로 설정한 productlist를 담을 새로운 리스트를 생성 */
				 	ArrayList<String> productlist1 = (ArrayList)session.getAttribute("productlist"); /* object -> arraylist */
						if(productlist1.size()<5){ /* 최근방문페이지가 5개 보다 작은경우  */
							switch(productlist1.size()) {/* switch-case문을 통해 방문페이지가 1개 2개 3개 4개 인경우 나눔 */
							case 1:%>
			<tr>
				<th>장바구니</th>
			</tr>
			<tr><!-- 방문한페이지주소 (링크)+ 이름으로 표현-->
				<td><a href=<%=productlist1.get(productlist1.size()-1) %>><%=productlist1.get(productlist1.size()-1)%></a></td>
			</tr>
			<tr>
				<td>호텔이름</td>
			</tr>
			<tr>
				<td>호텔이름</td>
			</tr>
			<tr>
				<td>호텔이름</td>
			</tr>
			<tr>
				<td>호텔이름</td>
			</tr>
			<%break;
			case 2:%>
			<tr>
				<th>장바구니</th>
			</tr>
			<tr>
				<td><a href=<%=productlist1.get(productlist1.size()-1) %>><%=productlist1.get(productlist1.size()-1)%></a></td>
			</tr>
			<tr>
				<td><a href=<%=productlist1.get(productlist1.size()-2) %>><%=productlist1.get(productlist1.size()-2) %></a></td>
			</tr>
			<tr>
				<td>호텔이름</td>
			</tr>
			<tr>
				<td>호텔이름</td>
			</tr>
			<tr>
				<td>호텔이름</td>
			</tr>
			<%break;
							case 3: %>
			<tr>
				<th>장바구니</th>
			</tr>
			<tr>
				<td><a href=<%=productlist1.get(productlist1.size()-1) %>><%=productlist1.get(productlist1.size()-1)%></a></td>
			</tr>
			<tr>
				<td><a href=<%=productlist1.get(productlist1.size()-2) %>><%=productlist1.get(productlist1.size()-2) %></a></td>
			</tr>
			<tr>
				<td><a href=<%=productlist1.get(productlist1.size()-3) %>><%=productlist1.get(productlist1.size()-3) %></a></td>
			</tr>
			<tr>
				<td>호텔이름</td>
			</tr>
			<tr>
				<td>호텔이름</td>
			</tr>
			<%break;
							case 4:%>
			<tr>
				<th>장바구니</th>
			</tr>
			<tr>
				<td><a href=<%=productlist1.get(productlist1.size()-1) %>><%=productlist1.get(productlist1.size()-1)%></a></td>
			</tr>
			<tr>
				<td><a href=<%=productlist1.get(productlist1.size()-2) %>><%=productlist1.get(productlist1.size()-2) %></a></td>
			</tr>
			<tr>
				<td><a href=<%=productlist1.get(productlist1.size()-3) %>><%=productlist1.get(productlist1.size()-3) %></a></td>
			</tr>
			<tr>
				<td><a href=<%=productlist1.get(productlist1.size()-4) %>><%=productlist1.get(productlist1.size()-4) %></a></td>
			</tr>
			<tr>
				<td>호텔이름</td>
			</tr>
			<%break;}%><!-- 스위치문 닫기 -->
			<!-- if문닫기(배열리스트길이가 5보다 작은경우) -->

			<!-- 방문한 페이지가 5개 이상인 경우 -->
			<%}else if(productlist1.size()>=5){ %><!-- 길이가 5이상인경우 -->
			<tr>
				<th>장바구니</th>
			</tr>
			<tr>
				<td><a href=<%=productlist1.get(productlist1.size()-1) %>><%=productlist1.get(productlist1.size()-1)%></a></td>
			</tr>
			<tr>
				<td><a href=<%=productlist1.get(productlist1.size()-2) %>><%=productlist1.get(productlist1.size()-2) %></a></td>
			</tr>
			<tr>
				<td><a href=<%=productlist1.get(productlist1.size()-3) %>><%=productlist1.get(productlist1.size()-3) %></a></td>
			</tr>
			<tr>
				<td><a href=<%=productlist1.get(productlist1.size()-4) %>><%=productlist1.get(productlist1.size()-4) %></a></td>
			</tr>
			<tr>
				<td><a href=<%=productlist1.get(productlist1.size()-5) %>><%=productlist1.get(productlist1.size()-5) %></a></td>
			</tr>
			<%}%><!-- 길이가 5이상인경우 닫기 -->
			<!-- 방문한 페이지가 없는 경우 기본값으로 비워둠 -->
			<%}else{%>
			<tr>
				<th>장바구니</th>
			</tr>
			<tr>
				<td>호텔이름</td>
			</tr>
			<tr>
				<td>호텔이름</td>
			</tr>
			<tr>
				<td>호텔이름</td>
			</tr>
			<tr>
				<td>호텔이름</td>
			</tr>
			<tr>
				<td>호텔이름</td>
			</tr>
			<%}%>
		</table>
	</nav>

	<nav id="Content">
		<!-- 각 조원들이 넣게될 본문 레이아웃 생성 -->
		<img id="mainPicture" src="pictures/MainJeju.JPG" width="800"
			height="400">
		<!-- 일단 잘 나오는지 보기위해서 이미지 삽입 -->
		<a href="ProductSummary.jsp"> <img id="hotelIcon"
			src="pictures/HotelIcon.png" width="100" height="100">
		</a>
	</nav>
	<!-- 본문 닫음 -->
</body>
<!-- body 닫음 -->
</html>