<!-- sql1.jsp  -->
<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
	
	<sql:setDataSource
	url="jdbc:mysql://127.0.0.1:3306/mydb?useUnicode=true&characterEncoding=EUC_KR"
	driver="org.gjt.mm.mysql.Driver"
	user="root" password="1234" var="db" scope="application" />
	
	<sql:query var="lists" dataSource="${db}">
		select id,name from tblMember
	</sql:query>
	
		<table border="1">
			<tr>
				<td>ID</td><td>NAME</td>
			</tr>
			<!-- rowsByIndex�� �ش� ������ŭ�� row - ���� �����°� -->
			<c:forEach var="member" items="${lists.rowsByIndex}">
					<tr>
					<!-- ���ڵ��� �ʵ�� ��ŭ �ݺ� -->
					<c:forEach var="mem" items="${member}"> 
					<td>${mem}</td>
					</c:forEach>
				</tr>	
			</c:forEach>
		</table>
		<p><a href="sql2.jsp">UPDATE</a>