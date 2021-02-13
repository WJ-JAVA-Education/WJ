<!-- scope1 -->
<%@page contentType="text/html; charset=EUC-KR"%>
<%
		int sum  = 0 ;
		for(int i=1;i<11;i++){
			sum+=i;
		}
		//auto boxing 저장
		request.setAttribute("sum", sum);
%>
<!-- jsp:forward, include 액션태그의 특징 :요청정보(request) 같이 넘어감 -->
<jsp:forward page="scope2.jsp"/>
