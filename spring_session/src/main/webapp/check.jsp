<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

	<%
		String id = request.getParameter("id");
		String[] mem = {"whaone2","kildong","maybe","coding","cool"};
		String result = "";
		for(int i = 0; i<mem.length; i++){
			if(mem[i].equals(id)){
				result = id;
				break;
			}else{
				result = "nothing_id";
			}
		}
	%><%=result%>
