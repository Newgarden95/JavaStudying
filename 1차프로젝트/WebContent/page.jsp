<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 이 페이지는 상품예약/장바구니담기를 위해 임의로 만든 페이지 입니다. -->
<!-- 최종에 사용안함 + pageA,B,C,D,E,F,G 도 사용안함-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 상세페이지를 들어가면 상품페이지 페이지주소를 리턴해줌  or 상품이름 -->
<!-- 상품을 누르면 상품페이지로 이동하지 않고 이동할 상품페이지의 주소와 상품이름을 arraylist_basket.jsp파일로 보내줍니다 -->
<!-- arraylist_basket.jsp파일에서는 이러한 방문한 페이지에 대해 세션을 통한 리스트 생성 -->
<form>
<input type = "hidden" name = "productpage" value = "pageA.jsp">
<button formaction="arraylist_basket.jsp">A상품</button>
</form>
<form>
<input type = "hidden" name = "productpage" value = "pageB.jsp"> 
<button formaction="arraylist_basket.jsp">B상품</button>
</form>
<form>
<input type = "hidden" name = "productpage" value = "pageC.jsp"> 
<button formaction="arraylist_basket.jsp">C상품</button>
</form>
<form>
<input type = "hidden" name = "productpage" value = "pageD.jsp"> 
<button formaction="arraylist_basket.jsp">D상품</button>
</form>
<form>
<input type = "hidden" name = "productpage" value = "pageE.jsp"> 
<button formaction="arraylist_basket.jsp">E상품</button>
</form>
<form>
<input type = "hidden" name = "productpage" value = "pageF.jsp"> 
<button formaction="arraylist_basket.jsp">F상품</button>
</form>
<form>
<input type = "hidden" name = "productpage" value = "pageG.jsp"> 
<button formaction="arraylist_basket.jsp">G상품</button>
</form>



</body>
</html>