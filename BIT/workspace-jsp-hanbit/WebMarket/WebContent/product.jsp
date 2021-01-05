<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>
<%@ page errorPage="exceptionNoProductId.jsp" %>

<html>
<head>
<link rel="stylesheet" 	href="resources/css/bootstrap.min.css">
<title>상품 상세 정보</title>
</head>
<script type="text/javascript">
function addToCart(){
	if(confirm("상품을 장바구니에 추가하시겠습니까?")) {
		return;	        //a태그를 실행해서 장바구니에 담는다.
	} else {
		return false;  //a태그의 동작을 멈춘다.
	}	
}
</script>
<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 정보</h1>
		</div>
	</div>
	<%
		String id = request.getParameter("id");
		ProductRepository dao = ProductRepository.getInstance();
		Product product = dao.getProductById(id);
	%>
	<div class="container">
		<div class="row">
			<div class="col-md-5">
				<img src="/upload/<%=product.getFilename()%>" class="w-100" />
			</div>
			<div class="col-md-6">
				<h3><%=product.getPname()%></h3>
				<p><%=product.getDescription()%>
				<p><b>상품 코드 : </b><span class="badge badge-danger"> <%=product.getProductId()%></span>
				<p><b>제조사</b> : <%=product.getManufacturer()%>
				<p><b>분류</b> : <%=product.getCategory()%>
				<p><b>재고 수</b> : <%=product.getUnitsInStock()%>
				<h4><%=product.getUnitPrice()%>원</h4>
				<p>
					<a onclick="addToCart();" href="addCart.jsp?id=<%=product.getProductId()%>" class="btn btn-info"> 상품 주문 &raquo;</a> 
				    <a href="cart.jsp" class="btn btn-warning"> 장바구니 &raquo;</a>
				    <a href="products.jsp" class="btn btn-secondary"> 상품 목록 &raquo;</a>
				</p> 
			</div>
		</div>
		<hr>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>
