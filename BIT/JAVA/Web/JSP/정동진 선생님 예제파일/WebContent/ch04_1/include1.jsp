<%@page contentType="text/html; charset=EUC-KR"%>
<!-- d라는 변수 선언 -->
<%@include file="top.jsp"%>
include지시자의 Body입니다.<br/>
<%
		//String d = "하하";
%>
Date&Time : <%=d.toLocaleString() %>
<%@include file="bottom.jsp"%>
