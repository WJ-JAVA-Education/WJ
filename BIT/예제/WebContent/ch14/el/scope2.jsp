<!-- scope2.jsp -->
<%@page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
		//jsp ���������� page������ pageContext
		pageContext.setAttribute("msg", "������ ���ְ� ���۵Ǵ� �������Դϴ�.");
%>
msg : ${msg}<br>
<!-- EL���������� page������ pageScope�̴�. -->
msg : ${pageScope.msg}<br>
sum : <%=request.getAttribute("sum")%><br>
sum : ${requestScope.sum}