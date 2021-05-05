<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- 고객의 소리 수정 값 입력할 페이지! -->

<html>
<head>
<meta charset="UTF-8">
<title>고객의 소리 수정하기</title>
</head>
<body>
<form action="CsChangeSubmit.jsp">
<!-- 수정 내용을 입력하기! -->
게시글 번호 : <input name = "customer_no"><br>
종류 : <select name = "customer_type">
<option value = "좋아요">좋아요</option>
<option value = "나빠요">나빠요</option>
</select><br>
제목 : <input name = "customer_title"><br>
업소명 : <input name = "customer_accommodation_name"><br>
내용 : <br>
<textarea rows="10" cols="100" name="customer_content"></textarea><br>
평점 : <select name = "customer_grade">
<option value ="5">5</option>
<option value ="4">4</option>
<option value ="3">3</option>
<option value ="2">2</option>
<option value ="1">1</option>
</select>

<button>수정하기</button> <!-- 클릭으로 제출 디폴트값이 submit -->
</form>


</body>
</html>