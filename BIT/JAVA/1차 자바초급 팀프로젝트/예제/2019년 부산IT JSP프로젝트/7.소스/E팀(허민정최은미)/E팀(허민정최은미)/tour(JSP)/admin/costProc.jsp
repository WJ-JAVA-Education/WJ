<%@page import="tour.CostMgr"%>
<%@ page contentType="text/html; charset=EUC-KR" %>
<jsp:useBean id="cMgr" class="tour.CostMgr"/>
<%
		request.setCharacterEncoding("EUC-KR");
		String flag = request.getParameter("flag");
		int no = Integer.parseInt(request.getParameter("no"));
		boolean result = false;
		String msg ="오류가 발생하였습니다.";
		if(flag.equals("update")){
			String state = request.getParameter("state");
			String fcost = request.getParameter("fcost");
			result = cMgr.updateCost(no,state, fcost);
			if(result) msg ="수정하였습니다.";
		}else if(flag.equals("delete")){
			result = cMgr.deleteCost(no);
			if(result) msg ="삭제하였습니다.";
		}
%>
<script>
	alert("<%=msg%>");
	location.href = "costMgr.jsp";
</script>
