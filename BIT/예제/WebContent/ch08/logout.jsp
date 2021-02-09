<!-- logout.jsp -->
<%@page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
		//세션에 지정한 키값만 삭제
		session.removeAttribute("idKey");
		//세션 객체 자체를 제거
		session.invalidate();
		response.sendRedirect("login.jsp");
%>