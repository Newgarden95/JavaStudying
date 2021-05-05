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
google.charts.load('current', {packages: ['corechart', 'line']});
google.charts.setOnLoadCallback(drawBasic);

function drawBasic() {
      var data = new google.visualization.DataTable();
      data.addColumn('number', 'X');
      data.addColumn('number', '딩고뮤직');
      data.addRows([
    	  [2,1451094], [3, 636523], [12,1029282], [16, 358449], [18, 1182843],  [19, 736769], [23, 108130],[25,88000]]);

      var options = {
        hAxis: {
          title: '3월 딩고뮤직 조회수 추이'
        },
        vAxis: {
          title: '조회수'
        }
      };
      var chart = new google.visualization.LineChart(document.getElementById('chart_div'));
      chart.draw(data, options);
    }
</script>
</head>
<body>
	<div id="chart_div"></div>

</body>
</html>