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
<!-- forward , include 액션태그의 특징 : 요청 정보도 같이 넘어간다 . (request)  -->
<jsp:forward page ="scope2.jsp"/>