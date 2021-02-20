<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%request.setCharacterEncoding("EUC-KR");%>
<jsp:useBean id = "bean" class="el.ELBean"/>
<jsp:setProperty property = "siteName" name = "bean"/>
사이트명 : <jsp:getProperty property="siteName" name="bean" /> <br>
사이트명 : <%= bean.getSiteName()%><br>
사이트명 : ${bean.siteName}<br>