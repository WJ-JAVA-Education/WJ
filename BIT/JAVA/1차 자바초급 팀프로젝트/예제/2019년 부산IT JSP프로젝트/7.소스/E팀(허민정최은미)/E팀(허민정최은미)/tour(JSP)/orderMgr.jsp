<%@ page contentType="text/html;charset=EUC-KR" %>
<%@ page import="java.util.*, tour.*"%>
<jsp:useBean id="orderMgr" class="tour.OrderMgr" />
<jsp:useBean id="pMgr" class="tour.ProductMgr" />
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
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
	<%@ include file="top.jsp" %>
	<!-- Page Content -->
  <div class="container">

    <div class="row">
    <%@ include file="left.jsp" %>
     <div class="col-lg-9">
   <br><br>
	<table width="75%" align="center" class="table">
	<tr> 
	<td align="center" >

		<table width="95%" align="center" >
		<tr  align="center" bgcolor="black"> 
		<td><b><font color="#FFFFFF">주문번호</font></b></td>
		<td><b><font color="#FFFFFF">주문자</font></b></td>
		<td><b><font color="#FFFFFF">투어상품</font></b></td>
		<td><b><font color="#FFFFFF">인원</font></b></td>
		<td><b><font color="#FFFFFF">주문날짜</font></b></td>
		<td><b><font color="#FFFFFF">투어날짜</font></b></td>
		<td><b><font color="#FFFFFF">주문상태</font></b></td>
		<td><b><font color="#FFFFFF">상세보기</font></b></td>
		</tr>
		<%
		Vector vResult = orderMgr.getOrderList();
		if(vResult.size() ==0){
		%>
		<tr> 
		<td align="center" colspan="7">주문 내역이 없습니다</td>
		</tr>
		<%}else{
			for(int i=0; i< vResult.size(); i++){
			OrderBean order = (OrderBean)vResult.get(i);
			ProductBean product = pMgr.getProduct(order.getProductNo());
			int QuantityTotal = order.getQuantity1() +order.getQuantity2();
		%>
		<tr  align="center"> 
		<td><%=order.getNo()%></td>
		<td><%=order.getId()%></td>
		<td><%=product.getProName()%></td>
		<td><%=QuantityTotal%></td>
		<td><%=order.getDate()%></td>
		<td><%=order.getTourdate()%></td>
		
		<td>
		<%
				switch(Integer.parseInt(order.getState())){
					case 1 : out.println("견적접수");
					break;
					case 2 : out.println("입금확인");
					break;
					case 3 : out.println("투어진행");
					break;
					default : out.println("완료");
			}%>
		
		</td>
		<td align="center">
			<a href="javascript:orderDetail('<%=order.getNo()%>')">상세보기</a>
		</td>
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
 <%@ include file="bottom.jsp" %>
	
	<form name="detail" method="post" action="orderDetail.jsp" >
		<input type="hidden" name="no">
	</form>
	<!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>
