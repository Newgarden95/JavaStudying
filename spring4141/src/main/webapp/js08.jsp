<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src = "resources/js/jquery-3.6.0.js"></script><!-- $사인 사용가능 -->
<script type="text/javascript">
	$() //document.ready() ~> 바디부분이 준비 되면 실행해라!! => body먼저 읽어라 왜냐면 제이쿼리문을 사용하면 이 안에서 한번에 해결하기때문에(스크립트 바디를 오가지 않고 한번에 처리)
	$(function() {
		//body부분을 브라우저가 먼저 읽고 와서 실행할 내용을 익명함수에 바로 넣어준다.
		//RAM에 트리구조로 body부분을 만들어서 포함관계를 알 수 있다.
		//부모, 자식간의 관계가 성립
		//Document Object Model(DOM) tree
		//실행할 내용을 이름함수에 바로 넣어준다.
		alert('body태그 안에 있는 요소들을 모두 읽어서 브라우저가 인식하고 있음')
		//$('input').val() 가져올게 없어서 이거먼저 작성하면 안됨 ~> 버튼을 눌른경우로 바꿔줘
		
		//콜백함수
		$('#button1').click(function() {
			//button태그를 클릭했을 때 입력값으로 들어온 함수부분을 실행해 주세여!!.
			data = $('#data2').val() 
			alert('입력된 값은 ' + data)
		})
		
		$('#button2').click(function() {
			data1 = $('#data3').val()
			alert(data1 + '(으) 로 갈꺼야~!!')
		})
	})
</script>
</head>
<body>
<input id ="data1">
<input id ="data2">
<button id= "button1">뭐할꺼니??</button>
<hr color="green">
<input id = "data3">
<button id= "button2">어디로갈꺼니??</button>
</body>
</html>