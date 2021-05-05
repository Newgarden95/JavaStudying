<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script> <!-- 경로지정 중요!! 현재는 webapp에 있기 때문에 바로 resources로 접근 -->
																			<!-- 하지만 webapp/dataPractice에 넣어둔 경우 resources/...는 dataPractice폴더 안에 resources폴더에서 찾는걸 의미 -->
																			<!-- 따라서 사용할 경우 ../resources를 통해 폴더 밖으로 나와서 사용 -->
<script type="text/javascript">

	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url: "resources/data/dataset.xml",
				success: function(xml) {
					alert("XML연결 성공!!!!")
					list = $(xml).find('record') //받아온 xml파일에서 레코드를 찾아와 list에 담기!!
					console.log('레코드의 개수=> ' +list.length)
					console.log(list[0])
					/*
					console.log($(list[0]).find('id').text()) //0번째 인덱스에 들어있는 레코드 중 id에 해당 데이터 찍기(태그 벗겨서 안에 있는 것만 text로)
					console.log($(list[0]).find('first_name').text()) //0번째 인덱스에 들어있는 레코드 중 first_name에 해당 데이터 찍기(태그 벗겨서 안에 있는 것만 text로)
					console.log($(list[0]).find('last_name').text()) //0번째 인덱스에 들어있는 레코드 중 last_name에 해당 데이터 찍기(태그 벗겨서 안에 있는 것만 text로)
					console.log($(list[0]).find('email').text()) //0번째 인덱스에 들어있는 레코드 중 email에 해당 데이터 찍기(태그 벗겨서 안에 있는 것만 text로)
					console.log($(list[0]).find('gender').text()) //0번째 인덱스에 들어있는 레코드 중 gender에 해당 데이터 찍기(태그 벗겨서 안에 있는 것만 text로)
					console.log($(list[0]).find('phone').text()) //0번째 인덱스에 들어있는 레코드 중 phone에 해당 데이터 찍기(태그 벗겨서 안에 있는 것만 text로)
				*/
				/*
					//for문을 이용해서 전체 1000개를 프린트
					for (var i = 0; i < list.length; i++) {
						console.log($(list[i]).find('id').text()) //0번째 인덱스에 들어있는 레코드 중 id에 해당 데이터 찍기(태그 벗겨서 안에 있는 것만 text로)
						console.log($(list[i]).find('first_name').text()) //0번째 인덱스에 들어있는 레코드 중 first_name에 해당 데이터 찍기(태그 벗겨서 안에 있는 것만 text로)
						console.log($(list[i]).find('last_name').text()) //0번째 인덱스에 들어있는 레코드 중 last_name에 해당 데이터 찍기(태그 벗겨서 안에 있는 것만 text로)
						console.log($(list[i]).find('email').text()) //0번째 인덱스에 들어있는 레코드 중 email에 해당 데이터 찍기(태그 벗겨서 안에 있는 것만 text로)
						console.log($(list[i]).find('gender').text()) //0번째 인덱스에 들어있는 레코드 중 gender에 해당 데이터 찍기(태그 벗겨서 안에 있는 것만 text로)
						console.log($(list[i]).find('phone').text()) //0번째 인덱스에 들어있는 레코드 중 phone에 해당 데이터 찍기(태그 벗겨서 안에 있는 것만 text로)
					}*/
					
					//for-each활용
					$(list).each(function(index, record) {//리스트(변수: 변수의 경우 ''사용안함/태그나 아이디는 사용)를 하나씩 가져와서 func안에 동작수행 *현재는 record*
						//console.log(index + ":" +record) 	//record는 단순 레코드태그에 해당하는것을 반환 -> 따라서 안에있는 값을 보려면 find메서드 활용
						console.log(index + ":"+ $(record).find('id').text())
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