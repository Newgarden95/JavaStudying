<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#a{
		float: left;
		margin: 100px, 0px, 0px, 100px;
	}
</style>
</head>
<body>
   <div id = "a" style="margin-right: 200px">
      <form action="select">
      	매물거래시 연락 가능한 번호를 입력해주세요(-생략)<br> 
      <!-- 입력한 번호값을 controller의 가상주소 select로 보내준다. -->
      <input name = "contact">
      <!-- 입력된 번호를 contact로 지정하여 받아줄때 사용한다. -->
      <button>방 내놓기</button>
      <!-- form 안에 있는 버튼은 default값이 submit이다. -->
      </form>
   </div>
</body>
</html>