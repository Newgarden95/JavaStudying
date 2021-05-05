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
		$.ajax({
			url: "datatojsp",
			success: function(result) {
				alert("보내기 성공")
				console.log(result)
				
			}
		})
	})
</script>
</head>
<body>

</body>
</html>