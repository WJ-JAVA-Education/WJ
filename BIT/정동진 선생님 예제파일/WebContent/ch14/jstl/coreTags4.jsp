<!-- coreTags4.jsp -->
<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="http://localhost/myapp/ch14/jstl/coreTags2.jsp">
	<c:param name="id" value="aaa"/>
	<c:param name="color" value="blue"/>
</c:import>
<hr>
<c:url var="url1" value="https://google.com">
	<c:param name="q" value="jsp"/>
	<c:param name="safe" value="off"/>
</c:url>
<a href="${url1}">구글에서 jsp 검색</a>
