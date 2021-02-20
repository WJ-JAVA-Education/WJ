<%@page import="ch07.SimpleBean"%>
<%@page contentType="text/html; charset=EUC-KR"%>
<%request.setCharacterEncoding("EUC-KR");%>
<!-- SimpleBean 객체 생성 -->
<jsp:useBean id="bean" class="ch07.SimpleBean"/>
<!-- SimpleBean bean = new SimpleBean() -->
<!-- 요청된 msg와 cnt를 받고 bean 저장 -->

<% 
		SimpleBean bean1 = new SimpleBean();
%>

<jsp:setProperty property="msg" name="bean"/>
<!--  bean.setMsg(reqeust.getParameter("msg")) -->
<jsp:setProperty property="cnt" name="bean"/>
<!--  bean.setCnt(Integer.parseInt(request.getParameter("cnt"))) -->

<jsp:setProperty property="*" name="bean"/>

msg2 : <jsp:getProperty property="msg" name="bean"/><br>
msg2 : <%=bean.getMsg()%><br>
cnt2 : <jsp:getProperty property="cnt" name="bean"/><br>







