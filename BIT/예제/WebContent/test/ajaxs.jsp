<%@page import="member.MemberBean"%>
<%@ page contentType="text/plain; charset=EUC-KR"%>
<jsp:useBean id="mgr" class="member.MemberMgr"/>
<%
		request.setCharacterEncoding("EUC-KR");
		String id = request.getParameter("id");
		MemberBean bean = mgr.getMember(id);
		String name = "게스트";
		if(bean.getName()!=null)
			name = bean.getName();
		
%>
안녕하세요, <%= name %>님!