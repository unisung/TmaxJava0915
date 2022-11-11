<%@page import="vo.Customer"%>
<%@page import="dao.CustomerDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
  String id=request.getParameter("q");
  CustomerDAO dao=new CustomerDAO();
  Customer customer=dao.getInfo(id);
%>
<table border="1">
<tr>
<th>CustomerID</th><td><%=customer.getCustomerid()%></td>
</tr>
<tr>
<th>CompanyName</th><td><%=customer.getCompanyName()%></td>
</tr>
<tr>
<th>ContactName</th><td><%=customer.getContactName() %></td>
</tr>
<tr>
<th>Address</th><td><%=customer.getAddress() %></td>
</tr>
<tr>
<th>City</th><td><%=customer.getCity() %></td>
</tr>
<tr>
<th>PostalCode</th><td><%=customer.getPostcode() %></td>
</tr>
<tr>
<th>Country</th><td><%=customer.getCountry() %></td>
</tr>

</table>

</body>
</html>