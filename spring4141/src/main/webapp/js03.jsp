<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function web() {
	//Element(엘리먼트, 요소) => html문서의 주요 요소 = tag!
	site = document.getElementById('site').value
	if(site=='네이버'){
		location.href = 'http://www.naver.com/'
		
	}else if(site == '구글'){
		location.href = 'http://www.google.co.kr/'
		
	}else if(site == '다음'){
			location.href = 'http://www.daum.net/'
	}else{
		alert('해당하는 사이트가 없습니다.')
		location.href = 'js03.jsp'
	}
}
function pay() {
	//Element(엘리먼트, 요소) => html문서의 주요 요소 = tag!
	com = document.getElementById('com').value
	money = parseInt(document.getElementById('money').value)
	choice = document.getElementById('choice').value
	
	switch (choice) {
	case '1':
		result = document.getElementById('result') // result = div태그
		result.innerHTML = com+"에서 "+money+"원 계좌이체로 구매하셨습니다."
		break;
	case '2':
		result = document.getElementById('result')
		result.innerHTML = com+"에서 "+ (money+1000) +"원 신용카드로 구매하셨습니다."
		break;
	case '3':
		result = document.getElementById('result')
		result.innerHTML = com+"에서 "+ (money+500) +"원 휴대폰결제로 구매하셨습니다."
		break;
	default:
		break;
	}
}
</script>
</head>
<body>
사이트명 입력 : <input id = "site">
<button onclick="web()">사이트 이동 버튼</button><br>

<hr color = 'pink'>

구매상점: <input id = 'com' value ='더조은샵'><br>
결제금액: <input id = 'money' value = 10000><br>
입력수단 <select id = 'choice'>
<option value ='1'>1)계좌이체</option>
<option value ='2'>2)신용카드</option>
<option value ='3'>3)휴대폰결제</option>
</select>
<button onclick="pay()">결제하기</button>
<div id ='result' style = "background: pink; color: red; width: 400px" ></div>
</body>
</html>