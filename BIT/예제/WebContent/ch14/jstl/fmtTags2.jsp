<!-- fmtTags2.jsp -->
<%@page import="java.util.Date"%>
<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="now" value="<%=new Date()%>"/>
<b>Korea</b><br>
<fmt:setLocale value="ko_kr"/>
�ݾ� : <fmt:formatNumber value="100000000" type="currency"/><br>
�Ͻ� : <fmt:formatDate value="${now}" type="both" 
dateStyle="full" timeStyle="full"/><p>
<b>Japan</b><br>
<fmt:setLocale value="ja_jp"/>
�ݾ� : <fmt:formatNumber value="100000000" type="currency"/><br>
�Ͻ� : <fmt:formatDate value="${now}" type="both" 
dateStyle="full" timeStyle="full"/><p>
<b>USA</b><br>
<fmt:setLocale value="en_us"/>
�ݾ� : <fmt:formatNumber value="100000000" type="currency"/><br>
�Ͻ� : <fmt:formatDate value="${now}" type="both" 
dateStyle="full" timeStyle="full"/><p>









