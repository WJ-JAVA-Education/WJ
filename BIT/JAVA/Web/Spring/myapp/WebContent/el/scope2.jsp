<!-- scope2.jsp  -->
<%@ page language="java" contentType="text/html; charset=EUC-KR" isELIgnored="true"	%>

<%
	request.setCharacterEncoding("EUC-KR");
	// jsp 문법에는 page 영역이 pageContext
	pageContext.setAttribute("msg", "오늘은 즐거운 화요일");
%>

msg : ${msg} <br>
sum : ${requestScope.sum}<br>
sum " <%= request.getAttribute("sum") %>"<br>
