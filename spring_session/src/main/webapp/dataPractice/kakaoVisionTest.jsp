<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- kakao vision API실습 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
   $(function() {
      $('#b1').click(function() {
         $.ajax({
            type: 'POST',
            beforeSend : function(xhr){//-h에 해당하는거 넣어주기
                  xhr.setRequestHeader("Authorization", "KakaoAK 2ebf137386d215f182afe9b7d8427b80"); //REST API(간단한 주소방식)키값 넣어야함
                  xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
              },
            url: "https://dapi.kakao.com/v2/vision/product/detect", //제공하는 API URL( Sampel request에 있는 curl 부분)
            data: {// -d에 해당하는거 넣어주기
               image_url: "https://img.sbs.co.kr/newsnet/etv/upload/2021/02/02/30000667769_700.jpg",
            },
            success: function(x) {
               alert('kakao 물건인식 연결 성공.!!! ' )
               console.log("=======================================")
               
               list = x.result.objects //x.result.objects는 배열형태
               items = []
				$(list).each(function(index,item) { //for-each를 돌리기위해서는 배열의 형태여야함 x로 돌릴경우 x는 하나의 문서라 for문돌릴수 없음
					items.push(item.class)
					console.log(item.class)
			
				})
            } //success
         }) //ajax
      })//b1
      
      $('#b2').click(function() {
          $.ajax({
             type: 'POST',
             beforeSend : function(xhr){
                   xhr.setRequestHeader("Authorization", "KakaoAK 2ebf137386d215f182afe9b7d8427b80"); //REST API(간단한 주소방식)키값 넣어야함
                   xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
               },
             url: "https://dapi.kakao.com/v2/vision/thumbnail/crop", //제공하는 API URL( Sampel request에 있는 curl 부분)
             data: {
                "image_url": "https://img.sbs.co.kr/newsnet/etv/upload/2021/02/02/30000667769_700.jpg",
                width : 200,
                height : 200
             },
             success: function(x) {
            	 	console.log(x.thumbnail_image_url)
					alert(x.thumbnail_image_url)
                }
          }) //ajax
       })//b1
       
       $('#b3').click(function() {
           $.ajax({
              type: 'POST',
              beforeSend : function(xhr){ //AJAX통신시 사용 : XHR = XML Http Request HTTP 요청 전에 발생하는 이벤트 핸들러
                    xhr.setRequestHeader("Authorization", "KakaoAK 2ebf137386d215f182afe9b7d8427b80"); //REST API(간단한 주소방식)키값 넣어야함
                    xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
                },
              url: "https://dapi.kakao.com/v2/vision/face/detect", //제공하는 API URL( Sampel request에 있는 curl 부분)
              data : {
                 image_url : "https://img.sbs.co.kr/newsnet/etv/upload/2021/02/02/30000667769_700.jpg"
              },
              success: function(json) {
            	  console.log("========================")
            	  console.log(json.result.faces[0].facial_attributes.age)
            	  alert(Math.ceil(json.result.faces[0].facial_attributes.age))//Math.ceil ~> JS에서 소수점 버리고 정수만
                 }
           }) //ajax
        })//b1
   })//$fun
</script>
</head>
<body>
<button id="b1">카카오물건인식API</button>
<button id="b2">카카오썸네일생성API</button>
<button id="b3">카카오얼굴검출API</button>
</body>
</html>