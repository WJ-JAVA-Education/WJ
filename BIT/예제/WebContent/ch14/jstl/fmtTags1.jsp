<!-- fmtTags1.jsp -->
<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%-- <%request.setCharacterEncoding("EUC-KR");%> --%>
<fmt:requestEncoding value="EUC-KR"/>
<!-- Locale 지정 ko는 국가코드 kr 언어코드 -->
<fmt:setLocale value="ko_kr"/>
name : ${param.name}
<form method="post">
name:<input name="name" value="홍길동">
<input type="submit">
</form>