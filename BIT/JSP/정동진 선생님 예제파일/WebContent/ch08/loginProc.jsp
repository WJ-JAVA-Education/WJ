<%@page contentType="text/html; charset=EUC-KR"%>
<jsp:useBean id="mgr" class="ch08.RegisterMgr"/>
<%
		request.setCharacterEncoding("EUC-KR");
		//login.jsp에서 id와 pwd를 요청
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		boolean result = mgr.loginRegister(id, pwd);
		String msg = "로그인 실패 하였습니다.";
		String url = "login.jsp";
		if(result){
			msg = "로그인 되었습니다.";
			url = "loginOK.jsp";
			session.setAttribute("idKey", id);
		}
%>
<script>
	alert("<%=msg%>");
	location.href="<%=url%>";
</script>




