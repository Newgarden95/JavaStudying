<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <!-- Bootstrap core CSS -->
  <link href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">

  <!-- Custom fonts for this template -->
  <link href="resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="resources/vendor/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">
  <link href="resources/vendor/fontawesome-free/css/all.min.css/vendor/simple-line-icons/css/simple-line-icons.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">

  <!-- Custom styles for this template -->
  <link href="resources/css/landing-page.min.css" rel="stylesheet" type="text/css">
  <link href="resources/css/landing-page.css" rel="stylesheet" type="text/css">
  
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
$(function() {
	$('.del').click(function() {
		alert('삭제하시겠습니까?')
		$(this)
	})
})
</script>

</head>
<body>
  <!-- Navigation : 맨 위 메뉴바 부분/ 모든 페이지에 공통적으로 들어갈 부분(메뉴바)-->
  <nav class="navbar navbar-light bg-light static-top">
     <div class="logo">
     <a class="navbar-brand" href="main.jsp">내 집은 신촌에 있나방</a>
     </div>
    <div id="menu">
		 <!-- 세션처리 -->
		 <a class="btn btn-primary btn-lg" href="productSummary2.jsp">방찾기</a>
		 <a class="btn btn-primary btn-lg" href="#">마이페이지</a> <!-- href에 각자 만든 페이지 주소 넣어주기 -->
		 <a class="btn btn-primary btn-lg" href="#">방내놓기</a><!-- href에 각자 만든 페이지 주소 넣어주기 -->
		 <a class="btn btn-primary btn-lg" href="qnamain.jsp">고객센터</a><!-- href에 각자 만든 페이지 주소 넣어주기 -->
		 <a class="btn btn-primary btn-lg" href="ruser_update.jsp">회원정보수정</a><!-- href에 각자 만든 페이지 주소 넣어주기 -->
		 <a class="btn btn-primary btn-lg" href="ruser_delete.jsp">회원탈퇴</a><!-- href에 각자 만든 페이지 주소 넣어주기 -->
		<div class="btn btn-primary btn-lg">${userid}님 환영합니다.</div>
		<a class="btn btn-primary btn-lg" href="ruser_logout.jsp">로그아웃</a><!-- href에 각자 만든 페이지 주소 넣어주기 -->
    </div>
  </nav><!-- navigation 종료 -->
<!-- sql문으로 가져온 10개의 데이터를 for문을 돌려서 출력 -->
	<div>
			<h3>1:1 문의내역</h3>
			<ul id="notice">
				<li>최근 6개월 이내의 문의 내역을 확인하실 수 있습니다. (2021년 3월 이전에 문의하신 내용은 이메일로
					답변을 발송하여 본 페이지에서 내역 확인이 불가합니다.)</li>
				<li>문의하신 내용에 대한 수정 및 삭제는 답변 등록 이전에 가능합니다.</li>
				<li>고객센터 답변 가능 시간 : 평일 10:00~18:30 (토, 일요일, 공휴일 휴무)</li>
			</ul>
			<a href="qnainsert.jsp" id="qnainsert">1:1 문의하기</a> <br>
		</div>
<table>
	<tr>
		<th>유형</th>
		<th>제목</th>
		<th>날짜</th>
		<th>답변</th>
		<th>수정/삭제</th>
	</tr>
	<c:forEach var="vo" items="${idlist}">
	<tr>		
		<td>${vo.qtype}</td>
		<td>${vo.qtitle}</td>
		<td>${vo.qdate}</td>
		<td>${vo.reply}</td>
		<td>
		<% if(session.getAttribute("userid") == "admin"){ %>		
		<a href="reply.jsp?qid=${vo.qid}&qtype=${vo.qtype}&qtitle=${vo.qtitle}&qcontents=${vo.qcontents}&qdate=${vo.qdate}">답변</a>
		<a class="del" href="adelete?qid=${vo.qid}">삭제</a>
		<% }else{ %> 
		<a href="qnaupdate.jsp?qid=${vo.qid}&qtype=${vo.qtype}&qtitle=${vo.qtitle}&qdate=${vo.qdate}">수정</a>
		<a class="del" href="qdelete?qid=${vo.qid}">삭제</a>
		</td>
		<%} %>
	</tr>
	</c:forEach>
	<tr>
		<td>
	</tr>
</table>
<br>
<%-- <c:forEach var="vo" items="${list}">
    <span>유형 : ${vo.qtype}</span>
    <span>제목 : ${vo.qtitle}</span>
    <span>내용 : ${vo.qcontents}</span>
    <span>날짜 : ${vo.qdate}</span>
    <a href="qnaupdate.jsp?qid=${vo.qid}&qtype=${vo.qtype}&qtitle=${vo.qtitle}&qdate=${vo.qdate}">수정</a>
	<a class="del" href="delete?qid=${vo.qid}">삭제</a><br>
</c:forEach> --%>
</body>
</html>