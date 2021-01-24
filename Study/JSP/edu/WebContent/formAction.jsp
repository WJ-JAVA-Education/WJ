<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%!
		String p_name;
		String p_pass;
		String[] p_hobby;
	%>
	
	<%
	p_name = request.getParameter("p_name");
	p_pass = request.getParameter("p_pass");
	p_hobby = request.getParameterValues("p_hobby");
	%>
	
	p_name 	 : <%= p_name %> <br>
	p_pass   : <%= p_pass%> <br>
	p_hobby  : 
	<%
	for(int i=0 ; i < p_hobby.length ; i++){
	%>
	<%= p_hobby[i] %>
	<%} %><br>


</body>
</html>