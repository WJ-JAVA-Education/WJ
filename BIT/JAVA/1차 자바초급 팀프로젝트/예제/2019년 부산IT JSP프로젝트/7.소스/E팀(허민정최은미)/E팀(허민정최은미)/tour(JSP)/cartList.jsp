<%@page import="tour.UtilMgr"%>
<%@page import="tour.ProductBean"%>
<%@page import="java.util.Enumeration"%>
<%@page import="tour.OrderBean"%>
<%@page import="java.util.Hashtable"%>
<%@page contentType="text/html; charset=EUC-KR"%>
<%request.setCharacterEncoding("EUC-KR");%>
<jsp:useBean id="cMgr" scope="session" class="tour.CartMgr"/>
<jsp:useBean id="pMgr" class="tour.ProductMgr"/>
<% 
		if(session.getAttribute("idKey")==null){
			response.sendRedirect("login.jsp");
		}
%>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>장바구니</title>

  <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="css/shop-homepage.css" rel="stylesheet">
	<script src="script.js"></script>
</head>

<body>
<%@ include file="top.jsp" %>

<!-- Page Content -->
  <div class="container">

    <div class="row">
    <%@ include file="left.jsp" %>
     <div class="col-lg-9">

	<br><br><br>
	<table width="100%" align="center" class="table">
	<tr>
	<td align="center">
		<table width=900 align="center">
			<tr align="center" bgcolor="black">
				<td><font color="#FFFFFF"><b>제품</b></font></td>
				<td><font color="#FFFFFF"><b>예약일</b></font></td>
				<td><font color="#FFFFFF"><b>수량</b></font></td>
				<td><font color="#FFFFFF"><b>가격</b></font></td>
				<td><font color="#FFFFFF"><b>수정/삭제</b></font></td>
				<td><font color="#FFFFFF"><b>조회</b></font></td>
			</tr>
			<%
					int totalPrice = 0 ;
			  		Hashtable<Integer,OrderBean> hCart = cMgr.getCartList();
			  		if(hCart.isEmpty()) {
			  %>
			  <tr>
			  		<td colspan="5" align="center">
			  			장바구니는 비어 있습니다.
			  		</td>
			  </tr>
			  <% 	
			  		}else {
			  			//줄줄이 사탕 객체
			  			Enumeration<Integer> hCartkey = hCart.keys();
			  			//hasMoreElements:요소값이 더이상 있을 때 까지
			  			while(hCartkey.hasMoreElements()){
			  				//hCart에 저장된 주문객체를 리턴
			  				OrderBean order = hCart.get(hCartkey.nextElement());
			  				int productNo = order.getProductNo();
			  				//상품객체(상품가격,상품이름)
			  				ProductBean pbean = pMgr.getProduct(productNo);
			  				int adultprice = pbean.getAdultPrice();
			  				int childprice = pbean.getChildPrice();
			  				int quantity1 = order.getQuantity1();
			  				int quantity2 = order.getQuantity2();
			  				int quantityTotal = quantity1+ quantity2;
			  				int Total1 = adultprice * quantity1; // 상품총액
			  				int Total2 = childprice * quantity2; // 상품총액
			  				int subTotal = Total1+ Total2;
			  				totalPrice+=subTotal; // 주문전체총액
			  				String pName = pbean.getProName();
			  				String tourdate = order.getTourdate();
			  				String tourtime = order.getTourtime();
			  	%>
			  	<tr>
			  		<form method="post" action="cartProc.jsp">
			  			<input type="hidden" name= "productNo" value="<%=productNo%>">
			  			<input type="hidden" name="flag">
			  			<td><%=pName%></td>
			  			<td> 투어날짜: <input type="date" name="tourdate" value="<%=tourdate%>"  > <br/>
			  			투어시간: <input type="time" name="tourtime" value="<%=tourtime%>"  > 
			  			
			  			<td>
			  				어 른 : <input name="quantity1" size="2" value="<%=quantity1%>" >개<br/>
			  				어린이: <input name="quantity2" size="2" value="<%=quantity2%>" >개<br/><hr>
			  				total: <input name="quantityTotal" size="2" value="<%=quantityTotal%>" >개
			  			</td>
			  			<td><%=UtilMgr.monFormat(subTotal)%>원</td>
			  			<td>
			  				<input type="button" value="수정" size="2" onclick="javascript:cartUpdate(this.form)"> /
							<input type="button" value="삭제" size="2" onclick="javascript:cartDelete(this.form)">
			  			</td>
			  			<td>
			  				<a href="javascript:productDetail('<%=productNo%>')">상세보기</a>
			  			</td>
			  		</form>
			  	</tr>		
			  	<%}//while%>
			  	<tr>
			  		<td colspan="4" align="right">
			  			총 주문금액 : <%=UtilMgr.monFormat(totalPrice)%>
			  		</td>
			  		<td align="center">
			  			<a href = "orderProc.jsp">주문하기</a>
			  		</td>
			  	</tr>
			  	<%
			  		}//--if-else
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
 <%@ include file="bottom.jsp" %>
  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>
