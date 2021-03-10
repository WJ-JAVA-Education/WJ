<%@page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
		String season = request.getParameter("season");
		String fruit = request.getParameter("fruit");
		//id는 세션에서 가져온다.
		String id = (String)session.getAttribute("idKey");
		String sessionID = session.getId();
		int intelvalTime = session.getMaxInactiveInterval();
		if(id!=null){
%>
<%=id%>님이 좋아하는 계절과 과일은
<%=season %>과 <%=fruit %>입니다.<br>
 세션ID : <%=sessionID %><br>
 세션 유지 시간 : <%=intelvalTime%>
 <%			
			//세션에 저장된 idKey값 제거
			session.removeAttribute("idKey");
 			//세션객체 자제를 제거
 			session.invalidate();
		}else{
			out.println("세션의 시간이 경과를 하였거나 다른 이유로 연결을 할 수가 없습니다.");
			out.println("<a href='session1.html'>로그인</a>");
		}
%>














