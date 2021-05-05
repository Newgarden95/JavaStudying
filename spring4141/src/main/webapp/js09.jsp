<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src = "resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function() {
		
		$('button').click(function() {
			pw1 = $('#pw1').val()
			pw2 = $('#pw2').val()
			
			if(pw1 == pw2){
				$('#check').html('<h2 style=color:blue>비밀번호가 일치합니다.</h2>')
			}else{
				$('#check').html('<h2 style=color:red>비밀번호가 불일치합니다.</h2>')
			}
		})
		
		//버튼안누르고 넘어갈때 사용되는 이벤트들
		$('#pw2').keyup(function() { //keyup: 키누르고 띄어쓸때/ 넘어갈때마다 ~> 버튼누를 필요없음
			pw1 = $('#pw1').val()
			pw2 = $('#pw2').val()
			
			if(pw1 == pw2){
				//$('#check').html('<h2 style=color:blue>비밀번호가 일치합니다.</h2>')
				$('#check').append('<h2 style=color:blue>비밀번호가 일치합니다.</h2>') //댓글할때 자식처럼 쌓이는거 DOM tree
			}else{
				//$('#check').html('<h2 style=color:red>비밀번호가 불일치합니다.</h2>')
				$('#check').append('<h2 style=color:red>비밀번호가 불일치합니다.</h2>')
			}
		})
		
		$('#add').click(function() {
			reply = $('#reply').val()
			$('#dat').append('-'+reply+'<br>') //div태그 안에 넣음 <br> 띄어쓰기
			$('#reply').val('')//한번 추가하고 공백으로 만들어줌
		})
		
		$('#ma').click(function() {
			$("#img").append("<br><img width=100 height=100 src='resources/img/ma.jpg'>")
		})
		
		$('#ma1').click(function() {
			$("#img").append("<br><img width=100 height=100 src='resources/img/ma1.jpg'>")
		})
	})
</script>
</head>
<body>
비밀번호: <input id = "pw1"><br>
비밀번호: <input id = "pw2"><br>
<button>확인</button>
<hr color="green" width="280px" align="left">
<div id = "check" style="color: black; background: pink; width: 280px"><h2>아직 체크 안했음.</h2></div>

<hr>
댓글: <input id='reply'><br>
<input type = "button" value = "댓글추가" id='add'>
<hr color="red" size = "5">
<div id='dat'></div>
<input id = "ma" value ='ma.jpg' type ='button' style='background:yellow; font-size:20px' >
<input id = "ma1" value ='ma1.jpg' type ='button'style='background:pink; font-size:20px'>
<div id='img'></div>
</body>
</html>