<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><!-- 서버에게(톰캣) 알려주는 것 -->
    
    
<!-- 서버에서 실행되는 코드가 필요 -->
<!-- 클라이언트가 입력한 정보(요청)를 받아주는 코드(처리) 
<!-- 다 처리한후 웹페이지(브라우저)로 보내주기 위해 서버에서 클라이언트에게 html보내줌(처리 결과를 보내주기 위해서jsp파일 키면 아래와 같이 html코드가 있는거임) -->    
    <!-- 자바태그는 이거 활용 -->
    <%
    //클라이언트가 입력한 정보를 서버에서 받아주는 클래스 필요
    String id = request.getParameter("id"); //브라우저에서 입력된 name = "id" 인거 받아옴
    String pw = request.getParameter("pw"); 
    String name = request.getParameter("name"); 
    String tel = request.getParameter("tel"); 
    
    /* db에 넣을 수 있는 부품을 만들어서 데이터를 주어서 넣으라고 하는 처리를 한다.*/
    %>
    
    
    
    
    
    
<!-- 서버에서 실행안됨, html은 요청한 처리 결과를 클라이언트에게 알려주기 위한 html 화면  => html부분이 클라이언트로 전송되고 끝남  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원가입이 잘 되었습니다.</h3>
<hr>
당신이 입력한 id: <%= id %><br> <!-- 옆에 있는 키워드: id라는 변수를 보여라 라는 의미 -->
당신이 입력한 pw: <%= pw %><br>
당신이 입력한 name: <%= name %><br>
당신이 입력한 tel: <%= tel %><br>
<a href = "member.html">
회원가입화면으로 
</a>
</body>
</html>