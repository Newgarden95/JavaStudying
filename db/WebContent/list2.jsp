<%@page import="database.Db"%>
<%@page import="com.mysql.fabric.xmlrpc.base.Member"%>
<%@page import="database.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1.member목록 다 가지고 오기 -->
    
    <%
    ArrayList<MemberVO> list = new ArrayList<MemberVO>();
    Db db = new Db();
    list = db.list();
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 자바부분은 닫아줘야함 34번째 줄은 html문이기 때문에 닫을 필요없고 또한 for문 안에 들어가야 하기 때문에 이런식으로 표현했음 -->
	<% MemberVO bag = new MemberVO(); 
	for( int i = 0; i<list.size(); i++){
    	bag = list.get(i);	
    %>
    
    <%=bag.getId() %>,<%=bag.getPw() %>,<%=bag.getName() %>,<%=bag.getTel() %><br>
   
    <% }%>
</body>
</html>