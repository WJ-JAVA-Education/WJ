<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product "%>
<%@ page import="dao.ProductRepository"%>
<html>
<head>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<title>상품 상세 정보</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품정보</h1>
		</div>
	</div>
	<%	String id = request.getParameter("id");
		ProductRepository dao = ProductRepository.getInstance();
		ArrayList<Product> listOfProduct = dao.getAllProducts();
	%>

	<div class="container">
		<div class="row text-left">
			<%
				for (int i = 0; i < listOfProduct.size(); i++) {
			    Product product = listOfProduct.get(i);
			%>
			<div class="col-md-4">
				<img src="/upload/<%= product.getFilename() %>" width=100%>
				<h3><%=product.getPname()%></h3>
				<p><%=product.getDescription()%>
				<p><%=product.getUnitPrice()%>원
				<p>
					<a href="./product.jsp?id=<%=product.getProductId()%>" class="btn btn-secondary" role="button">	상세 정보 &raquo;</a>
			</div>
			<%
				}
			%>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>

</html>
