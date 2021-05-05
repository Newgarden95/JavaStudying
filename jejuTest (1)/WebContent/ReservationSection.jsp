<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	
	
	
	
	
	
	
<nav id="Content">
	<div id="Reservationtop"></div>
	<div id="Reservationleft">
		<p class = "a">예약자정보</p>
		<div id="leftbox">
			사용자ID<br>
			로그인된 경우 자동으로 들어감<br><br>
			예약자 이름 <br>
			<input type="text"><br><br>
			예약자 전화번호
			<input type="tel"><br><br>
			예약일<br>
			<input type="date"><br><br>
			결제방식<br>
			<input type = "radio"  name ="pay">현장결제
			<input type = "radio"  name ="pay">카드결제<br>
			<input type = "radio"  name ="pay">계좌이체
			<input type = "radio"  name ="pay">휴대폰결제<br><br>
		</div>
	</div>
	<div id="Reservationright">
		<p class = "a">숙소정보/체크인아웃/가격</p>
		<br>
		<div id="rightbox">
		아래 이미지와 같도록 수정계획
		<img src="pictures/reservation.JPG" width="250" height="350" align="left">
		
		</div>
	</div>


</nav>