<!-- beans.jsp -->
<%@page contentType="text/html; charset=EUC-KR"%>
<%request.setCharacterEncoding("EUC-KR");%>
<jsp:useBean id="bean" class="ch14.ELBean"/>
<jsp:setProperty property="siteName" name="bean"/>
사이트명 : <jsp:getProperty property="siteName" name="bean"/><br>
사이트명 : <%=bean.getSiteName()%><br>
사이트명 : ${bean.siteName}<br>
