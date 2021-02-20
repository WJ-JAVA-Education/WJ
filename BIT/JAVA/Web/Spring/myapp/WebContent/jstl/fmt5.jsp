<!-- fmt5.jsp  -->
<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<% request.setCharacterEncoding("EUC-KR"); %>  <!-- �ѱۺ�ȯ EUC-KR -->

<!-- ������ �����ϴ� ����  -->
<!-- 1. ������ ��´� -->
<fmt:setBundle var="note" basename="jstl.note" />

<!-- 2. fmt �޼����� �̴´� (key ���� �ҷ���) -->
country : <fmt:message bundle="${note}" key="country"/><br>

siteName : <fmt:message bundle="${note}" key="siteName"/><br>

msg : <fmt:message bundle="${note}" key="msg"><br>
		<fmt:param value="${param.msg}" />
		</fmt:message>
		<p><a href = "fmt5.jsp?msg=�ݰ���."> fmt5.jsp </a>