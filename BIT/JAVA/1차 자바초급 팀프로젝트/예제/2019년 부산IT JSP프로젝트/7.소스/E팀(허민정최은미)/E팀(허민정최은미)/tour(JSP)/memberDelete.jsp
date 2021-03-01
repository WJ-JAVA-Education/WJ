<%@page import="org.apache.catalina.ssi.SSICommand"%>
<%@ page contentType="text/html;charset=EUC-KR"%>
<%@ page import="java.util.*,tour.*"%>
<%request.setCharacterEncoding("EUC-KR");%>
<jsp:useBean id="mMgr" class="tour.MemberMgr" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>회원탈퇴</title>

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
				<%if(id!=null){%>
				<br><br><br>
				<form name="regForm" method="post" action="memberDeleteProc.jsp"
					class="form-horizontal" role="form">
				
					<div class="form-group">
						<label class="col-sm-9 control-label"> <b> <%=mBean.getName()%>
								회원님 정말로 탈퇴하시겠습니까?</label>
					</div>
					<div class="form-group">
						<div class="col-sm-9 col-sm-offset-3" align="center">
							<input type="submit" value="예"> &nbsp; &nbsp; &nbsp;
							&nbsp; &nbsp; &nbsp; <input type="button" value="아니오" onclick="location.href='main01.jsp'">
						</div>
					</div>

					<input type="hidden" name="id" value="<%=id%>">
				</form>
			
			<%}else{%>
			<script>
			 location.href="guestLogin.jsp";
			 </script>
			 <%}%>
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
