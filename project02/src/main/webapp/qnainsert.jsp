<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="qnainsert">
	<h2>문의하기</h2>
	<h5>궁금하신 점을 문의해주세요<br>문의내용과 답변은'1:1 문의내역'에서 확인하실 수 있습니다.</h5>
		문의 유형 : 
		<select>
			<option selected>선택</option>
			<option value="useage">일반문의</option>
			<option value="fakeroom">허위매물</option>
		</select><br>
		제목 : <input type="text" name="qtitle"><br>
		내용 : <textarea rows="12" cols="30" name="qcontents" placeholder="내용을 입력하세요."></textarea><br>
		<button type="submit" value="제출버튼">문의하기</button>
</form>
</body>
</html>