<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html><html><head>
<meta charset="UTF-8">
<title>주문내역</title>
</head>
<body>
<%
   String id = request.getParameter("id");
   String pwd = request.getParameter("pwd");
   String url = request.getParameter("url");
   String email = request.getParameter("email");
   String tel = request.getParameter("tel");
   String[] gubuns = request.getParameterValues("gubun");
   String pack = request.getParameter("pack");
   
   pageContext.setAttribute("id", id);
%>
<%
	out.println("id:"+id+"<br>");
	out.println("pwd:"+pwd+"<br>");
	out.println("url:"+url+"<br>");
	out.println("email:"+email+"<br>");
	out.println("tel:"+tel+"<br>");
	out.print("선물종류:");
    for(int i=0;i<gubuns.length;i++){
    	if(i <(gubuns.length-1)){
         out.print(gubuns[i]+",");
    	}else
        out.print(gubuns[i]+"<br>");	
    }
    out.print(Arrays.toString(gubuns)+"<br>");
    
	out.println("선물포장여부:"+pack);
%>
</body>
</html>