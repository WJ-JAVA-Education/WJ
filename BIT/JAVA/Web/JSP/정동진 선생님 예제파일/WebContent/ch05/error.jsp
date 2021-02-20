<%@page contentType="text/html; charset=EUC-KR"
				  isErrorPage="true"
%>
<%
		request.setCharacterEncoding("EUC-KR");
		//isErrorPage="true" 때문에 exception 내부 객체 사용 가능
		String msg = exception.getMessage();		
		String obj = exception.toString();
%>
에러 메세지 : <%=msg%><br>
에러 메세지 및 클래스 : <%=obj%><br>
