<!-- fmt1.jsp  -->
<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%-- <%	request.setCharacterEncoding("EUC-KR");	%> --%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="num" value="123456789" />

<!-- groupingUsed 숫자값의 콤마를 찍어준다 (기본값은 true) -->

숫자 : <fmt:formatNumber value="${num}" type="number" groupingUsed="true"/><br>

퍼센트 : <fmt:formatNumber value="${num}" type="percent" groupingUsed="flase"/><br>

<!-- currency 타입을 사용하며 currencySymbol 태그를 사용하면 화폐를 넣을수있다.  -->
달러 : <fmt:formatNumber value="${num}" type="currency" currencySymbol="$"/><br>

<!-- 패턴을 사용하면 소숫점 자리를 이용할수 있다. -->
패턴 : <fmt:formatNumber value="${num}" pattern="0.0000" /><br>

<!-- parseNumber 폼태그를 사용하면 정수만 출력할수 있다.  -->
<fmt:parseNumber var="i" integerOnly="true" value="123.456"/>
실수를 제외한 정수 : <c:out value="${i}" />
