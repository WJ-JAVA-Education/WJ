<%@ page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
		String id = (String)session.getAttribute("idKey");
%>

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>tour cost pro</title>

<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/shop-homepage.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">


<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

</head>

<body>
	
	<div class="container login-container" align="center">
		<div class="row">
			<div style="width: 100%; text-align: center" class="col-md-6 login-form-1" >
			<img src="img1.png" style="width: 100%; vertical-align: middle" />
			</div>
			
			<div class="col-md-6 login-form-2">
				<h3>관리자 로그인</h3>
				<form method="post" action="adminLoginProc.jsp">
					<div class="form-group">
						<input name="admin_id" value="admin">
					</div>
					<div class="form-group">
						<input name="admin_pwd" value="1234">
					</div>
					<div class="form-group">
						<input type="submit" value="로그인">
						<input type="reset" value="다시쓰기">
					</div>
					<div class="form-group">
							<a href="../guestLogin.jsp" class="ForgetPwd">회원 로그인</a>
						</div>
				</form>
			</div>
		</div>
	</div>
</body>

</html>
