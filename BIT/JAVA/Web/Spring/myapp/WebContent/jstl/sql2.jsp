<!-- sql2.jsp  -->
<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
	
<sql:update dataSource="${db}">
	update tblMember set name=? where id=?
	<sql:param value="${'ȫ���'}"/>	
	<sql:param value="${'bbb'}"/>	
</sql:update>
������Ʈ �Ͽ����ϴ�<br>
<a href = "sql1.jsp">Select</a>