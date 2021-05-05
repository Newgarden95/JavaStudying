<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<table border = "1">
   <tr>
      <td style="background:pink; font-size: 20px; width: 150px; height: 50px;">컴퓨터 가격</td>
      <td style="background:pink; font-size: 20px; width: 150px; height: 50px;">${vo.com}원</td>
   </tr>
   <tr>
      <td style="background:blue; font-size: 20px; width: 150px; height: 50px;">컴퓨터 종류</td>
      <td style="background:blue; font-size: 20px; width: 150px; height: 50px;">${vo.comType}</td>
   </tr>
   <tr>
      <td style="background:pink; font-size: 20px; width: 150px; height: 50px;">마우스 가격</td>
      <td style="background:pink; font-size: 20px; width: 150px; height: 50px;">${vo.mouse}원</td>
   </tr>
   <tr>
      <td style="background:blue; font-size: 20px; width: 150px; height: 50px;">마우스 종류</td>
      <td style="background:blue; font-size: 20px; width: 150px; height: 50px;">${vo.mouseType}</td>
   </tr>
   <tr>
   	<td colspan ="2" style = "text-align:center; background:pink; font-size:20px; width: 300px; height;50px;">총 가격: ${vo.total}</td>
   </tr>
</table>
