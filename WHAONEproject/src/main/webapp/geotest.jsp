<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src = "resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=a928be6ed8a88c1ba98215dcf28ec6f0&libraries=services,clusterer,drawing"></script>
<script type="text/javascript">
$(function() {
	var mapContainer = $('#map')[0], // 지도를 표시할 div  document.getElementById('map') 과 $('#map')[0] 은 같은거야 하지만 제이쿼리문으로 사용할 떄는 [0]을해줘야함 
	mapOption = { 
	    center: new kakao.maps.LatLng(37.55510837919797, 126.93680885227917), // 지도의 중심좌표
	    level: 8 // 지도의 확대 레벨
	};
	
	//주소를 받아 위도/경도로 바꿔주기
	var geocoder = new kakao.maps.services.Geocoder();
	var addressArray = ['서울특별시 마포구 염리동 45 마포자이3차','서울특별시 마포구 마포대로 지하33','서울특별시 마포구 신촌로 160'];
	var total = addressArray.length;
	var latitude = '';
	var longtitude = '';
	var index = 0;
	var counter = 0;
	var latitudeNew = [];
	var longtitudeNew = [];
	console.log(addressArray.length)
	
	addressArray.forEach(function(addr) {
		geocoder.addressSearch(addr, function(data, status) {
			latitude = data[0].x
			longtitude = data[0].y

			latitudeNew[index] = latitude
			longtitudeNew[index] = longtitude
			
			index++;
			counter++;
			if(total === counter){
				dosomething();
			}
		})
	})
	
	function dosomething() {
		console.log(latitudeNew)
		console.log(longtitudeNew)
	}
	
	console.log("==================")
	console.log(latitudeNew)
	var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

	//마커가 표시될 위치입니다 
	for (var i = 0; i < addressArray.length; i++) {
		var markerPosition = new kakao.maps.LatLng(latitudeNew[i], longtitudeNew[i]); 
		//마커를 생성합니다
		var marker = new kakao.maps.Marker({
		position: markerPosition
		});
		//마커가 지도 위에 표시되도록 설정합니다
		marker.setMap(map);
	}
	
	
	/*
	var callback = function(result, status) {
	    if (status === kakao.maps.services.Status.OK) {
	        console.log(result[0].x)
	        console.log(result[0].y)
	        list = [result[0].x, result[0].y]
	        return list
	    }
	};
	//도로명 주소 / 지번만 가능
	geocoder.addressSearch('서울특별시 마포구 염리동 45 마포자이3차', callback);
	*/
})
</script>
</head>
<body>
<div id="map" style="width:500px;height:400px;"></div>
</body>
</html>