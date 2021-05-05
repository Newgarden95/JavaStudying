<%@page import="database.BoardVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="database.Db"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 회원검색에서 전체자료 보려면 여기 실행 -->
    <%
    Db db = new Db();
    ArrayList<BoardVO> list = new ArrayList<>();
    list = db.list();
   
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	for(int i = 0; i<list.size(); i++){
		BoardVO bag1 = list.get(i);
	
%>
<%= bag1.getId() %>, <%=bag1.getTitle() %>, <%=bag1.getContent() %>, <%=bag1.getWriter() %><br>
<%
	}
%>
</body>
</html>