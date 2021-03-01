<%@ page contentType="text/html;charset=EUC-KR"%>
<%@ page import="java.util.*, tour.*"%>
<jsp:useBean id="cMgr" class="tour.CostMgr" />
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
<script>
function costDetail(no){
	document.detail.no.value=no;
	document.detail.submit();	
}
</script>
</head>
<body bgcolor="#996600" topmargin="100">

	<%@ include file="top.jsp"%>

	<!-- Page Content -->
	<div class="container">

		<div class="row">
			<%@ include file="left.jsp"%>
			<div class="col-lg-9">
	<br><br>
				
				<table align="center" class="table">
					<tr>
						<td align="center">

							<table align="center">
								<tr align="center" bgcolor="black">
									<td><b><font color="#FFFFFF">주문번호</font></b></td>
									<td><b><font color="#FFFFFF">이름</font></b></td>
									<td><b><font color="#FFFFFF">놀거리</font></b></td>
									<td><b><font color="#FFFFFF">마사지</font></b></td>
									<td><b><font color="#FFFFFF">투어</font></b></td>
									<td><b><font color="#FFFFFF">기타</font></b></td>
									<td><b><font color="#FFFFFF">총인원</font></b></td>
									<td><b><font color="#FFFFFF">여행일</font></b></td>
									<td><b><font color="#FFFFFF">주문상태</font></b></td>
									<td><b><font color="#FFFFFF">상세보기</font></b></td>
								</tr>
								<%
										Vector vResult = cMgr.getCostStateList("4");
										if(vResult.size() ==0){
										%>
										<tr> 
										<td align="center" colspan="7">주문 내역이 없습니다</td>
										</tr>
								<%}else{
								
									for (int i = 0; i < vResult.size(); i++) {
										CostBean cBean = (CostBean)vResult.get(i);
										int totalNum = cBean.getAdultNum() + cBean.getChildNum();
								%>
								<tr align="center">
									<td><%=cBean.getNum()%></td>
									<td><%=cBean.getName()%></td>
									<td><%=cBean.getSaleitem11()%></td>
									<td><%=cBean.getSaleitem22()%></td>
									<td><%=cBean.getSaleitem33()%></td>
									<td><%=cBean.getSaleitem44()%></td>
									<td><%=totalNum%></td>
									<td><%=cBean.getTourDay()%></td>
									<td>
										<%
												switch(Integer.parseInt(cBean.getState())){
													case 1 : out.println("견적접수");
													break;
													case 2 : out.println("견적발송");
													break;
													case 3 : out.println("입금확인");
													break;
													case 4 : out.println("투어진행");
													break;
													default : out.println("완료");
											}%>
										
										</td>
									
									<td><a href="javascript:costDetail('<%=cBean.getNum()%>')">상세보기</a></td>
									
								</tr>
								<%}
		}%>
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
	<form name="detail" method="post" action="costDetail.jsp">
		<input type=hidden name="no">
	</form>
	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>
