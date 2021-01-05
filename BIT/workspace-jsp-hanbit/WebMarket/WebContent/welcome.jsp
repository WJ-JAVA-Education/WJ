<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>

<head>
	<link rel="stylesheet" href="resources/css/bootstrap.min.css">
	<title>Welcome</title>
</head>

<body>
	<jsp:include page="menu.jsp" />
	<%!String greeting="Welcome to Web Shopping Mall" ; 
	   String tagline="Welcome to Web Market!" ;%>
		<div class="jumbotron">
			<div class="container">
				<h1 class="display-3">
					<%=greeting%>
				</h1>
			</div>
		</div>
		<div class="container">
			<div class="text-center">
				<h3>
					<%=tagline%>
				</h3>
				<%
					//현재 날짜와 시간을 출력하기 위한 자바코드
					response.setIntHeader("Refresh", 5);
					Date day = new Date();
					String am_pm; //0~12 AM 12~24 PM
					int hour = day.getHours();
					int minute = day.getMinutes();
					int second = day.getSeconds();
					if(hour/12 == 0){
						am_pm = "AM";
					} else {
						am_pm = "PM";
						hour = hour - 12;
					}
					String CT = hour + ":" + minute + ":" + second + " " + am_pm;
					out.println("현재 접속 시간: " + CT + "<br>");
				
				%>
			</div>
			<hr>
		</div>
		<jsp:include page="footer.jsp" />
</body>

</html>