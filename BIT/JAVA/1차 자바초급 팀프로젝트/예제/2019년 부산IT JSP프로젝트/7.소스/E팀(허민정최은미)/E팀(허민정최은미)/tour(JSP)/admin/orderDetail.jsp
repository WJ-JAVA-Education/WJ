<%@ page contentType="text/html;charset=EUC-KR"%>
<%@ page import="java.util.*,tour.*"%>
<jsp:useBean id="orderMgr" class="tour.OrderMgr" />
<jsp:useBean id="pMgr" class="tour.ProductMgr" />
<jsp:useBean id="mMgr" class="tour.MemberMgr" />
<%
		request.setCharacterEncoding("EUC-KR");
		int no = Integer.parseInt(request.getParameter("no"));
		OrderBean order = orderMgr.getOrderDetail(no);
		ProductBean product = pMgr.getProduct(order.getProductNo());
		String id = order.getId();
		MemberBean member = mMgr.getMember(id);
		int QuantityTotal = order.getQuantity1() +order.getQuantity2();
%>
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
<%@ include file="top.jsp"%>
	<!-- Page Content -->
  <div class="container">

    <div class="row">
    <%@ include file="left.jsp" %>
     <div class="col-lg-9">
     <br><br><br>
<table width="75%" align="center" >
	<tr>
		<td align="center" >
		<form method="post" name="order" action="orderProc.jsp">
		<table width="95%" align="center"  class="table">
			<tr bgcolor="black">
				<td colspan="2" align="center">
					<font color="#FFFFFF"><b>주문상세내역</b></font>
				</td>
			</tr>
			<tr align="center">
				<td>고객아이디</td>
				<td><%=order.getId()%></td>
			</tr>
			<tr align="center">
				<td>주문번호</td>
				<td><%=order.getNo()%></td>
			</tr>
			<tr align="center">
				<td>상품</td>
				<td><%=product.getProName()%></td>
			</tr>
			<tr align="center">
				<td>어른가격</td>
				<td><%=UtilMgr.intFormat(product.getAdultPrice())%>원</td>
			</tr>
			<tr align="center">
				<td>어린이가격</td>
				<td><%=UtilMgr.intFormat(product.getChildPrice())%>원</td>
			</tr>
			<tr align="center">
				<td>어른인원</td>
				<td><%=order.getQuantity1()+ ""%>명</td>
			</tr>
			<tr align="center">
				<td>어린이인원</td>
				<td><%=order.getQuantity2()+ ""%>명</td>
			</tr>
			<tr align="center">
				<td>총인원</td>
				<td><%=QuantityTotal + ""%>명</td>
			</tr>
			<tr align="center">
				<td>주문날짜</td>
				<td><%=order.getDate()%></td>
			</tr>
			<tr align="center">
				<td>투어날짜</td>
				<td><%=order.getTourdate()%></td>
			</tr>
			<tr align="center">
				<td>금액</td>
				<td><%=UtilMgr.intFormat((order.getQuantity1() * product.getAdultPrice())+(order.getQuantity2() * product.getChildPrice()))%>원</td>
			</tr>
			<tr align="center">
				<td>이메일</td>
				<td><%=member.getEmail()%></td>
			</tr>
			<tr align="center">
				<td>주문상태</td>
				<td><select name="state">
					<option value="1">견적접수</option>
					<option value="2">입금확인</option>
					<option value="3">투어진행</option>
					<option value="6">완료</option>
				</select> <script>
			document.order.state.value=<%=order.getState()%>
		</script></td>
			</tr>
			<tr align="center">
				<td colspan="2">
					<input type="button" value="수정"
					size="3" onclick="javascript:orderUpdate(this.form)"> / <input
					type="button" value="삭제" size="3"
					onclick="javascript:orderDelete(this.form)">
				</td>
			</tr>
		</table>
		<input type="hidden" name="no" value="<%=order.getNo()%>"> <input
			type="hidden" name="flag">
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
 <%@ include file="bottom.jsp" %>
 <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>
