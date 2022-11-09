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
<form method="post" 
	  action="/jwbook/pcontrol?action=update" >
<ul>
 <li><label>상품코드:</label><input name="id" value='${p.id}' readonly="readonly"></li>
 <li><label>상품명:</label><input name="name" value='${p.name}' autofocus="autofocus"></li>
 <li><label>제조사:</label><input name="maker" value='${p.maker}'></li>
 <li><label>가격:</label><input name="price" value='${p.price}'></li>
 <li><label>등록일:</label><input name="regdate" value='${p.regdate}' readonly="readonly"></li>
</ul>
<input type='submit' value="수정하기">
<input type='reset' value="초기화">
</form>
<div>
<a href='/jwbook/pcontrol?action=list'>리스트로 가기</a>
</div>
</body>
</html>