<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html><html><head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${!empty list }">
<ul>
<c:forEach var="student" items="${list}">
  <li><a href="/student_study/student/info.do?seq=${student.seq}">${student.seq}</a>-${student.name}-${student.school}
      -${student.birth}-${student.email}</li>
</c:forEach>
</ul>
</c:if>

</body>
</html>