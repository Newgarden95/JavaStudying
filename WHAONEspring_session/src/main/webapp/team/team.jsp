<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url:"../resources/data/dataset (1).xml",
				success: function(xml) {
					alert("성공")
					list = $(xml).find('record') //수행결과에서 'record'라고 명시된 부분을 찾아서 list에 담기
					console.log(list.length)
					console.log(list)
					console.log(list[0])
					
					$(list).each(function(index, product) { //리스트에 있는 레코드를 하나씩 불러오기
						console.log(parseInt(index)+1 + ":"+ $(product).find('pnum').text()) //index는 문자열 -> 정수형으로 변환 , 레코드안에있는 pnum태그에서 데이터 추출
						console.log(parseInt(index)+1 + ":"+ $(product).find('pname').text())//레코드안에있는 pname태그에서 데이터 추출
						console.log(parseInt(index)+1 + ":"+ $(product).find('cname').text())//레코드안에있는 cname태그에서 데이터 추출
						console.log(parseInt(index)+1 + ":"+ $(product).find('fname').text())//레코드안에있는 fname태그에서 데이터 추출                         
						console.log(parseInt(index)+1 + ":"+ $(product).find('lname').text())//레코드안에있는 lname태그에서 데이터 추출
						console.log(parseInt(index)+1 + ":"+ $(product).find('phone').text())//레코드안에있는 phone태그에서 데이터 추출
					})
				}
			})
		})
		
		$("#b2").click(function() {
			$.ajax({
				url: "../resources/data/MOCK_DATA (1).json",
				success: function(json) {
					//jason.items를 사용하는 경우는 배열형태의 파일이 아닌 JSON형태의 데이터인경우 key
					//현재 mock데이터는 배열형태로 넘어오기 때문에 편한데 일반적으로 key, value로 넘어와서 
					//json //추출한 json파일 전체 리스트(배열)를 넘겨줌 json은 자체가 배열임
					alert("리스트 길이 "+json.length)
					alert(json[0].pnum)// json은 자체가 배열이기 때문에 -> json[0] : {"id":1,"first_name":"Gunter","last_name":"Railton","email":"grailton0@booking.com","gender":"Male","phone":"368-246-8635"}
					console.log(json)
					$(json).each(function(index, product) { // $(json).each -> 레코드한줄 추출한다는뜻 -> product에 담음  *product는 꺼내서 넣어둘 변수임 아무거나 설정해도됨
															// each 함수 반드시 파라메터 2개 넣어야 돌아감!!
						//추출한거 변수에 담기
						pnum = product.pnum
						pname = product.pname
						cname = product.cname
						fname = product.fname
						lname = product.lname
						phone = product.phone
						
						console.log(pnum, pname, cname, fname, lname, phone)
						
					})
				}
			})
		})
	})
</script>
</head>
<body>
<button id = "b1">xml파일 확인</button>
<button id = "b2">json파일 확인</button>

</body>
</html>