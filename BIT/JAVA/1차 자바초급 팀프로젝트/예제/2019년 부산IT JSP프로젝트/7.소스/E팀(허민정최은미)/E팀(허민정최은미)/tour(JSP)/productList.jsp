<!-- ProductList.jsp -->
<%@ page contentType="text/html; charset=EUC-KR" %>
<%@page import="tour.UtilMgr"%>
<%@page import="tour.ProductBean"%>
<%@page import="java.util.Vector"%>
<jsp:useBean id="pMgr" class="tour.ProductMgr"/>
<%
	Vector<ProductBean> pvlist = pMgr.getProductList();
%>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>상품 목록</title>

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
     <br><br>
	<table width="75%" align="center" class="table">
	<tr> 
	<td align="center">
		<table width="95%" align="center">
			<tr align="center" bgcolor="black">
				<td><font color="#FFFFFF">상품이름</font></td>
				<td><font color="#FFFFFF">업체이름</font></td>
				<td><font color="#FFFFFF">어른가격</font></td>
				<td><font color="#FFFFFF">어린이가격</font></td>
				<td><font color="#FFFFFF">상세보기</font></td>
			</tr>
		<% 
			for(int i =0; i<pvlist.size(); i++){
				ProductBean pbean = pvlist.get(i);
		%>
			<tr align="center"> 
				<td><%=pbean.getProName()%></td>
				<td><%=pbean.getCoName()%></td>
				<!--천단위 콤마 : UtilMgr의 메소드를 사용 -->
				<td><%=UtilMgr.monFormat(pbean.getAdultPrice())%></td>
				<td><%=UtilMgr.monFormat(pbean.getChildPrice())%></td>
				
				<td><input type="button" value="상세보기" 
			onclick="productDetail('<%=pbean.getNo()%>')" >
			</td>
		</tr>
		<%}//--for %>
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
  
