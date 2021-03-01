<%@ page contentType="text/html;charset=EUC-KR"%>
<%@ page import="java.util.*,tour.*"%>
<%
	request.setCharacterEncoding("EUC-KR");
%>
<jsp:useBean id="mMgr" class="tour.MemberMgr" />
<!DOCTYPE html>
<html lang="en">

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
<script src="script.js"></script>
</head>
<body bgcolor="#996600">
	<br>
	<%@ include file="top.jsp"%>
	<!-- Page Content -->
	<div class="container">

		<div class="row">
			<%@ include file="left.jsp"%>
			<div class="col-lg-9">

				<%
					String id = (String) session.getAttribute("idKey");
					MemberBean mBean = mMgr.getMember(id);
				%>
				<form name="regForm" method="post" action="memberUpdateProc.jsp"
					class="form-horizontal" role="form">
					<div class="form-group">
						<label class="col-sm-9 control-label"> <b> <%=mBean.getName()%>
								회원님의 정보를 수정합니다.</label>
					</div>
					<div class="form-group">
						<label for="id" class="col-sm-3 control-label">ID : <%=mBean.getId()%></label>
						<div class="col-sm-9">
						</div>
					</div>
					<div class="form-group">
						<label for="password" class="col-sm-3 control-label">Password</label>
						<div class="col-sm-9">
							<input name="pwd" value="<%=mBean.getPwd()%>">
						</div>
					</div>
					<div class="form-group">
						<label for="name" class="col-sm-3 control-label">이름</label>
						<div class="col-sm-9">
							<input name="name" value="<%=mBean.getName()%>">
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
						<label for="birthDate" class="col-sm-3 control-label">생년월일</label>
						<div class="col-sm-9">
							<input name="birthday" size="6" value="<%=mBean.getBirthday()%>">
							ex)830815
						</div>
					</div>
					<div class="form-group">
						<label for="email" class="col-sm-3 control-label">이메일</label>
						<div class="col-sm-9">
							<input name="email" size="30" value="<%=mBean.getEmail()%>">
						</div>
					</div>
					<div class="form-group">
						<label for="hp" class="col-sm-3 control-label">핸드폰</label>
						<div class="col-sm-9">
							<input name="hp" size="30" value="<%=mBean.getHp()%>">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-9 col-sm-offset-3" align="center">
							<input type="submit" value="수정완료"> &nbsp; &nbsp; &nbsp;
							&nbsp; &nbsp; &nbsp; <input type="reset" value="다시쓰기">
						</div>
					</div>

					<input type="hidden" name="id" value="<%=id%>">
				</form>
			</div>
			<!-- /.col-lg-9 -->



		</div>
		<!-- /.row -->

	</div>
	<!-- /.container -->
	<%@ include file="bottom.jsp"%>
	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>
