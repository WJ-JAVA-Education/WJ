<%@page import="tour.UtilMgr"%>
<%@page import="tour.ProductBean"%>
<%@page import="tour.OrderBean"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html; charset=EUC-KR"%>
<%request.setCharacterEncoding("EUC-KR");%>
<jsp:useBean id="orderMgr" class="tour.OrderMgr"/>
<jsp:useBean id="pMgr" class="tour.ProductMgr"/>
<%
	String id = (String)session.getAttribute("idKey");		
	if(session.getAttribute("idKey")==null){
			response.sendRedirect("guestLogin.jsp");
		}
%>
<html>
<head>
<title>Tour Mall</title>

<script src="script.js"></script>
</head>
<body bgcolor="#FFFFCC">
	<%@ include file="top.jsp"%>

	<!-- Page Content -->
	<div class="container">

		<div class="row">
			<%@ include file="left.jsp"%>
			<div class="col-lg-9">
				<br />
				<br /><br>
	<table width="75%" align="center" class="table">
	<tr> 
	<td align="center" >
		<table width="95%" >
		<tr bgcolor="black" align="center"> 
		<td><b><font color="#FFFFFF">주문번호</b></font></td>
		<td><b><font color="#FFFFFF">여행상품</b></font></td>
		<td><b><font color="#FFFFFF">여행인원</b></font></td>
		<td><b><font color="#FFFFFF">여행날짜</b></font></td>
		<td><b><font color="#FFFFFF">여행시간</b></font></td>
		<td><b><font color="#FFFFFF">토탈비용</b></font></td>
		<td><b><font color="#FFFFFF">여행상태</b></font></td>
		</tr>
		<%
				Vector<OrderBean> vlist = orderMgr.getOrder(id);
				if(vlist.isEmpty()){
		%>
		<tr>
			<td colspan="5">
			주문하신 물품이 없습니다.
			</td>
		</tr>
		<%			
				}else{
					for(int i=0;i<vlist.size();i++){
						OrderBean order = vlist.get(i);
						int productNo = order.getProductNo();
						ProductBean pbean = pMgr.getProduct(productNo);
						ProductBean product = pMgr.getProduct(order.getProductNo());
		%>
		<tr align="center">
			<td><%=order.getNo()%></td>
			<td><a href="javascript:productDetail('<%=productNo%>')"><%=pbean.getProName()%></a></td>
			<td>어른:<%=order.getQuantity1()%>아동:<%=order.getQuantity2()%></td>
			<td><%=order.getTourdate()%></td>
			<td><%=order.getTourtime()%></td>
			<td><%=UtilMgr.intFormat((order.getQuantity1() * product.getAdultPrice())+(order.getQuantity2() * product.getChildPrice()))%></td>
			<td>
				<%
					switch(order.getState()){
					case "1": out.print("견적접수"); break;
					case "2": out.print("입금확인"); break;
					case "3": out.print("투어진행"); break;
					case "6": out.print("완료"); break;
					}//--switch
				
				%>
			</td>
		</tr>
		<% 
					}//--for
				}//if-else
		%>
		</table> 
	</td>
	</tr>
	</table>
	<form name="detail" method="post" action="productDetail.jsp" >
	<input type="hidden" name="no">
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
