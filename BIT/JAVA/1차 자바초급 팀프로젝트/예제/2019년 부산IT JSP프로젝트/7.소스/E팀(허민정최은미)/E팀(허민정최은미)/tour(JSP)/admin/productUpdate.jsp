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
				<table width="75%" align="center">
					<tr>
						<td align="center">
							<form method="post" action="productProc.jsp?flag=update"
								enctype="multipart/form-data">
								<table width="95%" align="center">
									<tr bgcolor="black">
										<td colspan="2" align="center"><font color="#FFFFFF"><b>상품수정</b></font></td>
									</tr>
									<tr>
										<td width="31%" align="center">상품이름</td>
										<td width="69%" align="left"><input name="proname"
											value="<%=product.getProName()%>"></td>
									</tr>
									<tr>
										<td width="31%" align="center">업체이름</td>
										<td width="69%" align="left"><input name="coname"
											value="<%=product.getCoName()%>"></td>
									</tr>
									<tr>
										<td height="21" align="center">어른가격</td>
										<td align="left"><input name="adultprice" size="20"
											value="<%=product.getAdultPrice()%>">원</td>
									</tr>
									<tr>
										<td height="21" align="center">어린이가격</td>
										<td align="left"><input name="childprice" size="20"
											value="<%=product.getChildPrice()%>">원</td>
									</tr>
									<tr>
										<td align="center">상품내용</td>
										<td><textarea rows="10" cols="45" name="detail"><%=product.getDetail()%></textarea>
										</td>
									</tr>

									<tr>
										<td colspan="2" align="center"><input type="submit"
											value="제품수정">&nbsp;&nbsp;&nbsp; <input type="reset"
											value="다시쓰기"></td>
									</tr>
								</table>
								<input type=hidden name="no" value="<%=product.getNo()%>">
							</form>
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
	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>
