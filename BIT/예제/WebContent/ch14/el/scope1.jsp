<!-- scope1 -->
<%@page contentType="text/html; charset=EUC-KR"%>
<%
		int sum  = 0 ;
		for(int i=1;i<11;i++){
			sum+=i;
		}
		//auto boxing ����
		request.setAttribute("sum", sum);
%>
<!-- jsp:forward, include �׼��±��� Ư¡ :��û����(request) ���� �Ѿ -->
<jsp:forward page="scope2.jsp"/>