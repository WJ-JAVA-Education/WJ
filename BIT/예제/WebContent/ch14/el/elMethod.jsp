<!-- elMethod.jsp -->
<%@page import="ch14.ELMethod"%>
<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib prefix="m" uri="/WEB-INF/tlds/Functions.tld"%>
<%
		int num = 123456789;
		pageContext.setAttribute("num", num);
%>
JSP��� : <%=ELMethod.comma(num)%><br>
TLD��� : ${m:comma(num)}