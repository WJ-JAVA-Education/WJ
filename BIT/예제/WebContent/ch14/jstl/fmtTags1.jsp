<!-- fmtTags1.jsp -->
<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%-- <%request.setCharacterEncoding("EUC-KR");%> --%>
<fmt:requestEncoding value="EUC-KR"/>
<!-- Locale ���� ko�� �����ڵ� kr ����ڵ� -->
<fmt:setLocale value="ko_kr"/>
name : ${param.name}
<form method="post">
name:<input name="name" value="ȫ�浿">
<input type="submit">
</form>