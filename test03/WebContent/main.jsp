<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
	#form1{
	float: left;
	}
	#form2{
	float: left;
	margin: 48px 400px 0px 0px;
	
	}
	</style>
</head>
<body>
<h3>도서 관리 시스템</h3>
<hr color = "green">
	
	<!-- 입력데이터 보내기 -->
	<!-- 등록관련 부분 -->
	<form id = "form1" action="책등록.jsp" >  
		책 이름: <input type = "text" name = "title" required="required"><br>
		책 줄거리: <input type = "text" name = "story" required="required"><br>
		책 출판사: <input type = "text" name = "company" required="required"><br>
		<!-- 버튼을 누르면 form태그 안에 있는 입력값들이 각 name라는 이름을 갖고 넘어감(책등록.jsp) -->
		<button type = "submit"  >등록하기</button> 
	</form>
	
	<!-- 삭제관련 부분 -->
	<form  id = "form2" action="책삭제.jsp">
		삭제하고싶은 책 이름: <input type = "text" name = "title" required="required"><br>
		<!-- 버튼을 누르면 form태그 안에 있는 입력값들이 각 name라는 이름을 갖고 넘어감(책삭제.jsp) -->
		<button type = "submit" >삭제하기</button>
	</form>

</body>
</html>