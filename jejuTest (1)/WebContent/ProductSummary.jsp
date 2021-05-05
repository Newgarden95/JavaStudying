<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>상품 요약</title>
		<link rel="stylesheet" type="text/css" href="style.css"><!-- style.css와 연결 -->
		<style type="text/css">
			.register{
				/* float:left; */
				padding: 20px 20px 20px 20px;
				width:120px;
				height:25px;			
				text-align: center;		
			}
			.button{
				background-color: blue;
				width: 100px;
				height: 40px;
				font-size: 18px;
				font-weight:bold;
				color: white;
			}
			#pSearch{
				/* float:left; */				
				width:150px;
				height:600px;
				margin: 10px 10px 10px 10px;
				background: #16b4f7;
				border-radius: 10px;
			}
			#Summary{
				/* float:right;	 */
				width:800px;
				height:661px;
				/* margin: 10px 10px 10px 200px; */
				top:20px;
				background: #16b4f7;
				border-radius: 10px;
			}			
		</style>
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
					<img id="image" src="pictures/Search.png" width="25" height="25"><!-- 검색모양 이미지 -->
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
		
		<nav id="FixedBasket"><!-- 오른쪽에 고정될 장바구니 디스플레이를 만들기위해서 FixedBasket 아이디를 가진 nav 레이아웃 생성 -->
			<table id="BasketContent" style="width:100%" >	<!-- 장바구니는 아래로 쭉 나와야 하기 때문에 하나의 열을 가진  테이블을 생성-->
				<tr> <!-- 각 테이블의 행을 생성하는 태그 -->
					<th>장바구니</th> <!-- 테이블의 헤더를 생성 -->
				</tr>
				<tr>
					<td>호텔이름</td> <!-- 테이블의 데이터를 생성 -->
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
			</table><!-- 테이블을 닫음 -->
		</nav> <!-- 장바구니 레이아웃을 닫아줌 -->
		
		<nav id="Content"> <!-- 각 조원들이 넣게될 본문 레이아웃 생성 -->
			<table>
				<tr>
					<td>
						<nav class = "register">
							<a href="ProductRegister.jsp">
								<button class="button">숙소 등록</button>
							</a>
						</nav>
						<nav id="pSearch">
							상세검색
							<form><!-- 이미지를 누르면 검색을 할수 있도록 하기위해서 form 형식으로 생성, 검색 하는것은 추후 추가 예정 -->
								<img id="SearchImage" src="pictures/Search.png" width="25" height="25"><!-- 검색모양 이미지 -->
								<!-- <input type="text" name="find"> -->
								<table>
									<tr>
										<th>공용시설</th>
									</tr>
									<tr>
										<td>
											<input type="checkbox" id="Cafe" name="Common" value="Cafe">
											<label for="Cafe">카페</label><br>
											<input type="checkbox" id="Pool" name="Common" value="Pool">
											<label for="Pool">수영장</label><br>
											<input type="checkbox" id="Convenience" name="Common" value="Convenience">
											<label for="Convenience">편의점</label><br>
											<input type="checkbox" id="Parking" name="Common" value="Parking">
											<label for="Parking">주차장</label><br>
										</td>
									</tr>						
									<tr>
										<th>
											객실 내 시설
										</th>							
									</tr>
									<tr>
										<td>
											<input type="checkbox" id="Wifi" name="Internal" value="Wifi">
											<label for="Wifi">와이파이</label><br>
											<input type="checkbox" id="Tv" name="Internal" value="Tv">
											<label for="Tv">TV</label><br>
											<input type="checkbox" id="Refrigerator" name="Internal" value="Refrigerator">
											<label for="Refrigerator">냉장고</label><br>
											<input type="checkbox" id="Bathtub" name="Internal" value="Bathtub">
											<label for="Bathtub">욕조</label><br>
										</td>
									</tr>
								</table>
							</form>
						</nav>
					</td>
					<td>	
						<div id="Summary">
							상품요약<br>
							<table>
								<tr>
									<td>상품1</td>
								</tr>
								<tr>
									<td>상품2</td>
								</tr>
								<tr>
									<td>상품3</td>
								</tr>
								<tr>
									<td>상품4</td>
								</tr>
								<tr>
									<td>상품5</td>
								</tr>
							</table>
						</div>
					</td>
				</tr>
			</table>
		</nav> <!-- 본문 닫음 -->
	</body><!-- body 닫음 -->
</html>