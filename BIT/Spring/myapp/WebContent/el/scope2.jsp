<!-- scope2.jsp  -->
<%@ page language="java" contentType="text/html; charset=EUC-KR" isELIgnored="true"	%>

<%
	request.setCharacterEncoding("EUC-KR");
	// jsp �������� page ������ pageContext
	pageContext.setAttribute("msg", "������ ��ſ� ȭ����");
%>

msg : ${msg} <br>
sum : ${requestScope.sum}<br>
sum " <%= request.getAttribute("sum") %>"<br>
