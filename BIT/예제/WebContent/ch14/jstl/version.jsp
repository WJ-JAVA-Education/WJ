<%@page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
%>
 - ���� : <%=application.getServerInfo() %> <br>
 - ���� : <%= application.getMajorVersion() %>.<%= application.getMinorVersion() %><br>
 - JSP : <%= JspFactory.getDefaultFactory().getEngineInfo().getSpecificationVersion() %> <br>

