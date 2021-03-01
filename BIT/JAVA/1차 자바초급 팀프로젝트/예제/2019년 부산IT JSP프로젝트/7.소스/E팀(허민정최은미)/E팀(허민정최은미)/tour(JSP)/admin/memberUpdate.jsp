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
					String id = request.getParameter("id");
					MemberBean mBean = mMgr.getMember(id);
				%>
				<br><br>
				<form name="regForm" method="post" action="memberUpdateProc.jsp">
					<table width="75%" align="center" class="table">
						<tr>
							<td align="center" >
								<table width="90%" align="center" >
									<tr align="center" bgcolor="black">
										<td colspan="3"><font color="#FFFFFF"><b> <%=mBean.getName()%>
													회원님의 정보를 수정합니다.
											</b></font></td>
									</tr>
									<tr>
										<td>아이디</td>
										<td><%=mBean.getId()%></td>
									</tr>
									<tr>
										<td>패스워드</td>
										<td><input name="pwd" value="<%=mBean.getPwd()%>"></td>
									</tr>
									<tr>
										<td>이름</td>
										<td><input name="name" value="<%=mBean.getName()%>"></td>
									</tr>
									<tr>
										<td>성별</td>
										<td>남<input type="radio" name="gender" value="1"
											<%=mBean.getGender().equals("1") ? "checked" : ""%>>
											여<input type="radio" name="gender" value="2"
											<%=mBean.getGender().equals("2") ? "checked" : ""%>>
										</td>
									</tr>
									<tr>
										<td>생년월일</td>
										<td><input name="birthday" size="6"
											value="<%=mBean.getBirthday()%>"> ex)830815</td>
									</tr>
									<tr>
										<td>이메일</td>
										<td><input name="email" size="30"
											value="<%=mBean.getEmail()%>"></td>
									</tr>
									<tr>
										<td>핸드폰</td>
										<td><input name="hp" size="30" value="<%=mBean.getHp()%>"></td>
									</tr>

									<tr>
										<td colspan="2" align="center"><input type="submit"
											value="수정완료"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
											&nbsp; <input type="reset" value="다시쓰기"></td>
									</tr>
									<input type="hidden" name="id" value="<%=id%>">
								</table>
							</td>
						</tr>
					</table>
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
