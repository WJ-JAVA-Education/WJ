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
		String adminId;
		String adminPw;
		
		String imgDir;
		String testServerIP;
	%>
	
	<%
		adminId = config.getInitParameter("adminId");
		adminPw = config.getInitParameter("adminPw");
	%>
	
		<p>adminID : <%= adminId %></p>
		<p>adminPw : <%= adminPw %></p>
		
		<%
		imgDir = application.getInitParameter("imgDir");
		testServerIP = application.getInitParameter("testServerIP");
		%>
		
		<p> imgDir <%= imgDir %></p>
		<p> testServerIP <%= testServerIP %> </p>
		
		
		
</body>
</html>