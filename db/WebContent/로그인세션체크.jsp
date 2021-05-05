<%@page import="database.Db"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 디비에 id,pw정보있는지 확인후 로그인 됐는지 안됐는지 보여줌 -->
<%
	//미리 객체를 생성해서 제공하고 있는 객체 : 빌트인 객체(내장된 객체)
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	Db db = new Db();
	boolean result = db.check(id, pw);//아이디 비밀번호 정확한지 체크해주는 메서드 활용
	
	
	
	//로그인이 성공을 한 경우, id를 사이트내 여러 페이지에서 쓸 수 있도록 설정
	//세션이 유지되는 동안 쓸 수 있도록 해야함
	//session.setAttribute("name", value); 이름을 계속 띄우고 싶으면 이거 이용
	if (result){
		session.setAttribute("id", id); //로그인 된동안 id계속 사용 가능하도록(true 인경우)
	}
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
로그인 결과는 <%=result %> <!-- <-- 표현식이라한다 -->
<a href="로그인세션.jsp">로그인 페이지로</a> <!-- 로그인 실패시 -->
</body>
</html>