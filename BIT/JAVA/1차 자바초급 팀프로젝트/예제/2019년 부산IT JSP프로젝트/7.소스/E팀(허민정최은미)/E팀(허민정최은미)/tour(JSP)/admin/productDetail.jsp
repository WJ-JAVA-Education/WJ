<%@ page contentType="text/html;charset=EUC-KR"%>
<%@ page import="java.util.*,tour.*"%>
<jsp:useBean id="pMgr" class="tour.ProductMgr" />
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
<body bgcolor="#996600" topmargin="100">
	<%@ include file="top.jsp"%>
	<!-- Page Content -->
	<div class="container">

		<div class="row">
			<%@ include file="left.jsp"%>
			<div class="col-lg-9">
				<%
					int no = Integer.parseInt(request.getParameter("no"));
					ProductBean product = pMgr.getProduct(no);
				%>
				<br><br><br>
				<table width="80%" align="center" >
					<tr>
						<td align="center" >
							<table width="95%" align="center" >
								<tr bgcolor="black">
									<td colspan="3" align="center"><font color="#FFFFFF"><b><%=product.getProName()%></b></font></td>
								</tr>
								<tr>

									<td width="30%" valign="top">
										<table border="1" width="100%" height="100%">
											<tr>
												<td><b>상품이름 : </b><%=product.getProName()%></td>
											</tr>
											<tr>
												<td><b>업체이름 : </b><%=product.getCoName()%></td>
											</tr>
											<tr>
												<td><b>어른가격 : </b><%=UtilMgr.intFormat(product.getAdultPrice())%></td>
											</tr>
											<tr>
												<td><b>어린이가격 : </b><%=UtilMgr.intFormat(product.getChildPrice())%></td>
											</tr>

										</table>
									</td>
									<td width="50%" valign="top"><b>상세설명</b><br /> <pre><%=product.getDetail()%></pre></td>
								</tr>
								<tr>
									<td colspan="3" align="center"><a
										href="javascript:productUpdate('<%=product.getNo()%>')">수정하기</a>&nbsp;&nbsp;&nbsp;&nbsp;
										<a href="javascript:productDelete('<%=product.getNo()%>')">삭제하기</a>
									</td>
								</tr>
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
	<form name="update" method="post" action="productUpdate.jsp">
		<input type=hidden name=no>
	</form>
	<form name="del" method="post" action="productProc.jsp?flag=delete">
		<input type=hidden name=no>
	</form>
	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>


