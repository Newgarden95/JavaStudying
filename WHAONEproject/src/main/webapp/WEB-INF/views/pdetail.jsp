<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>매물 상세 페이지</title>
</head>
<body>
	<h3>매물 상세 페이지</h3>
	<hr>
	<table>
		<tr>
			<td>등록번호</td>
			<td>매물 종류</td>
			<td>계약 종류</td>
			<td>매물 이름</td>
			<td>가격</td>
			<td>매물 주소</td>
			<td>상세 주소</td>
			<td>연락처</td>
			<td>층수(매물층/전체층)</td>
			<td>매물 크기</td>
			<td>방갯수(방/화장실)</td>
			<td>전체 세대수</td>
			<td>땡세권</td>
			<td>매물 사진</td>
			<td>매물 사진2</td>
			<td>매물 정보</td>
			<td>매물 진행 상태</td>
			<td>비고</td>
		</tr>
		<tr>
			<td>${productVO2.pnum}</td>
			<td>${productVO2.ptype}</td>
			<td>${productVO2.ctype}</td>
			<td>${productVO2.pname}</td>
			<td>${productVO2.price}</td>
			<td>${productVO2.address}</td>
			<td>${productVO2.address2}</td>
			<td>${productVO2.contact}</td>
			<td>${productVO2.floor}</td>
			<td>${productVO2.rsize}</td>
			<td>${productVO2.room}</td>
			<td>${productVO2.total}</td>
			<td>${productVO2.placetype}</td>
			<td><img src="resources/img/${productVO2.roomimg}"></td>
			<td><img src="resources/img/${productVO2.roomimg2}"></td>
			<td>${productVO2.pinfo}</td>
			<td>${productVO2.dstatue}</td>
			<td><button onclick="location.href='PUpdate2.jsp?pnum=${productVO2.pnum}&pname=${productVO2.pname}&ptype=${productVO2.ptype}&ctype=${productVO2.ctype}&price=${productVO2.price}&address=${productVO2.address}&address2=${productVO2.address2}&contact=${productVO2.contact}&floor=${productVO2.floor}&rsize=${productVO2.rsize}&room=${productVO2.room}&total=${productVO2.total}&placetype=${productVO2.placetype}&roomimg=${productVO2.roomimg}&pinfo=${productVO2.pinfo}&dstatue=${productVO2.dstatue}'">수정</button>
				<button onclick="location.href='PDelete2.jsp?pnum=${productVO2.pnum}&contact=${productVO2.contact}'">삭제</button></td>
		</tr>
	</table>
	<a href="select.mega?contact=${contact}">
		<button>돌아가기</button>
	</a>
</body>
</html>