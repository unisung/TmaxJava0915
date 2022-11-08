<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html><html><head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>상세정보</h2>
${info.seq }<br>
${info.name }<br>
${info.school}<br>
${info.birth }<br>
${info.email }<br> 
<a href="/student_study/student/list.do">리스트로 이동하기</a>
</body>
</html>