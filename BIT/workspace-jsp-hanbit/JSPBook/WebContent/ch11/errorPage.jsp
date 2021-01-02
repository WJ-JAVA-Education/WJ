<%@ page contentType="text/html; charset=utf-8"%>
<%@ page errorPage="errorPage_error.jsp"%> <!-- 이동하는 에러페이지  -->
<html>
<head>
<title>Exception</title>
</head>
<body>
	<!-- name 이라는 파라미터가 없는데 불러와서 에러가 남. -->
	name 파라미터 : <%=request.getParameter("name").toUpperCase()%>
</body>
</html>
