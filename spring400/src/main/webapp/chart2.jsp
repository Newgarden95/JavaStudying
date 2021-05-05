<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
google.charts.load('current', {'packages':['bar']});
google.charts.setOnLoadCallback(drawChart);

function drawChart() {
  var data = google.visualization.arrayToDataTable([
    ['제목', '좋아요', '싫어요'],
    ['유퀴즈온더블럭', 350000, 1900],
    ['런닝맨', 16000, 338],
    ['아내의맛​ ', 10000, 959],
  ]);

  var options = {
    chart: {
      title: '유튜브 실시간인기동영상 TOP3',
      subtitle: '좋아요, 싫어요 비교',
    },
    bars: 'vertical' // Required for Material Bar Charts.
  };

  var chart = new google.charts.Bar(document.getElementById('barchart_material'));

  chart.draw(data, google.charts.Bar.convertOptions(options));
}
</script>
</head>
<body>
  <div id="barchart_material" style="width: 900px; height: 500px;"></div>
</body>
</html>