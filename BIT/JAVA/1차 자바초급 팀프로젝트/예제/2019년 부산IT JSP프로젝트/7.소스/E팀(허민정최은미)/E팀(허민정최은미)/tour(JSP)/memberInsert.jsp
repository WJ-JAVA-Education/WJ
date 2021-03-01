<%@ page contentType="text/html;charset=EUC-KR"%>
<%@ page import="java.util.*,tour.*"%>
<%request.setCharacterEncoding("EUC-KR");%>
<jsp:useBean id="mBean" class="tour.MemberBean" />
<jsp:setProperty name="mBean" property="*" />
<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>회원가입</title>

<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

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
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-8">
				<div class="card">
					<div class="card-header">회원가입</div>
					<div class="card-body">

						<form name="regForm" method="post" action="memberProc.jsp"
							class="form-horizontal">
							<div class="form-group">
								<label class="col-sm-9 control-label"> <jsp:getProperty
										name="mBean" property="name" /> 회원님이 작성하신 내용입니다. 확인해 주세요
								</label>
							</div>

							<div class="form-group">
								<label for="id" class="cols-sm-2 control-label">ID</label>
								<div class="cols-sm-10">
									<input name="id"
										value="<jsp:getProperty name="mBean" property="id" />">
								</div>
							</div>

							<div class="form-group">
								<label for="password" class="cols-sm-2 control-label">Password</label>
								<div class="cols-sm-10">
									<input name="pwd"
										value="<jsp:getProperty name="mBean" property="pwd" />">
								</div>
							</div>

							<div class="form-group">
								<label for="name" class="cols-sm-2 control-label">이름</label>
								<div class="cols-sm-10">
									<input name="name"
										value="<jsp:getProperty name="mBean" property="name" />">
								</div>
							</div>
							<div class="form-group">
								<label for="email" class="cols-sm-2 control-label">이메일</label>
								<div class="cols-sm-10">
									<input name="email"
										value="<jsp:getProperty name="mBean" property="email" />">
								</div>
							</div>
							<div class="form-group">
								<label for="hp" class="cols-sm-2 control-label">핸드폰</label>
								<div class="cols-sm-10">
									<input name="hp" size="30"
										value="<jsp:getProperty name="mBean" property="hp" />">
								</div>
							</div>
							<div class="form-group">
								<label for="birthDate" class="cols-sm-2 control-label">생년월일</label>
								<div class="cols-sm-10">
									<input name="birthday"
										value="<jsp:getProperty name="mBean" property="birthday" />">
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-sm-3">성별</label>
								<div class="col-sm-6">
									남<input type="radio" name="gender" value="1"
										<%=mBean.getGender().equals("1") ? "checked" : ""%>> 여<input
										type="radio" name="gender" value="2"
										<%=mBean.getGender().equals("2") ? "checked" : ""%>>
								</div>
							</div>
							<!-- /.form-group -->
							<div class="form-group">
								<div class="col-sm-9 col-sm-offset-3" align="center">
									<input type="submit" value="확인완료"> &nbsp; &nbsp; &nbsp;
									&nbsp; &nbsp; &nbsp; <input type="button" value="다시쓰기"
										onClick="history.back()">
								</div>
							</div>
						</form>
						<!-- /form -->
					</div>
					<!-- ./container -->
					<script src="vendor/jquery/jquery.min.js"></script>
					<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>

</html>
