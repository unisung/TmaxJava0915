<%@page import="jwbook.Todo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>todolist페이지</h1>
<%
List<Todo> todoList  = (List<Todo>)request.getAttribute("todolist");
for(int i=0;i<todoList.size();i++){
	Todo todo = todoList.get(i); %>
	<!-- expression(표현식) -->
	<%=todo.getTno()+", "%>
	<%=todo.getTitle()+", "%>
	<%=todo.getTodoContent()+", "%>
	<%=todo.getDueDate()+", "%>
	<%=todo.getEndDate()+""%><br>
<%}
%>
</body>
</html>