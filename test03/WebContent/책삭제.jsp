<%@page import="pack03.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //삭제에 필요한 입력값인 title을 받아와 title이라는 새로운 변수에 넣어둔다.
    String title = request.getParameter("title");
    
    BookDAO db = new BookDAO();
    //데이터 삭제를 위한 메소드 실행
    db.delete(title);
    
    //데이터를 삭제후 delete.jsp페이지로 넘어간다
    response.sendRedirect("delete.jsp");
    
    %>