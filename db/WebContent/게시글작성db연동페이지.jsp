<%@page import="java.sql.ResultSet"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="database.Db"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String id = request.getParameter("id");
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    String writer = request.getParameter("writer");
    
    Db db = new Db();
    int result = db.create(id, title, content, writer);
    //JOptionPane.showMessageDialog(null, result); //create의 반환값은 1임
    if (result != 1){
    	out.write("게시글 작성에 실패하셨습니다."); //브라우저에 띄울수 있도록 해주는 메소드
    }
    %>

    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=id %> 님의 게시글의 작성되었습니다.<br>

</body>
</html>