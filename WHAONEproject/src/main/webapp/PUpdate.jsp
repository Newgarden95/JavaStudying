<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
	String pnum = request.getParameter("pnum");
	String pname = request.getParameter("pname");
	String ptype = request.getParameter("ptype");
	pageContext.setAttribute("ptype", ptype);
	String ctype = request.getParameter("ctype");
	pageContext.setAttribute("ctype", ctype);
	String price = request.getParameter("price");
	String address = request.getParameter("address");
	String address2 = request.getParameter("address2");
	String contact = request.getParameter("contact");
	String floor = request.getParameter("floor");
	String rsize = request.getParameter("rsize");
	String room = request.getParameter("room");
	String total = request.getParameter("total");
	String placetype = request.getParameter("placetype");
	pageContext.setAttribute("placetype", placetype);
	String roomimg = request.getParameter("roomimg");
	String pinfo = request.getParameter("pinfo");
	String dstatue = request.getParameter("dstatue");
	pageContext.setAttribute("dstatue", dstatue);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>매물 정보 수정 페이지</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script type="text/javascript">
	$(function() {
		$("#b1").click(function() {
			if (confirm("수정하시겠습니까 ?") == true) {
				var form = $("#form").serialize();
				$.ajax({
					url : "update",
					data : form,
					success : function() {
						alert("수정이 완료되었습니다.")

					}
				})
				
				location.href = "select?contact=" + $("input[name=contact]").val()
			}
		})
	})
		function execPostCode() {
         new daum.Postcode({
             oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
 
                // 도로명 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var fullRoadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 도로명 조합형 주소 변수
 
                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 도로명, 지번 조합형 주소가 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }
                // 도로명, 지번 주소의 유무에 따라 해당 조합형 주소를 추가한다.
                if(fullRoadAddr !== ''){
                    fullRoadAddr += extraRoadAddr;
                }
 
                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                // console.log(data.zonecode);
                console.log(fullRoadAddr);
                
                
                // $("[name=address]").val(data.zonecode);
                $("[name=address]").val(fullRoadAddr);
                
                /* document.getElementById('signUpUserPostNo').value = data.zonecode; //5자리 새우편번호 사용
                document.getElementById('signUpUserCompanyAddress').value = fullRoadAddr;
                document.getElementById('signUpUserCompanyAddressDetail').value = data.jibunAddress; */
            }
         }).open();
     }
</script>
</head>
<body>
	<h3>매물 정보 수정페이지 입니다.</h3>
	<hr color="gold">
	<form id="form">
		매물 번호 : <input name="pnum" value="<%=pnum%>" readonly><br>
		매물 이름 : <input name="pname" value="<%=pname%>"><br>
		매물 종류 : <select name="ptype">
					<option value="아파트" <c:if test="${ptype eq '아파트'}">selected="selected"</c:if>>아파트</option>
					<option value="오피스텔" <c:if test="${ptype eq '오피스텔'}">selected="selected"</c:if>>오피스텔</option>
					<option value="원룸" <c:if test="${ptype eq '원룸'}">selected="selected"</c:if>>원룸</option>
				</select><br>
		계약 종류 : <select name="ctype">
					<option value="매매" <c:if test="${ctype eq '매매'}">selected="selected"</c:if>>매매</option>
					<option value="전세" <c:if test="${ctype eq '전세'}">selected="selected"</c:if>>전세</option>
					<option value="월세" <c:if test="${ctype eq '월세'}">selected="selected"</c:if>>월세</option>
				</select><br>
		매물 가격 : <input name="price" value="<%=price%>"><br>
		매물 주소 : <button type="button" onclick="execPostCode();">주소검색하기</button><br>
		<input name="address" value="<%=address%>" readonly><br>
		<input name="address2" value="<%=address2%>"><br>
		연락처 : <input name="contact" value="<%=contact%>" readonly><br>
		층수(매물층/건물층) : <input name="floor" value="<%=floor%>"><br>
		크기(단위㎡) : <input name="rsize" value="<%=rsize%>"><br>
		방 갯수(방/화장실) : <input name="room" value="<%=room%>"><br>
		전체 세대수 : <input name="total" value="<%=total%>"><br>
		땡세권(택1) : <select name="placetype"> 
					<option value="역세권" <c:if test="${placetype eq '역세권'}">selected="selected"</c:if>>역세권</option>
					<option value="편세권" <c:if test="${placetype eq '편세권'}">selected="selected"</c:if>>편세권</option>
					<option value="학세권" <c:if test="${placetype eq '학세권'}">selected="selected"</c:if>>학세권</option>
					<option value="숲세권" <c:if test="${placetype eq '숲세권'}">selected="selected"</c:if>>숲세권</option>
					<option value="팍세권" <c:if test="${placetype eq '팍세권'}">selected="selected"</c:if>>팍세권</option>
					<option value="몰세권" <c:if test="${placetype eq '몰세권'}">selected="selected"</c:if>>몰세권</option>
					<option value="슬세권" <c:if test="${placetype eq '슬세권'}">selected="selected"</c:if>>슬세권</option>
					<option value="스세권" <c:if test="${placetype eq '스세권'}">selected="selected"</c:if>>스세권</option>
					<option value="맥세권" <c:if test="${placetype eq '맥세권'}">selected="selected"</c:if>>맥세권</option>
					<option value="도세권" <c:if test="${placetype eq '도세권'}">selected="selected"</c:if>>도세권</option>
				</select>
		<br>
		거래 상태 : <select name="dstatue">
			<option value="거래가능" <c:if test="${dstatue eq '거래가능'}">selected="selected"</c:if>>거래가능</option>
			<option value="협의중" <c:if test="${dstatue eq '협의중'}">selected="selected"</c:if>>협의중</option>
			<option value="계약완료" <c:if test="${dstatue eq '계약완료'}">selected="selected"</c:if>>계약완료</option>
		</select><br>
		매물 사진 : <input name="roomimg" value="<%=roomimg%>"><br>
		매물 상세정보<br>
		<textarea name="pinfo" rows="20" cols="100"><%=pinfo%></textarea>
		<br>
		<button type="button" id="b1">수정하기</button>
	<a href="select?contact=${contact}">
		<button type="button">돌아가기</button>
	</a>
	</form>
</body>
</html>