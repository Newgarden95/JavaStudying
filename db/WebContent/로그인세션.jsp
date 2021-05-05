<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>로그인해보자</h3>
	<!-- null의 의미는 id이름으로 세션 설정된 것이 없다라는 의미!! => 로그인이 안됨 => 로그인 화면 보여주기 -->
	<% if(session.getAttribute("id") == null) {%> 
		<form action="로그인세션체크.jsp">
			아이디 : <input name="id"><br> 
			패스워드 : <input name="pw"><br>
			<button type="submit">로그인</button>
		</form>
	
	<%}else{ %> <!-- 로그인 된상태  ~> session이 null이 아닐때-->
		<%= session.getAttribute("id") %> 님 환영합니다. <!-- 저 표현식을 values로 보내서 사용해보자 -->
		 
		<a href = "게시글작성.jsp">
			<button type = "button">게시판 글쓰기</button> <!-- type button하는 이유는 button 안넣으면 디폴트가 submit인데 이건 form 안에 있는걸 다 전송한다는 의미 -->
		</a>
		<a href = "로그아웃.jsp">
			<button type = "button">로그아웃</button> 
		</a><!-- 이부분에 이제 로그인후 화면페이지로 넘겨 -->
		<%} %>
</body>
</html>