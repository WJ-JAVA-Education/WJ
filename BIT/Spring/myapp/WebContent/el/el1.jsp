<%@ page language="java" contentType="text/html; charset=EUC-KR"
	isELIgnored="true"	%>
<%	request.setCharacterEncoding("EUC-KR");	
	// ����� : page < request < session < application
	request.setAttribute("siteName","JSPStudy.co.kr");
	
	
%>
����Ʈ�� : <%= request.getAttribute("siteName")%><br>
����Ʈ�� : ${siteName}