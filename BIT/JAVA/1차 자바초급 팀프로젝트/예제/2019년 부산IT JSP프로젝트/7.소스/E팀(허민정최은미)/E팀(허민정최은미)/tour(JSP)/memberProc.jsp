<%@ page contentType="text/html;charset=EUC-KR"%>
<% request.setCharacterEncoding("EUC-KR");%>
<jsp:useBean id="mMgr" class="tour.MemberMgr" />
<jsp:useBean id="mBean" class="tour.MemberBean" />
<jsp:setProperty name="mBean" property="*" />
<%boolean flag = mMgr.insertMember(mBean);%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>회원가입 확인</title>

<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">



</head>

<body>
	<br/><br/><br/><br/>

	<!-- Page Content -->
	<div class="container" align="center">
		<%
if(flag){
	  out.println("<b>회원가입을 축하 드립니다.</b><p>");
	  out.println("<a href=guestLogin.jsp>로그인</a>");
	}else{
	  out.println("<b>다시 입력하여 주십시오.</b><p>");
	  out.println("<a href=member.jsp>다시 가입</a>");
	}
%>
	</div>
	<!-- /.container -->
	
	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>

