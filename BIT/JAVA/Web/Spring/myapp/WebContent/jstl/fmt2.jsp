<!-- fmt2.jsp  -->
<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%-- <%	request.setCharacterEncoding("EUC-KR");	%> --%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var ="now" value="<%=new Date()%>" />
<h3>Korea</h3>
<fmt:setLocale value="ko_kr"/>
금액 : <fmt:formatNumber value="500000000" type="currency" /><br>
일시 : <fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full"/><br>
<br>
<!-- 일본  -->
<fmt:setLocale value="ja_jp"/>
금액 : <fmt:formatNumber value="500000000" type="currency" /><br>
일시 : <fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full"/><br>
<!-- 미국  -->
<br>
<fmt:setLocale value="en_us"/>
금액 : <fmt:formatNumber value="500000000" type="currency" /><br>
일시 : <fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full"/><br>