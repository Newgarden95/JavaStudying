<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!--  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script><!--https://developers.google.com/speed/libraries#jquery에서 긁어오기 CDN으로 제이쿼리 사용 파일을 넣는게 귀찮은경우(colab) 네트워크 연결이라 편함 -->
<script type="text/javascript" src = "resources/js/jquery-3.6.0.js"></script><!-- 다운받은거 사용 -->
<script type="text/javascript">
/*
$(function() {//익명함수(anonymous function) : 호출없이 바로 실행시키기 위해 설정 /$(): 태그의 바디 부분 즉, document쪽을 의미 #
	$('button').click(function() {
		dataTag = $('#data')						//#data : id를 인식 즉, $('#data')는 input태그를 의미
		dataValue = dataTag.val()					//.val() : .value과 같음
		alert(dataValue)
	})
})*/

$(function() { //기본구조
	$('#button1').click(function() {//원래는 함수를 넣어서 그 함수를 호출하는데 여기서 한번에 다 해결하기 위해 익명함수 사용
		data = $('#data1').val()
		alert(data)
	})
	
	$('#button2').click(function() {
		go = $('#data2').val()
		alert(go)
	})
	
	$('#button3').click(function() {
		id = $('#data3').val()
		alert("아이디 길이는 "+ id.length+"입니다")
	})
})
</script>
</head>
<body>
<input id ="data1" value="밥먹으러 가자...!!!">
<button id= "button1">뭐할꺼니??</button> <!-- onclick 없이 호출하기 => 위 스크립트 문에서  $('button').click로 바로-->

<input id ="data2">
<button id= "button2">오늘 끝나고 어디로 갈까?</button> <!-- onclick 없이 호출하기 => 위 스크립트 문에서  $('button').click로 바로-->

<input id ="data3">
<button id= "button3">아이디 길이 체크</button> <!-- onclick 없이 호출하기 => 위 스크립트 문에서  $('button').click로 바로-->
</body>
</html>