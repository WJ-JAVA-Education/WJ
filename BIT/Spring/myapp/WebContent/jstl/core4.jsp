<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%	request.setCharacterEncoding("EUC-KR");  // Post 방식 한글처리 
	// get 방식 한글처리 -> server.xml(63라인) URIEncoding="EUC-KR"
%>
	<c:import url="http://localhost/myapp/jstl/core2.jsp">
		<c:param name="id" value="aaa" />
		<c:param name="color" value="blue" />
		<c:param name="msg" value="오늘은 즐거운 연휴 전날~" />
	</c:import>
	<hr>
	<c:url var="url1" value="https://www.google.com/">
		<!-- 검색창에 검색어 입력기능  -->
		<c:param name="q" value="jspstudy" /> 
		<c:param name="safe" value="off" />
	</c:url>
	<a href="${url1}">구글에서 JSPStudy 검색</a>