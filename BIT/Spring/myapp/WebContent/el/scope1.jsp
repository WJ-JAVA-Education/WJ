<!-- scope1.jsp  -->
<%@ page language="java" contentType="text/html; charset=EUC-KR" isELIgnored="true"	%>
<%
	request.setCharacterEncoding("EUC-KR");
	int sum = 0;
	for(int i= 1 ; i<11; i++){
		sum += i;
	}
	request.setAttribute("sum", sum);
%>
<!-- forward , include �׼��±��� Ư¡ : ��û ������ ���� �Ѿ�� . (request)  -->
<jsp:forward page ="scope2.jsp"/>