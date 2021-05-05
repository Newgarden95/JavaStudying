<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 제이쿼리 라이브러리 로드 -->
<script type="text/javascript" src = "resources/js/jquery-3.6.0.js"></script>
<!-- 라이브러리는 1개만 추가!!! 사이트에 총 3개의 라이브러리가 있는데 2개이상 설정하면 에러!!! -->
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=a928be6ed8a88c1ba98215dcf28ec6f0&libraries=services,clusterer,drawing"></script>

<script type="text/javascript">
$(function() {	
	var mapContainer = $("#map").val(), // 지도를 표시할 div 
	mapOption = {
		center : new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
		level : 3 // 지도의 확대 레벨
	};
	// 지도를 생성합니다    
	var map = new kakao.maps.Map(mapContainer, mapOption);

	// 주소-좌표 변환 객체를 생성합니다
	var geocoder = new kakao.maps.services.Geocoder();
	
	// 주소로 좌표를 검색합니다
	// 주소만 변경해주면서 반복문 돌림
	geocoder.addressSearch('제주특별자치도 제주시 첨단로 242',function(result, status) {
		// 정상적으로 검색이 완료됐으면 
		if (status === kakao.maps.services.Status.OK) {
			//주소에 해당하는 좌표를 coords에 저장
			var coords = new kakao.maps.LatLng(result[0].y,result[0].x);

			// 결과값으로 받은 위치를 마커로 표시합니다
			var marker = new kakao.maps.Marker({map : map, position : coords, clickable: true}); 
			// 인포윈도우로 장소에 대한 설명을 표시합니다(// 마커를 클릭했을 때 마커 위에 표시할 인포윈도우를 생성합니다)
			var infowindow = new kakao.maps.InfoWindow({content : '<div style="width:150px;text-align:center;padding:6px 0;">우리회사</div>'});
			infowindow.open(map, marker);//맵에 찍어줌
			
			// 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
			map.setCenter(coords);
			}
		});
})
</script>
</head>

<body>
<div id="map" style="width:100%;height:350px;"></div>
</body>
</html>