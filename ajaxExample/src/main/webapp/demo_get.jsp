<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="plain/text; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<p>This content was requested using the <%=request.getMethod() %> method.<br>


<p>Requested at: <%=LocalDateTime.now() %>

<p>랜덤숫자: <%=request.getParameter("t") %>
</body>
</html>