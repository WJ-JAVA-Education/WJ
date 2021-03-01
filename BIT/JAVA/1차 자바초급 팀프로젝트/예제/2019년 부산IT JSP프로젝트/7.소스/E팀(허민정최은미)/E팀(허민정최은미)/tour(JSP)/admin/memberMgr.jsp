<%@ page contentType="text/html;charset=EUC-KR"%>
<%@ page import="java.util.*, tour.*"%>
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
<script language="JavaScript" src="script.js"></script>
</head>
<body bgcolor="#996600" topmargin="100">

	<%@ include file="top.jsp"%>

	<!-- Page Content -->
	<div class="container">

		<div class="row">
			<%@ include file="left.jsp"%>
			<div class="col-lg-9">

				<%
					Vector<MemberBean> vlist = mMgr.getMemberList();
				%>
				<br><br><br>
				<table width="75%" align="center" class="table">
					<tr>
						<td align="center">

							<table width="95%" align="center" >
							
								<tr align="center" bgcolor="black">
									<td><b><font color="#FFFFFF">회원이름</font></b></td>
									<td><b><font color="#FFFFFF">회원아이디</font></b></td>
									<td><b><font color="#FFFFFF">패스워드</font></b></td>
									<td><b><font color="#FFFFFF">성별</font></b></td>
									<td><b><font color="#FFFFFF">생년월일</font></b></td>
									<td><b><font color="#FFFFFF">이메일</font></b></td>
									<td><b><font color="#FFFFFF">수정</font></b></td>
									<td><b><font color="#FFFFFF">광고메일보내기</font></b></td>
								</tr>
								<%
									for (int i = 0; i < vlist.size(); i++) {
										MemberBean mBean = vlist.get(i);
								%>
								<tr align="center">
									<td><%=mBean.getName()%></td>
									<td><%=mBean.getId()%></td>
									<td><%=mBean.getPwd()%></td>
									<td><%=mBean.getGender().equals("1") ? "남자" : "여자"%></td>
									<td><%=mBean.getBirthday()%></td>
									<td><%=mBean.getEmail()%></td>
									<td><a href="javascript:update('<%=mBean.getId()%>')">수정하기</a></td>
									<td><font color="#FFFFFF"> <a
											href="sendAccount.jsp?id=<%=mBean.getId()%>">메일보내기</a>
									</font></td>
								</tr>
								<%
									}
								%>
							</table>
						</td>
					</tr>
				</table>
			</div>
			<!-- /.col-lg-9 -->



		</div>
		<!-- /.row -->

	</div>
	<!-- /.container -->
	<%@ include file="bottom.jsp"%>
	<form name="update" method="post" action="memberUpdate.jsp">
		<input type=hidden name="id">
	</form>
	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>
