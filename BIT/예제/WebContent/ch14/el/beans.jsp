<!-- beans.jsp -->
<%@page contentType="text/html; charset=EUC-KR"%>
<%request.setCharacterEncoding("EUC-KR");%>
<jsp:useBean id="bean" class="ch14.ELBean"/>
<jsp:setProperty property="siteName" name="bean"/>
����Ʈ�� : <jsp:getProperty property="siteName" name="bean"/><br>
����Ʈ�� : <%=bean.getSiteName()%><br>
����Ʈ�� : ${bean.siteName}<br>