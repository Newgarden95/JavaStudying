<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>호텔 등록</title>
		<link rel="stylesheet" type="text/css" href="style.css"><!-- style.css와 연결 -->
	</head>
	<body>
		<header><!-- HTML 레이아웃 중 하나인 header 부분에 메뉴를 생성 -->
			<nav id = "logo">	<!-- HTML 레이아웃중 하나인 nav 부분에 생성, id는 logo 로 지정해서 style.css에서 logo를 이용해 style을 만들어줌  -->
				<a href="MainPage.jsp"> <!-- 로고를 누르면 메인페이지를 갈수 있도록 하는 a 태그 생성 -->
					<img src="pictures/MainLogo.png" width="80" height="80">	<!-- 80x80짜리 경로를 따라서 이미지를 가져옴 -->
				</a>
			</nav> <!-- 로고 레이아웃 완료 -->
			
			<nav id = "search">	<!-- search라는 id를 가진 검색부분 레이아웃을 생성 -->
				<form><!-- 이미지를 누르면 검색을 할수 있도록 하기위해서 form 형식으로 생성, 검색 하는것은 추후 추가 예정 -->
					<img id="SearchImage" src="pictures/Search.png" width="25" height="25"><!-- 검색모양 이미지 -->
					<!-- <input type="text" name="find"> -->
				</form>
			</nav> <!-- 검색 레이아웃 완료 -->
			
			<nav id = "menu" ><!-- menu라는 id를 가진 레이아웃을 생성 -->
				<ul type="circle"><!-- menu 레이아웃 부분에는 순서가 없는 리스트가 생성-->
					<!-- 각 메뉴를 누르면 해당 페이지로 넘어가는 리스트를 생성, class는 menu 아이디를 가진 태그 안의 class 테그 들의 스타일을 설정할 때 사용. -->
					<li><a class="menuLink" href="MainPage.jsp">메인페이지</a></li>
					<li><a class="menuLink" href="MyPage.jsp">마이페이지</a></li>
					<li><a class="menuLink" href="Service.jsp">고객센터</a></li>
					<li><a class="menuLink" href="Login.jsp">로그인</a></li>
				</ul>
			</nav><!-- menu 레이아웃 완료 -->
			
		</header> <!-- 헤더 레이아웃 완료 -->
		
		<nav id="Content" style="background:#16b4f7;"> <!-- 각 조원들이 넣게될 본문 레이아웃 생성 -->
			<form action="ProductDbConnect.jsp">
				<table id="registerForm" style="padding:20px; font-size: 15px; font-weight: bold;">
					<tr>
						<td>
							숙박 종류:
						</td>
						<td>
							<select id="Classification">
								<option value="Hotel">호텔</option>
								<option value="Resort">리조트</option>
								<option value="Pension">펜션</option>
								<option value="GuestHouse">게스트하우스</option>
							</select>
						</td>
					</tr>
					<tr>
						<td>
							호텔 이름:
						</td>
						<td>
							<input type="text" id="Name">
						</td>
					</tr>
					<tr>
						<td>
							호텔 이미지:
						</td>
						<td>
							<!-- <input type="file" id="HotelImage" accept="image/*"> -->
							<input type="text" id="Image">
						</td>
					</tr>
					<tr>
						<td>
							호텔 가격:
						</td>
						<td>
							<input type="text" id="Price">
						</td>
					</tr>
					<tr>
						<td>
							호텔 위치:
						</td>
						<td>
							<input type="text" id="Location">
						</td>
					</tr>
					<tr>
						<td>
							공용 시설:
						</td>
						<td> 
							<input type="checkbox" id="Cafe" name="Common" value="Cafe">
							<label for="Cafe">카페</label>
							<input type="checkbox" id="Pool" name="Common" value="Pool">
							<label for="Pool">수영장</label>
							<input type="checkbox" id="Convenience" name="Common" value="Convenience">
							<label for="Convenience">편의점</label>
							<input type="checkbox" id="Parking" name="Common" value="Parking">
							<label for="Parking">주차장</label>
						</td>
					</tr>							
					<tr>
						<td>
							객실 시설:
						</td>
						<td>
							<input type="checkbox" id="Wifi" name="Internal" value="Wifi">
							<label for="Wifi">와이파이</label>
							<input type="checkbox" id="Tv" name="Internal" value="Tv">
							<label for="Tv">TV</label>
							<input type="checkbox" id="Refrigerator" name="Internal" value="Refrigerator">
							<label for="Refrigerator">냉장고</label>
							<input type="checkbox" id="Bathtub" name="Internal" value="Bathtub">
							<label for="Bathtub">욕조</label>
						</td>
					</tr>
					<tr>
						<td>
							룸 타입:
						</td>
						<td>
							<input type="radio" id="Single" name="RoomType" value="Single">
							<label for="Single">싱글</label>
							<input type="radio" id="Double" name="RoomType" value="Double">
							<label for="Double">더블</label>
							<input type="radio" id="Twin" name="RoomType" value="Twin">
							<label for="Twin">트윈</label>
						</td>
					</tr>
					<tr>
						<td>
							픽업 여부:
						</td>
						<td>
							<input type="radio" id="Yes" name="Pickup" value="Yes">
							<label for="Yes">가능</label>
							<input type="radio" id="No" name="Pickup" value="No">
							<label for="No">불가능</label>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							호텔 상세 정보:
						</td>
					</tr>
					<tr>
						<td>						
						</td>		
						<td>
							<textarea name = "Info" rows="20" cols="120"></textarea>
						</td>
					</tr>
				</table>
				<button id="regButton" type="submit" style="margin: 0px 30px 10px 30px; width: 150px; height: 40px; font-size: 20px;">정보 등록</button>
			</form>
		</nav> <!-- 본문 닫음 -->
	</body>
</html>