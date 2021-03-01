<%@ page contentType="text/html;charset=EUC-KR"%>
<%@ page import="java.util.*,tour.*"%>
<%
	request.setCharacterEncoding("EUC-KR");
%>
<jsp:useBean id="cBean" class="tour.CostBean" />
<jsp:setProperty name="cBean" property="*" />
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>간편견적 확인</title>
<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>

<body bgcolor="#996600">
	
	<!-- Page Content -->
	<div class="container">
		
			
			<div  align="center">
				<form name="regForm" method="post" action="costProc.jsp"
					class="form-horizontal" role="form">
					<h2 align="center">견적의뢰 내용확인</h2>
					<div class="form-group">
						<label class="col-sm-9 control-label"> <jsp:getProperty
								name="cBean" property="name" /> 님이 작성하신 내용입니다. 확인해 주세요
						</label>
					</div>
					<hr>
					<div class="form-group">
						<label for="name" class="col-sm-3 control-label">이름</label>
						<div class="col-sm-9">
							<input name="name"
								value="<jsp:getProperty name="cBean" property="name" />">
						</div>
					</div>
					<div class="form-group">
						<label for="email" class="col-sm-3 control-label">이메일</label>
						<div class="col-sm-9">
							<input name="email"
								value="<jsp:getProperty name="cBean" property="email" />">
						</div>
					</div>
					<div class="form-group">
						<label for="hp" class="col-sm-3 control-label">핸드폰</label>
						<div class="col-sm-9">
							<input name="hp"
								value="<jsp:getProperty name="cBean" property="hp" />">
						</div>
					</div>
					<div class="form-group">
						<label for="adultNum" class="col-sm-3 control-label">어른인원수</label>
						<div class="col-sm-9">
							<input name="adultNum"
								value="<jsp:getProperty name="cBean" property="adultNum" />">
						</div>
					</div>
					<div class="form-group">
						<label for="childNum" class="col-sm-3 control-label">아동인원수</label>
						<div class="col-sm-9">
							<input name="childNum"
								value="<jsp:getProperty name="cBean" property="childNum" />">
						</div>
					</div>
					<div class="form-group">
						<label for="hp" class="col-sm-3 control-label">아동생년월일</label>
						<div class="col-sm-9">
							<input name="childbirth"
								value="<jsp:getProperty name="cBean" property="childbirth" />">
						</div>
					</div>
					<div class="form-group">
						<label for="saleitem1" class="col-sm-3 control-label">놀거리</label>
						<div class="col-sm-9">
							<%
								if (cBean.getSaleitem1() != null) {

									String saleitem1[] = cBean.getSaleitem1();

									for (int i = 0; i < saleitem1.length; i++) {
										out.print("<input type=checkbox name=saleitem1" + " checked value=" + saleitem1[i] + ">"
												+ saleitem1[i]);
									}
								} else {
									out.println("선택된 놀거리가 없습니다.");
								}
							%>
						</div>
					</div>
					<div class="form-group">
						<label for="saleitem2" class="col-sm-3 control-label">마사지</label>
						<div class="col-sm-9">
							<%
								if (cBean.getSaleitem2() != null) {

									String saleitem2[] = cBean.getSaleitem2();

									for (int i = 0; i < saleitem2.length; i++) {
										out.print("<input type=checkbox name=saleitem2" + " checked value=" + saleitem2[i] + ">"
												+ saleitem2[i]);
									}
								} else {
									out.println("선택된 마사지가 없습니다.");
								}
							%>
						</div>
					</div>
					<div class="form-group">
						<label for="saleitem3" class="col-sm-3 control-label">투어</label>
						<div class="col-sm-9">
							<%
								if (cBean.getSaleitem3() != null) {

									String saleitem3[] = cBean.getSaleitem3();

									for (int i = 0; i < saleitem3.length; i++) {
										out.print("<input type=checkbox name=saleitem3" + " checked value=" + saleitem3[i] + ">"
												+ saleitem3[i]);
									}
								} else {
									out.println("선택된 투어가 없습니다.");
								}
							%>
						</div>
					</div>
					<div class="form-group">
						<label for="saleitem4" class="col-sm-3 control-label">기타</label>
						<div class="col-sm-9">
							<%
								if (cBean.getSaleitem4() != null) {

									String saleitem4[] = cBean.getSaleitem4();

									for (int i = 0; i < saleitem4.length; i++) {
										out.print("<input type=checkbox name=saleitem4" + " checked value=" + saleitem4[i] + ">"
												+ saleitem4[i]);
									}
								} else {
									out.println("선택된 기타항목이 없습니다.");
								}
							%>
						</div>
					</div>
					<div class="form-group">
						<label for="tourDay" class="col-sm-3 control-label">투어요청일</label>
						<div class="col-sm-9">
							<input name="tourDay" size="30"
								value="<jsp:getProperty name="cBean" property="tourDay" />">
						</div>
					</div>
					<div class="form-group">
						<label for="tourTime" class="col-sm-3 control-label">투어시간</label>
						<div class="col-sm-9">
							<input name="tourTime" size="30"
								value="<jsp:getProperty name="cBean" property="tourTime" />">
						</div>
					</div>
					<div class="form-group">
						<label for="tourTime" class="col-sm-3 control-label">기타요청사항</label>
						<div class="col-sm-9">
							<input name="comment"
								value="<jsp:getProperty name="cBean" property="comment" />">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-9 col-sm-offset-3" align="center">
							<input type="submit" value="확인완료"> &nbsp; &nbsp; &nbsp;
							&nbsp; &nbsp; &nbsp; <input type="button" value="다시쓰기"
								onClick="history.back()">
						</div>
					</div>
				</form>


			</div>
			<!-- /.col-lg-9 -->
			</div>
	<!-- /.container -->
	
	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>

