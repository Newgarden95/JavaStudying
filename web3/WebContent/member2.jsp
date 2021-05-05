<%@page import="shop.DB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 입력한 값 서버에서 받아와야함 -->
<!-- 입력한 값  db처리전담하는 클래스한테 create! 하라고 명령해야함 -->
<!-- 회원가입처리 결과 알려줌. 클라이언트 : html -->
<%
	String id = request.getParameter("id");
String pw = request.getParameter("pw");
String name = request.getParameter("name");
String tel = request.getParameter("tel");
String company = request.getParameter("company");
String gender = request.getParameter("gender");
String word = request.getParameter("word");
String[] hobby = request.getParameterValues("hobby"); /* 서버에서 받아올 값이 여러개인 경우 get.ParameterValues 사용!!
												{"달리기","독서"} => 스트링 배열로 만들어줌*/

String result = ""; /* 입력된게 없으면 오류 발생  */
for (String x : hobby) {
	result = result + x + " ";
}
%>

<%
DB db = new DB(); /* DB자동완성 해줘야 import가능 */
db.create();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>당신의 회원정보를 확인해주세요.</h3>
	당신이 입력한 id: <%=id %><br> 
	당신이 입력한 pw:<%=pw %><br> 
	당신이 입력한 name: <%=name %><br> 
	당신이 입력한 tel: <%=company %> <%=tel %><br> 
	당신이 입력한 gender: <%=gender %><br> 
	당신이 입력한 word:<%=word %><br>
	당신이 입력한 hobby: <%=result %><br>
</body>
</html>