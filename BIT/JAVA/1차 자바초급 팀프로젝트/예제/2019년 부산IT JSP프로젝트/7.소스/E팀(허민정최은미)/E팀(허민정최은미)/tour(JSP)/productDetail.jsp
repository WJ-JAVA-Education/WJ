<%@page contentType="text/html; charset=EUC-KR"%>
<%@page import="tour.UtilMgr"%>
<%@page import="tour.ProductBean"%>
<jsp:useBean id="pMgr" class="tour.ProductMgr"/>
<%
		request.setCharacterEncoding("EUC-KR");
		int no = Integer.parseInt(request.getParameter("no"));
		ProductBean pbean = pMgr.getProduct(no);
%>
<html>
<head>
<title>상품상세</title>

<script src="script.js"></script>
</head>

<body bgcolor="#FFFFCC">
	<%@ include file="top.jsp"%>

	<!-- Page Content -->
	<div class="container">

		<div class="row">
			<%@ include file="left.jsp"%>
			<div class="col-lg-9">

<form name="cart" action="cartProc.jsp">
<br><br><br>
<table width="75%" align="center" class="table">
	<tr> 
	<td align="center" >
		<table width="95%" >
		<tr bgcolor="black"> 
		<td colspan="3" align="center">
			<font color="#FFFFFF"><b><%=pbean.getProName()%></b></font>
		</td>
		</tr>
		<tr> 
		
		<td width="30%" valign="top">
			<table>
			<tr>
				<td><b>상품이름 : <%=pbean.getProName()%></b></td>
			</tr>	
			<tr>
				<td><b>업체이름 : <%=pbean.getCoName()%></b></td>
			</tr>					
			<tr>
				<td><b>어른 가격 : <%=UtilMgr.monFormat(pbean.getAdultPrice())%></b>원</td>
			</tr>
			<tr>
				<td><b>어린이 가격 : <%=UtilMgr.monFormat(pbean.getChildPrice())%></b>원</td>
			</tr>
			<tr>
				<td><b>어른 수량 : </b><input name="quantity1" size="5" value="1">개</td>
			</tr>
			<tr>
				<td><b>어린이 수량 : </b><input name="quantity2" size="5" value="1">개</td>
			</tr>
			
			<tr>
				<td><b>투어요청일:</b><br/><input type="date" name="tourdate" ></td>
			</tr>
			<tr>
				<td><b>투어요청시간:</b><br/><input type="time" name="tourtime"></td>
			</tr>
			<br/>
			<tr>
			<td align="right">
				<input type="submit" value="장바구니 담기">
			</td>
			</tr>
			</table>
			<input type="hidden" name="productNo" value="<%=pbean.getNo()%>">	
			<input type="hidden" name="flag" value="insert">			
		</td>
		<td width="30%" valign="top">
		<b>상세설명</b><br/>
		<pre><%=pbean.getDetail()%></pre>
		</td>
		
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
