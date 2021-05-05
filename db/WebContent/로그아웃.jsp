<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
//질문하기 오류남!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//설정된 여러 세션값들 중 하나만 제거하는 경우
//session.removeAttribute("id");
//세션 자체를 끊어버리는 경우
	session.invalidate(); // => 세션끊기고 어디로 가야할까?

//서버가 브라우저에 무언가를 명령할 때 사용하는 내장객체
//1) 쿠키 심을 때, 2) 특정한 페이지를 요청하라고 할 때
//request는 서버가 받을떄 response는 서버가 브라우저로 넘겨줄때
	response.sendRedirect("로그인세션.jsp"); // =>로그아웃되고 로그인세션.jsp로 넘어감
%>
