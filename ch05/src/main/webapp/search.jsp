 <%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 디렉티브스(directives) -웹서버에 지시하는 명령문 -->    
<!DOCTYPE html><html><head>
<meta charset="UTF-8">
<title>검색요청 파라미터와 값 출력 </title>
</head>
<body>
<!-- 스크립틀릿(scriptlet) -->
<%
  String searchString = request.getParameter("q");
  out.print("검색어2: "+searchString+"<br>");
%>
<%  
  String searchString2 = request.getParameter("hl");
  out.print("검색어1: "+searchString2);
%>
</body>
</html>