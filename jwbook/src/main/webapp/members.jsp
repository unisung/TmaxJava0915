<%@page import="jwbook.model.Member"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html><html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>memberlist</h1>
<%
List<Member>mlist =(List<Member>)request.getAttribute("mlist");
%>
<% 
	for(Member m:mlist){
%>
<%=m.getName() %><%=m.getEmail() %><br>
<%} %>

<hr>
<% 
	for(Member m:mlist){
%>
${m}<br>
<%} %>


</body>
</html>