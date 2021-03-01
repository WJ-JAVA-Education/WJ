<%@ page contentType="text/html;charset=EUC-KR"%>
<%
	request.setCharacterEncoding("EUC-KR");
%>
<jsp:useBean id="cMgr" class="tour.CostMgr" />
<jsp:useBean id="cBean" class="tour.CostBean" />
<jsp:setProperty name="cBean" property="*" />
<%
	boolean flag = cMgr.insertCost(cBean);
%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>견적요청 확인</title>

<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/shop-homepage.css" rel="stylesheet">

</head>

<body>
	

	<!-- Page Content -->
	<div class="container" align="center">

		<%
			if (flag) {
				out.println("<b>견적요청 감사드립니다.</b><p>");	
				out.println("<a href=member.jsp>홈페이지 가입하기</a>");	
			} else {
				out.println("<b>다시 입력하여 주십시오.</b><p>");
				out.println("<a href=guestCost.jsp>견적요청하기</a>");
			}
		%>
	</div>
	
	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>

