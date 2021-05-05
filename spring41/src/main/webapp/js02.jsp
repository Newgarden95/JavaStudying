<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function plus(x, y) {
	x = parseInt(document.getElementById('num1').value)/* id를 통해 넘어온 값을 문자열로 추출하고 인트형으로 변환 */
													   //document.getElementById('ID값'): 태그 아이디속성값을 통해 해당id의 요소(태그)에 접근
													   //.value를 통해 값에 접근
	y = parseInt(document.getElementById('num2').value)
	sum = x+y
	alert(sum)
}

function img() {
	name = document.getElementById('imgName').value
	//result = document.getElementById('result') ~> <div>태그를 가져옴 만들어도되고 안만들어도 상관없음
	result.innerHTML = "<img src ='resources/img/"+name+".jpg'>"//네임.innerHTML: 특정html 태그안에 들어가는 태그를 설정할때 사용
																//네임을 통해 body태그 안에서 특정 태그안에 무언가 넣어줄 수 있다.
																//result는 div태그인데 이 안에 작성한 걸 넣겠다라는 뜻!!!
																//주로, div p태그 처럼 태그를 포함할 수 있는거에 넣어줌
}
</script>
</head>
<body>

<input type = "text" id = "num1" > <!-- num1이라는 아이디로 문자를 입력 -->
<input type = "text" id = "num2" >
<button onclick="plus()">계산</button><br>
==============================<br>
<input type = "text" id = "imgName">
<button onclick="img()">이미지</button>
<div id = "result" ></div><!-- div태그 안에 img태그를 포함시킨다. -->
</body>
</html>