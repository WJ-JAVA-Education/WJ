<!-- fmt6.jsp  -->
<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<% request.setCharacterEncoding("EUC-KR"); %>  <!-- 한글변환 EUC-KR -->

	<!-- 위치 지정을 해주는 태그 -->
	<fmt:setLocale value="en_us" />
	
	<!-- fmt 번들을 가지고온다  -->
	<fmt:setBundle basename="jstl.Intro" />
	
	<!-- 번들 해당 키값을 입력 -->
	<h2><fmt:message key="TITLE"/></h2>
	<p><fmt:message key="GREETING"/></p>
	<p><fmt:message key="BODY"/></p>
	<p><fmt:message key="COMPANY_NAME"/></p>
