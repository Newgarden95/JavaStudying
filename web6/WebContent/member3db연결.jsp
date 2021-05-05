<%@page import="shop.Member3VO"%>
<%@page import="shop.MemberDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 각 기능을 수행하는 건 새로운 페이지에 작성하기 -->
     <%
     	//member.jsp에서 입력한 변수 받아서 사용하기 위해 변수에 설정
         String id = request.getParameter("id");
         String pw = request.getParameter("pw");
         String tel = request.getParameter("tel");
         
         Member3VO bag = new Member3VO();
         bag.setId(id);
         bag.setPw(pw);
         bag.setTel(tel);
         
         //db전담하는 부품에서 db에 넣어달라고 할 예정
         MemberDB db = new MemberDB();
         db.update(bag);
        
     %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보가 수정되었습니다.</title>
</head>
<body>
<%=id  %> 님의 패스워드가<%=pw %>, 전화번호가<%=tel %>로 변경되었습니다. 
</body>
</html>