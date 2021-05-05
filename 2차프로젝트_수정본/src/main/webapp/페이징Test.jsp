<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Paging</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
			//ajax를 통해 게실물들 가져오기(리스트[등록번호, 가격, 사진, 매물 종류])
			$(function(){
				$.ajax({
					url: "resources/data/MOCK_DATA (2)7.json", //실험을 위해 생성해둔 파일(Json 타입)
					success: function(data) {
						console.log(data)
						var totalData = data.length; //전체 데이터
						var dataPerPage = 8; //한 페이지에 표현할 데이터
						var pageCount = 4; // 한 화면에 나타낼 페이지 수
						console.log(data.length)
						paging(totalData, dataPerPage, pageCount, 1); // 맨 처음 초기화면 생성
						
						function paging(totalData, dataPerPage, pageCount, currentPage) {
							console.log("currentPage : " + currentPage);

							var totalPage = Math.ceil(totalData / dataPerPage);
							console.log("totalPage: ", totalPage)
							var pageGroup = Math.ceil(currentPage / pageCount);
							console.log("pageGroup: ", pageGroup)
							console.log("pageGroup : " + pageGroup);
							var last = pageGroup * pageCount;
							console.log("last1 : " + last);
							if (last > totalPage)
								last = totalPage;
							var next = last + 1;
							var first = last - (pageCount - 1);
							var prev = first - 1;
							console.log("last : " + last);
							console.log("first : " + first);
							console.log("next : " + next);
							console.log("prev : " + prev);

							var html = ""; //페이징표시하기 위한 변수
							var list = ""; //상품정보를 표시하기 위한 변수
							
							if(totalPage <1){
								first = last;
							}
							
							if (prev > 0)
								html += "<a href='#' id= 'prev'><</a>";
								
							if(first < 0){
								for (var i = 1; i <= last; i++) {
									html += "<a href='#' id=" + i + ">" + i + "</a>";
								}
							}else{
								for (var i = first; i <= last; i++) {
									html += "<a href='#' id=" + i + ">" + i + "</a>";
								}
							}
								
							if (last < totalPage)
								html += "<a href='#' id= 'next'>></a>";
								
							//초기 상품정보 표시 
							list += "<table>"
							for (var i = 0; i < 8; i++) {//한 페이지에 표현할 정보가 8개로 설정했기 때문에 0~8까지 
								list += "<tr><td>" + data[i].id +"</td></tr>"
								list += "<tr><td>" + data[i].city+"</td></tr>"
							}
							list += "<table>"
							
							
							$('#list').html(list) // body부분에 id가 list인 div태그에 상품정보 표시한 걸 찍어주기
							$("#paging").html(html); //body부분에 id가 paging인 div태그에 페이징부분 표시해주기
							
							//패이징 css부분
							$("#paging a").css("color", "black");
							$("#paging a#" + currentPage).css({
								"text-decoration" : "none",
								"color" : "blue",
								"font-weight" : "bold"});
							
							//페이징 버튼을 누른 경우 실행해주는 부분
							$("#paging a").click(function() {
										console.log($(this))
										console.log($(this).attr("id"))
										console.log($(this).text())
										
										var list = ""; // 상품목록 초기화해주기 : 주석 처리시 맨 처음 화면의 상품리스트에 쌓이게됨(중복됨) 
													   //==>초기화를 해줘야지 클릭할 떄마다 상품초기화 되고 다시 쌓아주는 식
										var item = $(this); //$(this) : 이벤트(현재 클릭이벤트)가 발생한 요소들의 정보들  
															 //=> 현재 페이징을 눌렀을때 <a href='#' id=" + i + ">" + i + "</a> 이러한 태그의 요소들의 정보인 a(태그) #(주소) i(id정보) 가 출력됨
															 // 2번쨰 페이지를 누를 경우 결과로 a#2가 나온다.
										var id = item.attr("id"); //.attr : 요소 및 속성 가져오기 ~> 위에서 말한 a태그 #주소 i(id정보)중 id에 해당하는 것만 출력
										var selectedPage = item.text(); 
										
										if (id == 'next')
											selectedPage = next; //만약 next를 아이디로하는 a태그를 클릭(다음 페이지로 넘기기) selectedPage에 next번호가 들어간다
										if (id == 'prev')
											selectedPage = prev;

										paging(totalData, dataPerPage, pageCount, selectedPage);
										//상품목록을 찍어주기 위한 과정
										list += "<table>"
										//범위에 해당하는 데이터가 없는 경우 출력이 안됨!! ~> 조건을 통해서 수정하자!!
										for (var i = (selectedPage - 1) * dataPerPage; i < selectedPage * dataPerPage; i++) { //24 ~ 28
											if(data[i] != null){ //데이터가 있을 때만 해당 페이지에 출력해주기
											//***********************************************************************************************//
											//<a href = 'productdetail.jsp?Pnum='+data[i].pnum><img></a> ~> a태그에 주소를 상품의 id에 해당하는 값을넣어주자
											//넘어간 페이지(상품상세페이지)에서 request.getParameter를 통해 받아주고 그거에 해당하는 상품정보 출력
											list += "<tr><td>" + data[i].id+ "</td></tr>"
											list += "<tr><td>" + data[i].city+ "</td></tr>" 
											}
											else{
												list +="<tr><td><br></td></tr>"
												list +="<tr><td><br></td></tr>"
											}
										}
										list += "<table>"
										$('#list').html(list)
									})//클릭함수닫기
						}//paging함수닫기
					}//AJAX success닫기
				})//AJAX 닫기
	})//$(func) 닫기
</script>
</head>
<body>
	<div id = "list"></div>
	<div id="paging"></div>

</body>
</html>
