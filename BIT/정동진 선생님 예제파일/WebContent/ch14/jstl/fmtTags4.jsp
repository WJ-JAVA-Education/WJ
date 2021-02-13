<!-- fmtTags4.jsp -->
<%@page import="java.util.Date"%>
<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="dayTime" value="<%=new Date()%>"/>
<b>Korea</b><hr width="300" align="left">
날짜 : <fmt:formatDate value="${dayTime}" type="date" 
dateStyle="full"/><br>
시간 : <fmt:formatDate value="${dayTime}" type="time"/><p>

<b>London</b><hr width="300" align="left">
<fmt:setTimeZone value="Europe/London"/>
날짜 : <fmt:formatDate value="${dayTime}" type="date" 
dateStyle="full"/><br>
시간 : <fmt:formatDate value="${dayTime}" type="time"/><p>

<b>홍콩</b><hr width="300" align="left">
<fmt:setTimeZone value="Asia/Hong_Kong"/>
날짜 : <fmt:formatDate value="${dayTime}" type="date" 
dateStyle="full"/><br>
시간 : <fmt:formatDate value="${dayTime}" type="time"/><p>

<b>뉴욕</b><hr width="300" align="left">
<fmt:setTimeZone value="America/New_York"/>
날짜 : <fmt:formatDate value="${dayTime}" type="date" 
dateStyle="full"/><br>
시간 : <fmt:formatDate value="${dayTime}" type="time"/><p>

<b>베를린</b><hr width="300" align="left">
<fmt:setTimeZone value="Europe/Berlin"/>
날짜 : <fmt:formatDate value="${dayTime}" type="date" 
dateStyle="full"/><br>
시간 : <fmt:formatDate value="${dayTime}" type="time"/><p>

<b>LA</b><hr width="300" align="left">
<fmt:setTimeZone value="America/Los_Angeles"/>
날짜 : <fmt:formatDate value="${dayTime}" type="date" 
dateStyle="full"/><br>
시간 : <fmt:formatDate value="${dayTime}" type="time"/><p>













