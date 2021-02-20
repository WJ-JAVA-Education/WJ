<!-- scope2.jsp -->
<%@page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
		//jsp 문법에서는 page영역이 pageContext
		pageContext.setAttribute("msg", "오늘은 한주가 시작되는 월요일입니다.");
%>
msg : ${msg}<br>
<!-- EL문법에서는 page영역이 pageScope이다. -->
msg : ${pageScope.msg}<br>
sum : <%=request.getAttribute("sum")%><br>
sum : ${requestScope.sum}
