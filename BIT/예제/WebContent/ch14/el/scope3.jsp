 <!-- scope2.jsp -->
<%@page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
		session.setAttribute("id", "simba222");
		application.setAttribute("siteName", "google.com");
%>
id : ${sessionScope.id}<br>
siteName : ${applicationScope.siteName}<br>