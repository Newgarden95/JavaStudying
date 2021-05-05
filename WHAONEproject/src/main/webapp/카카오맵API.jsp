<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src = "resources/js/jquery-3.6.0.js"></script>
<!-- 라이브러리는 1개만 추가!!! 사이트에 총 3개의 라이브러리가 있는데 2개이상 설정하면 에러!!! -->
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=a928be6ed8a88c1ba98215dcf28ec6f0&libraries=services,clusterer,drawing"></script>
<script type="text/javascript">
$(function() {
		
	//주소를 받아 위도/경도로 바꿔주기
		var geocoder = new kakao.maps.services.Geocoder(); //geocoder : 주소를 입력하면 위도와 경도로 바꿔주는 객체
		//AJAX를 통해 상품테이블에서 주소받아와서 배열에 담기
		var addressArray = [ '서울특별시 마포구 염리동 45 마포자이3차', '서울특별시 마포구 마포대로 지하33', '서울특별시 마포구 신촌로 160' ];
		let feature = ['a','b','c']
		var mapContainer = document.getElementById('map');
		var mapOption = {
			center : new kakao.maps.LatLng(37.55510837919797, 126.93680885227917),
			level : 5
		};

		var map = new kakao.maps.Map(mapContainer, mapOption);
		//배열로 받아온 주소개수 만큼 반복문 실행
		for (let i = 0; i < addressArray.length; i++) {
			console.log(feature[i])
			//addressSearch : 입력한 주소를 위도/경도로 변경해주는 메서드
			geocoder.addressSearch(addressArray[i], function(result, status) {
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
					console.log(i)
					console.log(feature[i])
					// 마커를 클릭했을 때 마커 위에 표시할 인포윈도우를 생성합니다
					var iwContent = '<div style="padding:5px;">'+feature[i]+'</div>', // 인포윈도우에 표출될 내용으로 HTML 문자열이나 document element가 가능합니다
					    iwRemoveable = true; // removeable 속성을 ture 로 설정하면 인포윈도우를 닫을 수 있는 x버튼이 표시됩니다

					// 인포윈도우를 생성합니다
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
})
</script>
</head>
<body>
<div style="padding:5px;">feature[i]</div>
<div id="map" style="width:500px;height:400px;"></div>
</body>
</html>