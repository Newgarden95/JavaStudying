<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>마이 페이지</title>
		<link rel="stylesheet" type="text/css" href="style.css">
		<style type="text/css">
			.part { /* li태그에 대한 영역 */
				/* margin vs padding */
				/* margin: 바깥쪽 여백의 속성을 지정 => 쉽게 말해 박스와 박스 사이를 조절 위 오른쪽 아래 왼쪽 순으로 밀어주는 느낌 */
				/* padding: 안쪽 여백의 속성을 지정 */
				list-style: none;
				padding: 25px;
				background: #16b4f7; /* li 영역의 배경색 설정 */
				margin: 0px 40px 0px 0px;
				border-radius: 40px 80px; /* 각 li태그마다 둥글게 */
				text-align: center; /* 글씨를 중앙에 맞춤 */
			}
			
			.a {
				font-size: 20px;
			}
			
			#MyPagehr {
				margin: 0px 0px 5px 0px;
			}
			
			#MyPageleft { /* 왼쪽부분에 해당하는 화면 */
				float: left;
				width: 200px;
			}
			
			#MyPageright { /* 오른쪽부분에 해당하는 화면 */
				float: left;
				width: 700px;
				margin: 0px 0px 50px 0px;
			}
			
			#MyPagecenter { /* 내용이 들어갈 영역 */
				float: left;
				width: 700px;
				height: 450px;
				background: white;
			}
			
			#Reservationleft {
				float: left;
				width: 400px;
				height: 500px;
				background: #16b4f7;
				margin: 30px 5px 0px 90px;/*상위 박스에서 30px: Reservationleft의 박스를 위에서 30px 내리고 오른쪽에서 왼쪽으로 5px 이동 왼쪽에서 오른쪽으로 80px  */
			}
			
			#Reservationright {
				float: left;
				width: 400px;
				height: 500px;
				background: #16b4f7;
				margin: 30px 0px 0px 5px;
			}
			
			#leftbox {
				float: left;
				width: 300px;
				height: 300px;
				margin: 0px 0px 0px 10px;
				
			}
			
			#rightbox {
				float: left;
				width: 300px;
				height: 300px;
				margin: 0px 0px 0px 10px;
			}
		</style>
	</head>
	<body>
		<nav id = "myMain">
			<nav id = "MyTop">
				<jsp:include page="MyTop.jsp"></jsp:include>
			</nav>
	
			<nav id = "MyPageContent">
				<jsp:include page="MyPageContent.jsp"></jsp:include>
			</nav>
		</nav>
	
	</body>
</html>