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

<script type="text/javascript">
	function loginCheck() {
		if (document.loginFrm.id.value == "") {
			alert("아이디를 입력해 주세요.");
			document.loginFrm.id.focus();
			return;
		}
		if (document.loginFrm.pwd.value == "") {
			alert("비밀번호를 입력해 주세요.");
			document.loginFrm.pwd.focus();
			return;
		}
		document.loginFrm.submit();
	}
</script>
<body>
	<div align="center">
		<br />
		<br />
		<%if(id!=null){%>
		<b><%=id%></b>  
		<script>
   		location.href="main01.jsp";
   		</script>
		<%}else{
			id = request.getParameter("id");
	     %>
		<div class="container login-container">
			<div class="row">
				<div style="width: 100%; text-align: center" class="col-md-6 login-form-1" >
				<img src="img1.png" style="width: 100%; vertical-align: middle" />
				</div>
			
				<div class="col-md-6 login-form-2">
					<h3>로그인</h3>
					<form name="loginFrm" method="post" action="loginProc.jsp">
						<div class="form-group">
							<input name="id" value="<%=(id!=null)?id:""%>">
						</div>
						<div class="form-group">
							<input type="password" name="pwd" value="">
						</div>
						<div class="form-group">
							<input type="button" value="로그인" onclick="loginCheck()">&nbsp;
							<input type="button" value="회원가입"
								onClick="javascript:location.href='member.jsp'">
						</div>
						<div class="form-group">
							<a href="admin/adminLogin01.jsp" class="ForgetPwd">관리자 로그인</a>
						</div>
					</form>
					<%}%>
				</div>
		</div>
		</div>
</body>

</html>
