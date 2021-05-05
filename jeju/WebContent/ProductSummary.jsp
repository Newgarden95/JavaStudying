<%@page import="jeju.ProductVO"%>
<%@page import="jeju.ProductDB"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// 로그인 세션을 받아줌
	String id = (String)session.getAttribute("id");
	// 아이콘을 눌렀을 때 해당 숙박 분류만 사용할 수 있도록 파라미터를 넘겨 주었습니다. 이것을 받아주기 위해 선언했습니다.
	String classification = request.getParameter("classification");	
	
	// 왼쪽에 공용시설, 객실 내 시설등을 조회할때 사용
	String[] CommonList = request.getParameterValues("Common");
	String[] InternalList = request.getParameterValues("Internal");
	
	// 요약을 출력해줄때 ArrayList를 이용해서 출력을 해주었습니다.
	ProductDB db = new ProductDB();
	ArrayList<ProductVO> summaryList = db.summaryList();
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>상품 요약</title>
		<link rel="stylesheet" type="text/css" href="style.css"><!-- style.css와 연결 -->
		<style type="text/css">
			
			.register{/* 숙소를 등록하는 버튼 */
				/* float:left; */
				padding: 20px 20px 20px 20px;
				width:120px;
				height:25px;			
				text-align: center;		
			}
			.button{/* 버튼의 스타일 설정 */
				background-color: blue;
				width: 100px;
				height: 40px;
				font-size: 18px;
				font-weight:bold;
				color: white;
			}
			#pSearch{/* 왼쪽에 위치한 숙박 조건을 적용해주는 부분의 css 설정 */
				float:left;				
				width:150px;
				height:350px;
				margin: 50px 10px 10px 10px;
				background: #16b4f7;
				border-radius: 10px;
			}
			#Summary{/* 상품이 요약되는 본문의 css 설정 */
				/* float:right;	 */
				width:800px;
				height:200px;
				/* margin: 10px 10px 10px 200px; */			
				background: #16b4f7;
				border-radius: 10px;
				text-align: top;	
				text-decoration:none;
				color: black;
				font-weight: bold;
				font-size: 20px;
				/* display:block; */	
				padding-bottom:500px;
			}
			#Summary .cellBlock{ /* 요약해서 보여주는 것이 테이블 형식으로 설정을했고, 글자뿐이 아니라 여백을 눌러도 사용할수 있도록 설정 */
				display:block;
				width:100%;
				color:black;
				/* height:100%; */
				text-decoration:none;
				text-align: left;				
			}
			#Summary .cellBlock:visited{/* 방문 햇던 링크의 의 색이 바뀌는 것을 없에주기 위해서 사용  */
				text-decoration:none;/* 링크의 밑줄을 없애줌 */
				color:black;/* 방문후 보라색으로 바뀌는것을 방문전의 색과 동일하게 해줌 */
						
			}
			#LeftSearch{ /* 요약 페이지의 왼쪽에 조건을 설정하는 부분의 위치를 조정하기 위해서 사용 */
				padding-bottom:500px;
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
					<img id="SearchImage" src="pictures/Search.png" width="25" height="25"><!-- 검색모양 이미지 -->
					<!-- <input type="text" name="find"> -->
				</form>
			</nav> <!-- 검색 레이아웃 완료 -->
			
			<nav id = "menu" ><!-- menu라는 id를 가진 레이아웃을 생성 -->
				<table>	<!-- 테이블 생성 -->
					<tr>	<!-- 테이블의 한줄을 생성 -->
						<th colspan="4" style="text-align: right; height: 41px"> <!-- 4열이 합병되고 오른쪽 정렬, 높이가 41px인 테이블 헤더 생성 -->
							<% if( id == null) { %> <!-- 세션을 이용해 로그인이 되지 않고 있을 때 아래 구문을 수행 -->
								로그인을 해주세요.
							<% } else { %>	<!-- 로그인이 되었을 경우 아래 구문 수행 -->
							    <%= id %>님 환영합니다.<a href="Logout.jsp">로그아웃</a>	<!-- 로그인된 사용자의 아이디를 출력 -->
							<% } %>
						</th><!-- 테이블 헤더 완성 -->
					</tr><!-- 테이블의 한줄을 완성 -->
					<tr>
						<td><!-- 테이블 데이터 셀을 생성 -->
							<a class="menuLink" href="MainPage.jsp">메인페이지</a>	<!-- 세션을 이용해 메인페이지 셀을 눌렀을때 로그인된 아이디 값을 넘겨주면서 메인페이지로 감 -->
						</td><!-- 테이블 데이터 완성 -->
						<td>
							<a class="menuLink" href="MyPage.jsp">마이페이지</a>
						</td>
						<td>
							<a class="menuLink" href="ServiceMain.jsp">고객센터</a>
						</td>
						<td>
							<% if( id == null) {	%> <!-- 세션을 이용해 로그인이 되지 않았을때 로그인을 하기위해서 로그인페이지로 연결되는 데이터셀을 생성 -->
								<a class="menuLink" href="Login.jsp">로그인</a>
							<%} else {%>	<!-- 로그인이 성공 했을경우 로그아웃을 할 수 있게하는 로그아웃으로 연결되는 셀을 생성 -->
								<a class="menuLink" href="UserUpdate.jsp">회원 정보</a>
							<%} %>
						</td>						
					</tr>
				</table> <!-- 테이블 완성 -->
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
			<div id="LeftSearch" style="float:left; width:15%; padding:5px;">
				<nav class = "register"><!-- 숙소를 등록하기 위한 버튼을 생성해주는 태그 -->
					<% if( id == null) {	%> <!-- 로그인을 하지 않고는 숙소를 등록할 수 없도록 설정, 로그인을 하지않을경우 로그인 버튼이 생성 -->
						<a href="Login.jsp">
							<button class="button">로그인</button>
						</a>
					<%} else {%>		<!-- 로그인을 했을경우 로그인 버튼이 숙소등록 버튼으로 바뀜 -->				
						<a href="ProductRegister.jsp?&classification=<%= classification %>">
							<button class="button">숙소 등록</button>
						</a>
					<%} %>		
					<a href="MainPage.jsp">
						<button class="button">돌아가기</button>
					</a>			
				</nav>
				<nav id="pSearch"><!-- 조건을 설정하는 창 -->
					<form action="ProductSummary.jsp?id=<%= id %>&classification=<%= classification %>&con=1">
						<!-- 이미지를 누르면 검색을 할수 있도록 하기위해서 form 형식으로 생성, 검색 하는것은 추후 추가 예정 -->
						<!-- <img id="SearchImage" src="pictures/Search.png" width="25" height="25"> --><!-- 검색모양 이미지 -->
						<!-- <input type="text" name="find"> -->	
						<table style="width: 100%; text-align: center;">
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
							<tr>
								<td>
									<button type="submit">조회</button>
								</td>
							</tr>
						</table>
					</form>
				</nav>
			</div>					
			<div style="float:left; width:80%; padding:20px;">	<!-- 상품이 요약되는 본문의 css 설정 -->
				<table id="Summary" style="border-radius: 10px;width: 98%"><!-- 테이블 크기 설정 -->
				<%
					for(int i = 0; i < summaryList.size() ; i++){/* ArrayList에 저장된 데이터들의 수만큼 반복하는 반복문 */
						ProductVO bag2 = summaryList.get(i);/* 저장해 놓은 데이터를 출력 */
						if(bag2.getProductClassification().equals(classification)){
							/* 아이콘을 눌러서 입력받은 파라미터를 ArrayList 안에 있는 데이터와 비교해서 맞는것만 출력되도록 비교문을 설정해줌 */
				%>
					<tr>
						<th width="400" rowspan="4"><!-- 그림이 의 크기를 설정해주기 위해서 테이블 해더의 넓이를 설정해주고, 오른쪽에 요약된 설명의 행수만큼을 병합해줌 -->
							<!-- 이거지워지면 스톱 -->
							<a class="cellBlock" href="Arraylist_basket.jsp?productNum=<%= bag2.getProductNum() %>&productName=<%= bag2.getProductName() %>">
								
							<!-- 링크를 누르면 해당 상품 번호의 파라미터를 넘겨줘서 해당 세부정보를 보여줌 -->
								<img src="<%= bag2.getProductImage() %>" width="100%">
								<!-- 등록을 할때 저장한 이미지경로를 가져와서 그 경로에 저장된 이미지를 출력해줌 -->
							</a>
						</th>
						<td height="35">
							<a class="cellBlock" href="ProductDetail.jsp?productNum=<%= bag2.getProductNum() %>">
							<!-- 링크를 누르면 해당 상품 번호의 파라미터를 넘겨줘서 해당 세부정보를 보여줌 -->
								상품 제목: <%= bag2.getProductName() %> <br>
								상품 번호: <%= bag2.getProductNum() %>
							</a>
						</td>
					</tr>
					<tr>
						<td height="35">
							<a class="cellBlock" href="ProductDetail.jsp?productNum=<%= bag2.getProductNum() %>">
							<!-- 링크를 누르면 해당 상품 번호의 파라미터를 넘겨줘서 해당 세부정보를 보여줌 -->
								상품 평점: <!-- 후기에서 작성한 평점을 가져와주는 역할을 함 -->
							</a>
						</td>
					</tr>
					<tr>
						<td height="35">
							<a class="cellBlock" href="ProductDetail.jsp?&productNum=<%= bag2.getProductNum() %>">
								상품 주소: <%= bag2.getProductLocation() %>
							</a>
						</td>
					</tr>
					<tr>
						<td height="35">
							<a class="cellBlock" href="ProductDetail.jsp?productNum=<%= bag2.getProductNum() %>">
								상품 가격: <%= bag2.getProductPrice() %>
							</a>
						</td>								
					</tr>					
				<%
							}
					}
				%>					
				</table>
			</div>			
			
		</nav> <!-- 본문 닫음 -->
	</body><!-- body 닫음 -->
</html>