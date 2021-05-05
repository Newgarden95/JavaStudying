<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    
      //1. 앞페이지에서 넘어온 id/pw를 받아주어야 함.
     //MVC중 C(컨트롤)부분 
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    //2. 로그인 처리 -> 결과는 true/false
    //MVC중 M(모델) 부분
    boolean result = false; //로그인이 안되었을때
    if( id.equals("root")&&pw.equals("1234")){
    	result = true;
    }
    //3. 결과에 따라 클라이언트에게 보여주는 부분을 만든다.
    %>
    <!-- MVC중 V(뷰)부분 -->
    
    <!-- 위와 같은걸 스프링이 처리해줌 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if(result){
		out.print("로그인 성공");
	}else{
		out.print("로그인 실패");
	}
%>
</body>
</html>