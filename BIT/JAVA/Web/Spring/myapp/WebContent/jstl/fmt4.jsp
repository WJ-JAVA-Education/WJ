<!-- fmt4.jsp  -->
<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:set var="dayTime" value="<%= new Date() %>" />

<h3>Korea</h3>
날짜 : <fmt:formatDate value="${dayTime}" type="date" dateStyle="full"/><br>
시간 : <fmt:formatDate value="${dayTime}" type="time" dateStyle="full"/><br>

<h3>London</h3>
<!-- fmt:setTimeZone 폼태그를 사용하면 해당 나라의 시간을 구할수있다.  -->
<fmt:setTimeZone value="Europe/London" />
날짜 : <fmt:formatDate value="${dayTime}" type="date" dateStyle="full"/><br>
시간 : <fmt:formatDate value="${dayTime}" type="time" dateStyle="full"/><br>

<h3>홍콩</h3>
<fmt:setTimeZone value="Asia/Hong_Kong" />
날짜 : <fmt:formatDate value="${dayTime}" type="date" dateStyle="full"/><br>
시간 : <fmt:formatDate value="${dayTime}" type="time" dateStyle="full"/><br>

