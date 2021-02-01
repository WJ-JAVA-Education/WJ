<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>뀨뀨</title>
</head>
<body>

	<%!
		int num = 10;
		String str ="jsp";
		ArrayList<String>list = new ArrayList<String>();
		
		public void jspMethod(){
			System.out.println("뀨뀨");
		}
	
	%> 
	 <!-- HTML주석 -->
 	<%-- JSP 식 주석 --%>
	 <%
	 	if(num > 0){
	 %>
	 <p> num > 0 </p>
	 <%
	 	}else{
	 %>
	 <p> num<0 </p>
	 <%} %>
 	 	
 		num is <%= num %>
 
</body>
</html>