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
			<br><br>
				<table width="75%" align="center" class="table">
					<tr>
						<td align="center" >
							<table width="95%" align="center">
								<tr align="center" bgcolor="black">
									<td><b><font color="#FFFFFF">상품이름</font></b></td>
									<td><b><font color="#FFFFFF">업체이름</font></b></td>
									<td><b><font color="#FFFFFF">어른가격</font></b></td>
									<td><b><font color="#FFFFFF">어린이가격</font></b></td>
									
									<td>&nbsp;</td>
								</tr>
								<%
									Vector<ProductBean> vResult = pMgr.getcategoryList(1) ;
									if (vResult.size() == 0) {
								%>
								<tr>
									<td align="center" colspan="5">등록된 상품이 없습니다.</td>
								</tr>
								<%
									} else {
										for (int i = 0; i < vResult.size(); i++) {
											ProductBean product = vResult.get(i);
								%>
								<tr align="center">
									<td><%=product.getProName()%></td>
									<td><%=product.getCoName()%></td>
									<td><%=UtilMgr.intFormat(product.getAdultPrice())%></td>
									<td><%=UtilMgr.intFormat(product.getChildPrice())%></td>
									
									<td><a
										href="javascript:productDetail('<%=product.getNo()%>')">상세보기</a></td>
								</tr>
								<%
									} //for
									} //if
								%>
								<tr>
									
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
	<form name="detail" method="post" action="productDetail.jsp">
		<input type="hidden" name="no">
	</form>
	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>
