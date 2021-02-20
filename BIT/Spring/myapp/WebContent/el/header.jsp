<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%
	request.setCharacterEncoding("EUC-KR");
%>
호스트명 : ${header.host}<br>
사용브라우저:${header["user-agent"]}<br>
사용언어 : ${header["accept-language"]}<br>