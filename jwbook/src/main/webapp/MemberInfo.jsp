<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원정보</h2>
<ul>
<li>${mem.name}-${mem.email}</li>
<a href="/jwbook/member/list.do">리스트로 가기</a>
</ul>
</body>
</html>