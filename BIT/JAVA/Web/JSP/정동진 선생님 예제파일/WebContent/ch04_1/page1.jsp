<%@page contentType="text/html; charset=EUC-KR" 
                   language="java"
%>
<%@page info="Copyright 2001 by JSPStudy.co.kr" %>
<%
		request.setCharacterEncoding("EUC-KR");
		String arr[] = {"a","b","c"};
%>
<%=this.getServletInfo()%>
<%=arr[3]%>
