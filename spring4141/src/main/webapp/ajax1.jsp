<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src = "resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function() { //body 태그 안부터 ram에 읽어들여라!! ~> Dom Tree
		$("#b1").click(function() {
			alert('b1버튼을 클릭함')
			
			/* 
			Ajax(Asyn Javascript and XML): XML을 사용하는 자바스크립트에서 사용하는 비동기 통신
			XML(eXtensible Markup Languages) : 통신할 때 데이터를 교환할 표준으로 사용하기 위한 확장가능한 마크업 언어(태그를 마음대로 만들어서)
												통신 할때 요소를 보낼 때 그게 무엇인지를 설명하기 위해 <price>1000</price> 이런 식으로 보냄 ~> 태그를 붙여서 요소가 무엇인지 알려줌
												결국 태그안에 값을 추출해야하는 등 복잡함
												
			JSON(Javascript object notation) : 자바스크립트에서 교환할 대상(데이터)를 표현(표시)하는 방법
												{price:1000} ~> key : value ~> 키만 알면 바로바로 사용할 수 있어서 효율적
			*/
			//location.href = "http://www.naver.com" // 이건 동기식 바로 넘겨줌(페이지 이동) 순서대로 naver페이지를 호출하는 대표적인 방법
			
			//비동기할 경우 $.ajax()사용 ~> 사이트 요청/ html 요청(주소로 브라우저 요청) 순서고 뭐고 없음 아무때나 특정한 사이트 페이지를 호출하는 방법
			// $.ajax({json타입: 주소}) 만약 요청브라우저면 그냥 주소 view의 jsp파일이면 컨트롤러로 이동해서 
			$.ajax({ // {key : value}로 연결
				url: "test.jsp",//화면 넘어가는게 아니라 브라우저로 가져옴, 만약 컨트롤러면 컨트롤러로
				success: function(result) { //연결 되면 수행할 것들 result는 url연결 성공시 불러오는거 ~> 부분적으로 결과만 받아오면됨(페이지를 가져오는게 아니라 일부분 보여줌)
					alert('test페이지연결 성공!!!')
					alert('test.jsp의 결과는' + result)
				},
				error: function() {
					alert('연결 실패')
				}
			})
		})
		$("#b2").click(function() {
			$.ajax({
				url : "monday.jsp",
				success : function(result) {
					alert(result)
				},
				error : function() {
					alert('연결실패')
				}
			})
		})
		$("#b3").click(function() {
			$.ajax({
				url : "sunday",//views는 반드시 가상주소로
				success : function(result) {
					alert(result)
				},
				error : function() {
					alert('연결실패')
				}
			})
		})
	})
</script>
</head>
<body>
<button id = "b1">ajax테스트해보기</button><br> <!-- 버튼 눌렀을때 페이지 이동이 아닌 ajax사용 -->
<button id = "b2">monday.jsp를 ajax로 호출해서 "월요일이다."를 받아와보자.</button><br>
<button id = "b3">views아래에 있는 sunday.jsp를 ajax로 호출!!</button><br> <!-- views참조는 반드시 컨트롤러를 통해서 출력!! -->
</body>
</html>