<%@page contentType="text/html; charset=EUC-KR"%>
<%
		session.invalidate();
		response.sendRedirect("scopeBean.jsp");
%>		