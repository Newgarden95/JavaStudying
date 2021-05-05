<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
      num2 = ""
   $(function() {
      $('#b2').click(function() {
         $.ajax({
            url: 'money.jsp',
            data: {// 입력값을 받아주는 역할 data
               money: $('#money').val(), // 입력한 금액의 data값을 받아온다.
               choice: $('#choice').val()
            },
            success: function(result) {
               alert('연결 성공' + result) // money에 있는 result를 가져와서 출력
            }
         })
      })
      $('#b3').click(function() {
         //$.ajax()
      })
      $('#b4').click(function() {
         $.ajax({
            url: "tel.jsp", // 이동경로
            data: {
               tel: $("#tel").val() // data 가져오기
            },
            success: function(result) {
            num2 = result // 다음에 사용하기 때문에 변수로 넣어 놓기
            $("div").html(result)
         } 
         })
      })
      $('#b5').click(function() {
         num = $("#num").val()
         if (num == num2) {
         $("div").html("인증성공")
      }else{
         $("div").html("인증실패")
      }
      })
   })
</script>
</head>
<body>
결제금액: <input id="money"><br>
결제수단: 1)계좌이체, 2)신용카드, 3)휴대폰결제 <input id="choice">
<button id="b2">결제하기(money.jsp)</button>
<hr color="red">
회원가입할 id입력: <input id="id">
<button id="b3">ID중복 체크(check.jsp)</button>
<hr color="red">
인증받을 전화번호 입력: <input id="tel">
<button id="b4">인증 번호 받기(tel.jsp)</button><br>
인증받은 숫자입력: <input id="num">
<button id="b5">인증 번호 확인</button>
<div id="div"></div>
</body>
</html>