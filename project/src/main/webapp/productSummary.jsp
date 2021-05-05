<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.content {
	float: left;
	width: 100%;
	height: 100%;
}

.top {
	float: left;
	width: 100%;
	height: 20%;
}

.empty {
	display: inline-block; /* div 수평정렬 width, height로 설정한 부분 이외 블록처리 */
}

.category {
	display: inline-block; /* div 수평정렬 */
	float: right;
	width: 70%;
	height: 20%;
}

#productSummary {
	float: left;
	width: 30%;
	height: 80%;
}

/* 카테고리 div영역내에 있는 div를 수평으로 나열하기 위한 설정 */
.category_common {
	display: inline-block; /* div 수평정렬 */
	width: 200px;
	height: 50px;
}

.product_img {
	display: inline-block; /* div 수평정렬 */
	width: 30%;
}

.explain {
	display: inline-block; /* div 수평정렬 */
	width: 50%;
	margin-left: 40px;
	margin-bottom: 30px;
}
</style>

<!-- Bootstrap core CSS -->
<link href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">

<!-- Custom fonts for this template -->
<link href="resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
<link href="resources/vendor/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="resources/vendor/fontawesome-free/css/all.min.css/vendor/simple-line-icons/css/simple-line-icons.css" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">

<!-- Custom styles for this template -->
<link href="resources/css/landing-page.min.css" rel="stylesheet" type="text/css">
<link href="resources/css/landing-page.css" rel="stylesheet" type="text/css">
	
<!-- 제이쿼리 라이브러리 -->
<script type="text/javascript" src = "resources/js/jquery-3.6.0.js"></script>

</script>

<!-- $.ajax 사용하여 버튼이든 뭐든 특정한 이벤트 없이 바로 서버와 비동기통신가능  
<script type="text/javascript">
	$(function() {
		$.ajax({
			url: "test.jsp",
			success: function(result) {
				alert(result)
			}
		})
	})
</script>
-->
</head>
<body>
	<!-- Navigation : 위에 부분-->
	<nav class="navbar navbar-light bg-light static-top">
		<div class="logo">
			<a class="navbar-brand" href="main.jsp">내 집은 신촌에 있나방</a>
		</div>
		<div id="menu">
			<a class="btn btn-primary btn-lg" href="productSummary.jsp">방찾기</a> <a
				class="btn btn-primary btn-lg" href="#">마이페이지</a> <a
				class="btn btn-primary btn-lg" href="#">방내놓기</a> <a
				class="btn btn-primary btn-lg" href="#">고객센터</a> <a
				class="btn btn-primary btn-lg" href="#">Sign In</a>
		</div>
	</nav>
	<!-- 카테고리 영역 ~ ajax를 통해 입력된 값을 서버로 보내 해당하는 상품만 출력해서 화면에 상품목록 띄우기 -->
	<section class="content">
		<div class="top">
			<div class="empty"
				style="width: 30%; height: 50px; background-color: #007bff"></div>
			<div class="category">
				<div class="category_common">
					<form>
						<select name="roomType" style="width: 200px; height: 50px; text-align-last: center; background-color: #87CEEB; font-size: 20px; font-weight: bold">
							 <option value="none" selected>방종류</option>
							<option value="oneroom" >원룸</option>
							<option value="tworoom">투룸</option>
							<option value="threeroom">쓰리룸</option>
						</select>
					</form>
				</div>
				<div class="category_common">
					<form>
						<select name="dealType" style="width: 200px; height: 50px; text-align-last: center; background-color: #87CEEB; font-size: 20px; font-weight: bold">
							 <option value="none" selected>거래유형</option>
							<option value="charter" >전세</option>
							<option value="monthly">월세</option>
							<option value="Trading">매매</option>
						</select>
					</form>
				</div>
				<div class="category_common">
					<form>
						<select name="section" style="width: 200px; height: 50px; text-align-last: center; background-color: #87CEEB; font-size: 20px; font-weight: bold">
							 <option value="none" selected>땡세권</option>
							<option value="station" >역세권</option>
							<option value="convenientstore">편세권</option>
							<option value="school">학세권</option>
						</select>
					</form>
				</div>
			</div>
		</div>
		
		<!-- 페이징처리하기 -->
		<div id="productSummary">
			<ul style="list-style: none; padding-left: 0px;">
				<li>
					<div class="product">
						<div class="product_img">
							<!-- 사진 -->
							<!-- 해당하는 상품넘버를 받아서 처리해주기 -->
							<a href="productdetail.jsp?Pnum=<%=1%>"><img
								src="resources/img/home.jpg" style="width: 120%; height: 150px"></a>
						</div>
						<div class="explain">
							<!-- 간단한 설명 -->
							<ul style="list-style: none; padding-left: 0px;">
								<li>집이름</li>
								<li>설명</li>
								<li>그냥저냥</li>
							</ul>
						</div>
					</div> <br>
				</li>
				<li>
					<div class="product">
						<div class="product_img">
							<!-- 사진 -->
							<!-- 해당하는 상품넘버를 받아서 처리해주기 -->
							<a href="productdetail.jsp?Pnum=<%=2%>"><img
								src="resources/img/home.jpg" style="width: 120%; height: 150px"></a>
						</div>
						<div class="explain">
							<!-- 간단한 설명 -->
							<ul style="list-style: none; padding-left: 0px;">
								<li>집이름</li>
								<li>설명</li>
								<li>그냥저냥</li>
							</ul>
						</div>
					</div> <br>
				</li>
				<li>
					<div class="product">
						<div class="product_img">
							<!-- 사진 -->
							<!-- 해당하는 상품넘버를 받아서 처리해주기 -->
							<a href="productdetail.jsp?Pnum=<%=3%>"><img
								src="resources/img/home.jpg" style="width: 120%; height: 150px"></a>
						</div>
						<div class="explain">
							<!-- 간단한 설명 -->
							<ul style="list-style: none; padding-left: 0px;">
								<li>집이름</li>
								<li>설명</li>
								<li>그냥저냥</li>
							</ul>
						</div>
					</div> <br>
				</li>
				<li>
					<div class="product">
						<div class="product_img">
							<!-- 사진 -->
							<!-- 해당하는 상품넘버를 받아서 처리해주기 -->
							<a href="productdetail.jsp?Pnum=<%=4%>"><img
								src="resources/img/home.jpg" style="width: 120%; height: 150px"></a>
						</div>
						<div class="explain">
							<!-- 간단한 설명 -->
							<ul style="list-style: none; padding-left: 0px;">
								<li>집이름</li>
								<li>설명</li>
								<li>그냥저냥</li>
							</ul>
						</div>
					</div> <br>
				</li>
			</ul>
		</div>

		<div id="map" style="width: 68%; height: 680px;"></div>
		<!-- 카카오맵API 설정 (head부분에 넣으면 오류발생)-->
		<!-- 라이브러리는 1개만 추가!!! 사이트에 총 3개의 라이브러리가 있는데 2개이상 설정하면 에러!!! -->
		<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=a928be6ed8a88c1ba98215dcf28ec6f0&libraries=services,clusterer,drawing"></script>
		<script type="text/javascript">
			var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
			mapOption = {
				center : new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
				level : 3
			// 지도의 확대 레벨
			};
			//지도를 표시할 div와  지도 옵션으로  지도를 생성합니다
			var map = new kakao.maps.Map(mapContainer, mapOption);
			// 주소-좌표 변환 객체를 생성합니다
			var geocoder = new kakao.maps.services.Geocoder();
			
		</script>
		<div style="height: 100px"></div>
	</section>

	<!-- Footer -->
	<footer class="footer bg-light">
		<div class="container">
			<div class="row">
				<div class="col-lg-6 h-100 text-center text-lg-left my-auto">
					<ul class="list-inline mb-2">
						<li class="list-inline-item"><a href="#">About</a></li>
						<li class="list-inline-item">&sdot;</li>
						<li class="list-inline-item"><a href="#">Contact</a></li>
						<li class="list-inline-item">&sdot;</li>
						<li class="list-inline-item"><a href="#">Terms of Use</a></li>
						<li class="list-inline-item">&sdot;</li>
						<li class="list-inline-item"><a href="#">Privacy Policy</a></li>
					</ul>
					<p class="text-muted small mb-4 mb-lg-0">&copy; Your Website
						2020. All Rights Reserved.</p>
				</div>
				<div class="col-lg-6 h-100 text-center text-lg-right my-auto">
					<ul class="list-inline mb-0">
						<li class="list-inline-item mr-3"><a href="#"> <i
								class="fab fa-facebook fa-2x fa-fw"></i>
						</a></li>
						<li class="list-inline-item mr-3"><a href="#"> <i
								class="fab fa-twitter-square fa-2x fa-fw"></i>
						</a></li>
						<li class="list-inline-item"><a href="#"> <i
								class="fab fa-instagram fa-2x fa-fw"></i>
						</a></li>
					</ul>
				</div>
			</div>
		</div>
	</footer>

</body>
</html>