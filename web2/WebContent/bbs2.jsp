<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String id = request.getParameter("id");
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    String writer = request.getParameter("writer");
    
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 화면으로 돌아가기</title>
</head>
<body>
입력된 ID: <%=id %><br>
입력된 title: <%=title %><br>
입력된 content: <%=content %><br>
입력된 writer: <%=writer %><br>

<a href = "bbs.html">메인 화면으로 돌아가기</a>
</body>
</html>