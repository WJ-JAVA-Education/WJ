<!--  coreTags1.jsp -->
<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
		request.setCharacterEncoding("EUC-KR");
		String str1 = "Java의 JSTL";
		String str2 = null;
%>
<!-- 4개의 저장소 변수를 선언 -->
<c:set var="str3" value="JSPstudy" scope="page"/>
<c:set var="str4" value="JSTL" scope="session"/>
<!-- 변수의 출력 -->
- <c:out value="<%=str1%>" default="기본출력값"/><br>
- <c:out value="<%=str2%>" default="기본출력값"/><br>
- <c:out value="${str3}" default="기본출력값"/><br>
<!-- 변수를 저장소에서 삭제 -->
<c:remove var="str4"/><br>
<%String s = (String)pageContext.getAttribute("str3"); %>
- <%=s %>








