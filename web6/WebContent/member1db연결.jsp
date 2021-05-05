<%@page import="shop.MemberVO"%>
<%@page import="shop.MemberDB"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
        	//member.jsp에서 입력한 변수 받아서 사용하기 위해 변수에 설정
            String id = request.getParameter("id");
            String pw = request.getParameter("pw");
            String name = request.getParameter("name");
            String tel = request.getParameter("tel");
           
            //db.create(id, pw, name, tel); //VO활용
            //1. 가방을 만들어라
            MemberVO bag = new MemberVO();
          	//2. 가벙에 넣어라 => set메서드 이용!
            bag.setId(id);
            bag.setPw(pw);
            bag.setName(name);
            bag.setTel(tel);
            
            //db전담하는 부품에서 db에 넣어달라고 할 예정
            MemberDB db = new MemberDB();
            db.create(bag);
        %>
    
    
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>