<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <%-- jstl : 자바문법을 jsp에서 태그로 쓸 수 있는 문법--%>
<c:forEach var = "x" items ="${fruit}"><!-- 테이블이면 테이블 만들어서 출력 -->
 - ${x} <br>
</c:forEach>
