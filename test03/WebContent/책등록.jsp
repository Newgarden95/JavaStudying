<%@page import="pack03.BookDAO"%>
<%@page import="pack03.BookVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
   	/* main페이지에서 입력받아서 넘어온 값들을 각 변수에 넣어준다. */
    String id = null;
    String title = request.getParameter("title");
    String story = request.getParameter("story");
    String company = request.getParameter("company");
    
    //받아온 변수들을 db로 보내기 위해 VO에 넣어 준다.
    BookVO bag = new BookVO();
    bag.setId(id);
    bag.setTitle(title);
    bag.setStory(story);
    bag.setCompany(company);
    
    //디비 선언&생성
    BookDAO db = new BookDAO();
    //가방에 다 넣어둔 가방을 insert기능을 하는 메소드로 보내준다.
    db.insert(bag);
    
    //위에 입력과정을 수행한후 insert.jsp화면으로 이동
    response.sendRedirect("insert.jsp");
    
    %>