<!-- fmtTags4.jsp -->
<%@page import="java.util.Date"%>
<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="dayTime" value="<%=new Date()%>"/>
<b>Korea</b><hr width="300" align="left">
��¥ : <fmt:formatDate value="${dayTime}" type="date" 
dateStyle="full"/><br>
�ð� : <fmt:formatDate value="${dayTime}" type="time"/><p>

<b>London</b><hr width="300" align="left">
<fmt:setTimeZone value="Europe/London"/>
��¥ : <fmt:formatDate value="${dayTime}" type="date" 
dateStyle="full"/><br>
�ð� : <fmt:formatDate value="${dayTime}" type="time"/><p>

<b>ȫ��</b><hr width="300" align="left">
<fmt:setTimeZone value="Asia/Hong_Kong"/>
��¥ : <fmt:formatDate value="${dayTime}" type="date" 
dateStyle="full"/><br>
�ð� : <fmt:formatDate value="${dayTime}" type="time"/><p>

<b>����</b><hr width="300" align="left">
<fmt:setTimeZone value="America/New_York"/>
��¥ : <fmt:formatDate value="${dayTime}" type="date" 
dateStyle="full"/><br>
�ð� : <fmt:formatDate value="${dayTime}" type="time"/><p>

<b>������</b><hr width="300" align="left">
<fmt:setTimeZone value="Europe/Berlin"/>
��¥ : <fmt:formatDate value="${dayTime}" type="date" 
dateStyle="full"/><br>
�ð� : <fmt:formatDate value="${dayTime}" type="time"/><p>

<b>LA</b><hr width="300" align="left">
<fmt:setTimeZone value="America/Los_Angeles"/>
��¥ : <fmt:formatDate value="${dayTime}" type="date" 
dateStyle="full"/><br>
�ð� : <fmt:formatDate value="${dayTime}" type="time"/><p>













