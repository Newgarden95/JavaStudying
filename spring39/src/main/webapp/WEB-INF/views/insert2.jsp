<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	게시판 글작성이 완료되었습니다.
	
	<hr color = "gold">
	
	<!-- model.getAttribute("bbsVO").getID() 표현식 표현-->
	등록된 ID: ${bbsVO.id}<!-- 표현언어(Expression Language: EL) : 속성으로 지정할때만 EL사용 가능(언제? session, model) 변수로 접근하는게 아니라 getmethod로 접근-->			
	등록된 TITLE: %{bbsVO.title}			
	등록된 CONTENT: %{bbsVO.content}			
	등록된 WRITE: %{bbsVO.writer}			
	<hr color = "gold">
	
	<!-- 브라우저에서 요청할 수 있는 페이지만 들어갈 수 있음 ~> webapp아래 파일만 -->
	<a href="insert2.jsp">글작성페이지</a>
	
</body>
</html>