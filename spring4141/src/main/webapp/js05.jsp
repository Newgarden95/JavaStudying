<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	/*         
	 1.자바 스크립트로 요일을 배열에 넣어서
	 2.전체 요일을 프린트  
	 3.만약, 목요일이면, '와 ~~내일 금요일이다.' 프린트
	 */

	/* 
		자바스크립트라는 언어는 변수에 값이 들어갈 떄 
		변수에 들어갈 데이터의 타입이 결정된다.
		=> 오토타입핑(auto-typing)
		<-> String[] week; 자바는 선언할 때 데이터 타입이 결정! 
	 */
	day = [ '월요일', '화요일', '수요일', '목요일', '금요일', '토요일', '일요일' ]
	alert(day)
	for (var i = 0; i < day.length; i++) {
		console.log(day[i])
		if (day[i] == '목요일') {
			console.log('와 ~~내일 금요일이다.')
		}
	}
</script>
</head>
<body>

</body>
</html>