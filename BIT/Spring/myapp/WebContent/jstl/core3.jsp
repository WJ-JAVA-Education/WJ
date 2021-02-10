<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%	request.setCharacterEncoding("EUC-KR");  // Post 방식 한글처리 
	// get 방식 한글처리 -> server.xml(63라인) URIEncoding="EUC-KR"
%>
<%
	String str1[] = {"JAVA","JSP","Spring","Android"};
	String str2 ="트와이스,AOA;블랙핑크,레드블랙";
%>
		<c:set var="arr" value="<%=str1%>" />
			<c:forEach var="i" items="${arr}" begin="0" step="1" end="3">
				${i}<br>
			</c:forEach>
				<hr align="left" width="250">
					<c:set var="st" value="<%=str2%>" />
			<c:forTokens items="${s}" delims=",;">
			<b>${st}</b>&nbsp;
		</c:forTokens>
