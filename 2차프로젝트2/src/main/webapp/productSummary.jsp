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
	
<!-- 제이쿼리 -->
<script type="text/javascript" src = "resources/js/jquery-3.6.0.js"></script>

<!-- Include the plugin's CSS and JS: -->
<script type="text/javascript" src="resources/js/bootstrap-multiselect.js"></script>
<link rel="stylesheet" href="resources/css/bootstrap-multiselect.css" type="text/css"/>
<!-- Initialize the plugin: -->

<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=a928be6ed8a88c1ba98215dcf28ec6f0&libraries=services,clusterer,drawing"></script>
<script type="text/javascript">

	$(function() {
		//카카오맵API 비동기 통신 부분
		$.ajax({
			url : "address",
			success: function(result) {
			console.log("result: ",result)
			console.log(result[0].address)
			var address = [] //DB에서 받아온 주소 목록들을 담아둘 배열
			for (var i = 0; i < result.length; i++) {
				address[i] = result[i].address
			}
			console.log(address)
			
		//주소를 받아 위도/경도로 바꿔주기
			var geocoder = new kakao.maps.services.Geocoder(); //geocoder : 주소를 입력하면 위도와 경도로 바꿔주는 객체
			//AJAX를 통해 상품테이블에서 주소받아와서 배열에 담기
			//var addressArray = [ '서울특별시 마포구 염리동 45 마포자이3차', '서울특별시 마포구 마포대로 지하33', '서울특별시 마포구 신촌로 160' ];
			let feature = ['a','b','c']
			var mapContainer = document.getElementById('map');
			var mapOption = {
				center : new kakao.maps.LatLng(37.55510837919797, 126.93680885227917),
				level : 5
			};
			var map = new kakao.maps.Map(mapContainer, mapOption);
			//배열로 받아온 주소개수 만큼 반복문 실행
			for (var i = 0; i < address.length; i++) {
				console.log(feature[i])
				//addressSearch : 입력한 주소를 위도/경도로 변경해주는 메서드
				geocoder.addressSearch(address[i], function(result, status) {
					//정상적으로 검색이 완료됐으면
					if (status === kakao.maps.services.Status.OK) {
						//coords라는 변수에 위도와 경도를 찍어준다 ~> y좌표가 위도/x좌표가 경도  (https://developers.kakao.com/docs/latest/ko/local/dev-guide#address-coord  : RoadAaddress부분확인하기 )
						var coords = new kakao.maps.LatLng(result[0].y, result[0].x);
						 // 결과값으로 받은 위치를 마커로 표시합니다
						var marker = new kakao.maps.Marker({
							map : map,
							position : coords,
							clickable: true
							});
						console.log(feature[i])
						// 마커를 클릭했을 때 마커 위에 표시할 인포윈도우를 생성합니다
						var iwContent = '<div style="width:50px; height:200px">gd</div>', // 인포윈도우에 표출될 내용으로 HTML 문자열이나 document element가 가능합니다
						    iwRemoveable = true; // removeable 속성을 ture 로 설정하면 인포윈도우를 닫을 수 있는 x버튼이 표시됩니다
						// 인포윈도우를 생성합니다(https://apis.map.kakao.com/web/sample/removableCustomOverlay/)
						var infowindow = new kakao.maps.InfoWindow({
						    content : iwContent,
						    removable : iwRemoveable
						});
						// 마커에 클릭이벤트를 등록합니다
						kakao.maps.event.addListener(marker, 'click', function() {
						      // 마커 위에 인포윈도우를 표시합니다
						      infowindow.open(map, marker);  
						});
						 //지도의 중심을 결과값으로 받은 위치로 이동시킵니다
						//map.setCenter(37.55510837919797, 126.93680885227917)
						}
					})
				}
			}
		})
		
		//상품검색 카테고리(셀렉트태그) AJAX활용
		var roomType1;
		var saleType1;
		var sectionType1;
		var arr1 = [ "none", "none", "none"]; //배열 초기화(자바스크립트에서 배열 = List = ArrayList)
		//방종류 셀렉트 태그에서 선택된 값 받아오기
		//$(this).val() ~> 타입 종류
		$('#roomType').change(function() {
			roomType1 = $(this).val() //roomType변수에 방종류 넣어줌(oneroom, apt, opst)
			arr1[0] = roomType1
			console.log(arr1)
			//서버로 데이터 넘겨주기
			$.ajax({
				type : "POST",
				url : "select",
				data : {
					arr : arr1,
				},
				success : function() {
					console.log("연결성공")
					//받아온 상품정보를 상품목록에 보여주기
				}
			})
		})
		//거래유형 셀렉트 태그에서 선택된 값 받아오기
		$('#saleType').change(function() {
			var saleType1 = $(this).val() //saleType변수에 거래유형 넣어줌(charter, monthly, trading)
			arr1[1] = saleType1
			console.log(arr1)

			$.ajax({
				type : "POST",
				url : "select",
				data : {
					arr : arr1,
				},
				success : function() {
					console.log("연결성공")
					//받아온 상품정보를 상품목록에 보여주기
				}
			})
		})
		//땡세권 셀렉트 태그에서 선택된 값 받아오기
		$('#sectionType').change(function() {
			var sectionType1 = $(this).val() //sectionType변수에 땡세권 넣어줌(station, cs, school)
			arr1[2] = sectionType1
			console.log(arr1)
			$.ajax({
				type : "POST",
				url : "select",
				data : {
					arr : arr1
				},
				success : function() {
					console.log("연결성공")
					//받아온 상품정보를 상품목록에 보여주기
				}
			})
		})
		
		//상품
		
		
}) //$(func) 끝

</script>
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

	<!--   -->
	<section class="content">
		<div class="top">
			<div class="empty"
				style="width: 30%; height: 50px; background-color: #007bff"></div>
			<div class="category">
				<div class="category_common">
					<form>
						<select name="roomType" id = "roomType" style="width: 200px; height: 50px; text-align-last: center; font-size: 25px;font-weight: bold; background-color: #87CEFA ">
							<option value="none" selected>방종류</option>
							<option value="oneroom">원룸</option>
							<option value="apt">아파트</option>
							<option value="opst">오피스텔</option>
						</select>
					</form>
				</div>
				<div class="category_common">
					<form>
						<select name="saleType" id = "saleType" style="width: 200px; height: 50px; text-align-last: center; font-size: 25px;font-weight: bold; background-color: #87CEFA">
							<option value="none" selected>거래유형</option>
							<option value="charter">전세</option>
							<option value="monthly">월세</option>
							<option value="trading">매매</option>
						</select>
					</form>
				</div>
				<div class="category_common">
					<form>
						<select name="sectionType" id = "sectionType" style="width: 200px; height: 50px; text-align-last: center; font-size: 25px;font-weight: bold; background-color: #87CEFA ">
							<option value="none" selected>땡세권</option>
							<option value="station">역세권</option>
							<option value="cs">편세권</option>
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
					</div>
					<div>asda</div>
				</li>
			</ul>
		</div>

		<div id="map" style="width: 68%; height: 680px;"></div>
		<!-- 카카오맵API 설정 (head부분에 넣으면 오류발생)-->
		<!-- 라이브러리는 1개만 추가!!! 사이트에 총 3개의 라이브러리가 있는데 2개이상 설정하면 에러!!! -->
		
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