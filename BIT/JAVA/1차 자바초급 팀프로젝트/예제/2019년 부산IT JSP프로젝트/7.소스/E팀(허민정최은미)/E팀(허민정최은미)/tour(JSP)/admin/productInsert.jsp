<%@ page contentType="text/html;charset=EUC-KR"%>
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
			<br><br><br>
				<form method="post" action="productProc.jsp?flag=insert"
					enctype="multipart/form-data">
					<table width="75%" align="center" >
						<tr>
							<td align="center" >
								<table width="95%">
									<tr bgcolor="black">
										<td colspan="2" align="center"><font color="#FFFFFF"><b>상품
												등록</font></b></td>
									</tr>
									<tr>
										<td align="center">카테고리</td>
										<td align="left"><select name="category">
											<option value="1">놀거리</option>
											<option value="2">마사지</option>
											<option value="3">투어</option>
											<option value="4">기타</option>
										</select> 
										</td>
									</tr>
									<tr>
										<td align="center">상품이름</td>
										<td align="left"><input name="proname" size="20"></td>
									</tr>
									<tr>
										<td align="center">업체이름</td>
										<td align="left"><input name="coname" size="20"></td>
									</tr>
									<tr>
										<td align="center">상품설명</td>
										<td><textarea rows="10" cols="45" name="detail"></textarea></td>
									</tr>
									<tr>
										<td align="center">어른가격</td>
										<td><input name="adultprice" size="20">원</td>
									</tr>
									<tr>
										<td align="center">어린이가격</td>
										<td><input name="childprice" size="20">원</td>
									</tr>
									<tr>
										<td colspan="2" align="center"><input type="submit"
											value="상품등록">&nbsp;&nbsp;&nbsp; <input type="reset"
											value="다시쓰기"></td>
									</tr>
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

