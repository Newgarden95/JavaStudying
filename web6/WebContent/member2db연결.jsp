<%@page import="shop.ReadBag"%>
<%@page import="shop.MemberDB"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
        	//member.jsp에서 입력한 변수 받아서 사용하기 위해 변수에 설정
            String id = request.getParameter("id");

            
            //db전담하는 부품에서 db에 넣어달라고 할 예정
            MemberDB db = new MemberDB();
            
          	ReadBag bag = db.read(id);
        %>
    

     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
<!-- 가방에서 데이터 꺼내기 -->
검색된 id: <%=bag.getId2() %> 입니다.<br>
검색된 pw: <%=bag.getPw2() %> 입니다.<br>
검색된 name: <%=bag.getName2() %> 입니다.<br>
검색된 tel: <%=bag.getTel2() %> 입니다.<br>
</body>
</html>