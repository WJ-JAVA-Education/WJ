<%@ page contentType="text/html; charset=EUC-KR"%>
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

</head>
<body bgcolor="#FFFFCC">
	<%@ include file="top.jsp"%>

	<!-- Page Content -->
	<div class="container">

		<div class="row">
			<%@ include file="left.jsp"%>
			<div class="col-lg-9">
				<br />
				<br />
				<table width="600" cellpadding="3">
					<tr>
						<td bgcolor="black" height="25" align="center"><font color="#FFFFFF"><b>글쓰기</b></font></td>
					</tr>
				</table>
				<br />
				<form name="postFrm" method="post" action="boardPost"
					enctype="multipart/form-data">
					<table width="600" cellpadding="3" align="center">
						<tr>
							<td align=center>
								<table align="center">
									<tr>
										<td width="10%">성 명</td>
										<td width="90%"><input name="name" size="10"
											maxlength="8"></td>
									</tr>
									<tr>
										<td>제 목</td>
										<td><input name="subject" size="50" maxlength="30"></td>
									</tr>
									<tr>
										<td>내 용</td>
										<td><textarea name="content" rows="10" cols="50"></textarea></td>
									</tr>
									<tr>
										<td>비밀 번호</td>
										<td><input type="password" name="pass" size="15"
											maxlength="15" value="1234"></td>
									</tr>
									<tr>
									
									<tr>
										<td>내용타입</td>
										<td>HTML<input type=radio name="contentType" value="HTTP">&nbsp;&nbsp;&nbsp;
											TEXT<input type=radio name="contentType" value="TEXT" checked>
										</td>
									</tr>
									<tr>
										<td colspan="2"><hr /></td>
									</tr>
									<tr>
										<td colspan="2"><input type="submit" value="등록">
											<input type="reset" value="다시쓰기"> <input
											type="button" value="리스트"
											onClick="javascript:location.href='list.jsp'"></td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
					<input type="hidden" name="ip" value="<%=request.getRemoteAddr()%>">
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

