<!-- scope3.jsp  -->
<%@ page language="java" contentType="text/html; charset=EUC-KR"%>

<%
	request.setCharacterEncoding("EUC-KR");
	session.setAttribute("id", "simba222");
	session.setMaxInactiveInterval(1*60);
	application.setAttribute("siteName", "google.com");
%>
id : ${sessionScope.id}<br>
siteName : ${applicationScope.siteName}<br>
sessionId : <%= session.getId()%>