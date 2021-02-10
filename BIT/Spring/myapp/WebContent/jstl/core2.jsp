<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%	request.setCharacterEncoding("EUC-KR");  // Post 방식 한글처리 
	// get 방식 한글처리 -> server.xml(63라인) URIEncoding="EUC-KR"
// 	out.print(request.getAttribute("msg"));
%>
<c:if test="${param.id!=null}">
	<b>${paraim.id}</b>
</c:if>
<c:if test="${param.id==null}">
	<b>Guest</b>
</c:if>
<c:choose>
	<c:when test="${param.color=='yellow'}">
		<c:set var="c" value="노란색" />
	</c:when>
	<c:when test="${param.color=='blue'}">
		<c:set var="c" value="파란색" />
	</c:when>
	<c:when test="${param.color=='orange'}">
		<c:set var="c" value="오렌지색" />
	</c:when>
	<c:when test="${param.color=='pink'}">
		<c:set var="c" value="핑크색" />
	</c:when>
	<c:otherwise>
		<c:set var="c" value="블랙" />
	</c:otherwise>
</c:choose>
님이 좋아하는 색은 <font color="${param.color}">${c }</font><br>
msg : ${param.msg}