<!-- fmt1.jsp  -->
<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%-- <%	request.setCharacterEncoding("EUC-KR");	%> --%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
	<fmt:requestEncoding value="EUC-KR" />
	<!-- Locale 지정 ko 국가코드 kr 언어코드  -->
	<fmt:setLocale value="ko_kr" />
	
	name : ${param.name}
		<form>
			name : <input name="name" value="홍길동">
			<input type="submit">
		</form>