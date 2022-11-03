<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html><html><head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 스크립틀릿 -->
<%
   int a=10;
   int b=20;
   int result = sum(a,b); 
%>
<!-- expression  -->
<%=result %><br>
<%=number+10 %><br>
<!-- 선언(declaration) 변수나 메소드를 선언하는 영역 -->
<%!
  int number =10;
public int sum(int a, int b){
	return a+b;
}
%>
</body>
</html>