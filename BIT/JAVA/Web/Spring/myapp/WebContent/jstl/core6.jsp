<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%	request.setCharacterEncoding("EUC-KR");  // Post 방식 한글처리 
	// get 방식 한글처리 -> server.xml(63라인) URIEncoding="EUC-KR"
%>
<c:catch var ="ex">
	<%
		int arr[] = {1,2,3};
		int sum = arr[0] + arr[2];
	%>
</c:catch>
${ex}