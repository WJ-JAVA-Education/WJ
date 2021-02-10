<!-- fmt6.jsp  -->
<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<% request.setCharacterEncoding("EUC-KR"); %>  <!-- �ѱۺ�ȯ EUC-KR -->

	<!-- ��ġ ������ ���ִ� �±� -->
	<fmt:setLocale value="en_us" />
	
	<!-- fmt ������ ������´�  -->
	<fmt:setBundle basename="jstl.Intro" />
	
	<!-- ���� �ش� Ű���� �Է� -->
	<h2><fmt:message key="TITLE"/></h2>
	<p><fmt:message key="GREETING"/></p>
	<p><fmt:message key="BODY"/></p>
	<p><fmt:message key="COMPANY_NAME"/></p>
