<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>
<%@ page import="java.util.ArrayList"%>

<html>
<head>
	<link rel="stylesheet" href="resources/css/bootstrap.min.css">
	<title>상품 목록</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
		<div class="jumbotron">
			<div class="container">
				<h1 class="display-3">
					상품 목록
				</h1>
			</div>
		</div>
	<% 
		ProductRepository dao = ProductRepository.getInstance();
		ArrayList<Product> listOfProduct = dao.getAllProducts();
	%>
	<div class="container">
		<div class="row text-center">
			<%
				for(int i=0; i< listOfProduct.size(); i++){
					Product product = listOfProduct.get(i);
			%>
			<div class="col-md-4">
				<img src="/upload/<%=product.getFilename()%>" class="w-100" />
				<h3><%=product.getPname()%></h3>
				<p><%=product.getDescription()%></p>
				<p><%=product.getUnitPrice()%>원</p>
				<p><a href="product.jsp?id=<%=product.getProductId()%>" class="btn btn-secondary">상세정보  &raquo;</a>
			</div>
			<%
				}
			%>
		</div>
		<hr>
	</div>
	<jsp:include page="footer.jsp" />
</body>

</html>