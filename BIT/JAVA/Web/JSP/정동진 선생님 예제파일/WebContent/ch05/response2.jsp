<%@page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
		//캐시영역에 저장을 안됨.(이 페이지는 항상 서버로 요청 해야함.)
		response.setHeader("Pragma", "no-cache");
		if(request.getProtocol().equals("HTTP/1.1"))
			response.setHeader("Cache-Control", "no-store");
%>
response2.jsp
