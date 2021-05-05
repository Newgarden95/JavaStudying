<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//BbsDAO dao = new BbsDAO();
	//BbsDAO dao1 = new BbsDAO();
	
	BbsDAO dao = BbsDAO.getInstance();
	BbsDAO dao1 = BbsDAO.getInstance();
	
	System.out.println(dao);
	System.out.println(dao1);
%>