<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/student_study/student/insert.do">
 <label>이름</label><input name="username"><br>
 <label>학교</label><input name="school"><br>
 <label>생년월일</label><input type="date" name="birth"><br>
 <label>이메일</label><input name="email" type="email"><br>
<input type="submit">
</form>

</body>
</html>