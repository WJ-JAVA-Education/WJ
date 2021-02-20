<%@page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
%>
 - 서버 : <%=application.getServerInfo() %> <br>
 - 서블릿 : <%= application.getMajorVersion() %>.<%= application.getMinorVersion() %><br>
 - JSP : <%= JspFactory.getDefaultFactory().getEngineInfo().getSpecificationVersion() %> <br>

