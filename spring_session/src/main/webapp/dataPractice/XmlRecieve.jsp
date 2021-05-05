<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../resources/js/jquery-3.6.0.js"></script> <!-- 경로설정시 상대경로: ../ -->
<script type="text/javascript">

	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url: "../resources/data/dataset.xml",//경로설정시 상대경로: ../
				success: function(xml) {
					alert("XML연결 성공!!!!")
					list = $(xml).find('record') //받아온 xml파일에서 레코드를 찾아와 list에 담기!!
					console.log('레코드의 개수=> ' +list.length)
					console.log(list[0])
					console.log($(list[0]).find('id').text()) //0번째 인덱스에 들어있는 레코드 중 id에 해당 데이터 찍기(태그 벗겨서 안에 있는 것만 text로)
					console.log($(list[0]).find('first_name').text()) //0번째 인덱스에 들어있는 레코드 중 first_name에 해당 데이터 찍기(태그 벗겨서 안에 있는 것만 text로)
					console.log($(list[0]).find('last_name').text()) //0번째 인덱스에 들어있는 레코드 중 last_name에 해당 데이터 찍기(태그 벗겨서 안에 있는 것만 text로)
					console.log($(list[0]).find('email').text()) //0번째 인덱스에 들어있는 레코드 중 email에 해당 데이터 찍기(태그 벗겨서 안에 있는 것만 text로)
					console.log($(list[0]).find('gender').text()) //0번째 인덱스에 들어있는 레코드 중 gender에 해당 데이터 찍기(태그 벗겨서 안에 있는 것만 text로)
					console.log($(list[0]).find('phone').text()) //0번째 인덱스에 들어있는 레코드 중 phone에 해당 데이터 찍기(태그 벗겨서 안에 있는 것만 text로)
				}
			})
		})
		/*  
		JSON파일을 서버로 넘겨서 DB에 담기!! 
		서버와의 통신을 계속할수 있음($.ajax를 계속 사용해서)
		*/
	$('#b2').click(function() {
			$.ajax({
				url : "../resources/data/MOCK_DATA.json",//경로설정시 상대경로: ../
				success : function(json) {
					alert("json연결 성공")
					$(json).each(function(index, person) {
						id = person.id
						first_name = person.first_name
						last_name = person.last_name
						email = person.email
						gender = person.gender
						phone = person.phone
						
						console.log(id, first_name, last_name, email, gender, phone)
						
						$.ajax({ //서버로 비동기연결
							url : "../insertperson", //가상주소 연결
							data : {
								id : person.id,
								first_name : person.first_name,
								last_name : person.last_name,
								email : person.email,
								gender : person.gender,
								phone : person.phone
							},
							success: function() {
								console.log('oracle에 넣기 성공')
							}
						})
					})
				}
			})
		})
	})
</script>
</head>
<body>
<button id = "b1">XML문서 받아오기</button>
<button id = "b2">JSON문서 받아오기</button>
</body>
</html>