<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src = "resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {/* b1버튼이 클릭됐을때 수행해라 */
			d1 = $('#a').val()
			d2 = $('#b').val()
			alert(d1+"하고 "+d2+"할것이다.")
		})
		
		$('#b2').click(function() {
			d3 = $('#c').val()
			$('div').html('오늘 저녁은 '+d3)
		})
	})
</script>
</head>
<body>
<input id = "a"><br>
<input id = "b">
<button id ="b1">뭐할꺼니??</button>
<hr color="green" size="2px" align="left" width="270px">
<input id = "c" value="강남으로!">
<button id ="b2">어디로 갈꺼니?</button>
<div></div>
</body>
</html>