<%@ page contentType="text/html; charset=EUC-KR" %>
<jsp:useBean id="mMgr" class="tour.CostMgr"/>
<%
		request.setCharacterEncoding("EUC-KR");
		String num = request.getParameter("num");
		mMgr.sendAccount(Integer.parseInt(num));
%>
<script>
	alert("메일을 보냈습니다.");
	history.back();
</script>
