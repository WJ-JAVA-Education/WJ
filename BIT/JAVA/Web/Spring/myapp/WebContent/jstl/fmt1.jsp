<!-- fmt1.jsp  -->
<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%-- <%	request.setCharacterEncoding("EUC-KR");	%> --%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
	<fmt:requestEncoding value="EUC-KR" />
	<!-- Locale ���� ko �����ڵ� kr ����ڵ�  -->
	<fmt:setLocale value="ko_kr" />
	
	name : ${param.name}
		<form>
			name : <input name="name" value="ȫ�浿">
			<input type="submit">
		</form>