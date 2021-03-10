<!-- sqlTags2.jsp -->
<%@page import="java.util.Date"%>
<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<sql:update dataSource="${db}">
	update tblMember set name=? where id=?
	<sql:param value="${'손오공'}"/>
	<sql:param value="${'aaa'}"/>
</sql:update>

<a href="sqlTags1.jsp">SELECT</a>

       






          
