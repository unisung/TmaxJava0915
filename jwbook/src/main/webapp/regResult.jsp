<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 현재페이제 맞도록 문자셋 설정 -->
<%-- script let(자바코드 영역) --%>
<% request.setCharacterEncoding("utf-8"); %>
<%-- expression(출력) --%>
<%=request.getParameter("name")%><br>
<%=request.getParameter("email") %><br>
<%=request.getRequestURL() %><br>
<%=request.getRequestURI() %><br>
<%=request.getScheme() %><br>
<%=request.getServerName() %><br>
<%=request.getServerPort() %><br>
<%=request.getContextPath() %><br>
<%=request.getMethod() %><br>
<%=request.isSecure()%><br>
<%=request.getLocale()%><br>
<%=request.getProtocol()%><br>
<%=request.getProtocol()%><br>
<%=request.getLocalAddr() %><br>
<%=request.getRemoteAddr() %><br>
</body>
</html>