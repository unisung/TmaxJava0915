<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 정보</title>
</head>
<body>
<h2>상품정보 조회</h2>
<hr>
<ul>
 <li>상품코드:${p.id}</li>
 <li>상품명:${p.name}</li>
 <li>제조사:${p.maker}</li>
 <li>가격:${p.price}</li>
 <li>등록일:${p.regdate}</li>
</ul>
<div>
<a href='/jwbook/pcontrol?action=list'>리스트로 가기</a>
</div>
</body>
</html>