<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- JQUERY 연습 -->
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 실행환경에 따라 화면규모  변경: 반응형 설정 -->
<title>jQuery UI Dialog - Default functionality</title>
<link rel="stylesheet"href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<!-- http, https 둘 중 아무거나-->
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<!-- 1번 -->
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<!-- 2번 -->
<script>
	//자바스크립트 : 웹브라우저(브라우저 내에서의 동적인 기능 수행을 위해 사용)
	//자바 : 서버(톰캣)
	//jquery 다운로드 ~> Download the uncompressed, development jQuery 3.6.0 우클릭 누르고 다른이름으로 저장 ~> webapp/resources/js안에 넣기 
					//or CDN사용 
	//$ = document.getEle~~ => $사인으로 문법을 간결하게 사용할 수 있음 => jquery라이브러리에 들어있음
	$(function() {// $표시 : 1번 ~> document.read()
		$("#dialog").dialog();//ui() 2번  => document.getElementById()    // # => id를 뜻하는 것
																					// . => class표현
																					// $('input') => 태그 표현
	});
</script>
<!-- 동기식(Synch)통신 : 요청순서에 따라 순차적으로 처리해서 다음페이지를 요청
  					=> 요청을 할 떄마다 페이지 전체 전환이 이루어짐(앞선 상황에서 무언가 눌렀을경우)
  					=> 페이지 확확바뀌면 동기
  					=> ex) a태그, location.hrfe
  					
  a.jsp			b.jsp			c.jsp
  뉴스클릭------카페클릭-----------카페화면
  
  비동기(asynch)통신 : 비순서대로 원할 떄 아무때나 다음 처리를 요청
  					=>요청할 때마다 페이지 전환이 이루어지게 하고 싶지 않을때(페이지 전환이 안되게 하고 싶을 때~> 예를들어 화면 필요없이 처리만 해줘야하는 경우)
  					=>(*)여러개 서버와 순서없이 통신하고있는경우(ex. 네이버 보면 미세먼지(기상청) , 환율(한국증권)) >>> 원할때!!!!!!!!!!!!!
  					=>페이지 변경없어야함
  					=> 나같은 경우 비동기요청 : 지도에 찍어주는 경우/ 같은페이지 내에서 일어나는일 ~> Ajax
   
   **브라우저에 보여줄 페이지를 만드는데 하나의 요청이 아닌경우가 있기 떄문
   	 브라우저가 비동기통신을 해야함
   	 
   	 자바스크립트로 구현
    Asyn JavaScript And XML(AJAX:에이작스~> 비동기통신/ 자바스크립트 기술중 하나) : 비동기통신할 때 데이터를 정확히 알려주는 태그를 붙여서 데이터를 받아옴(XML)
    <미세먼지>좋음</미세먼지> => XML 방식(태그를 통해 구분)
    http://rss.hankyung.com/ 신문기사를 xml파일로 제작되어있음
    
        미세먼지: 좋음(key: value) => JavaScripit Object Notation(자바스크립트에서 쓰던 데이터(Objec))를 나타내는 표기법
   			=> JSON 방식(key, value를 통해 구분)
   -->
</head>
<body>

	<div id="dialog" title="Basic dialog">
		<p>내가 떠요!</p>
	</div>


</body>
</html>