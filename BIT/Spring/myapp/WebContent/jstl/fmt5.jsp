<!-- fmt5.jsp  -->
<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<% request.setCharacterEncoding("EUC-KR"); %>  <!-- 한글변환 EUC-KR -->

<!-- 번들을 지정하는 과정  -->
<!-- 1. 변수에 담는다 -->
<fmt:setBundle var="note" basename="jstl.note" />

<!-- 2. fmt 메세지로 뽑는다 (key 값을 불러옴) -->
country : <fmt:message bundle="${note}" key="country"/><br>

siteName : <fmt:message bundle="${note}" key="siteName"/><br>

msg : <fmt:message bundle="${note}" key="msg"><br>
		<fmt:param value="${param.msg}" />
		</fmt:message>
		<p><a href = "fmt5.jsp?msg=반갑다."> fmt5.jsp </a>