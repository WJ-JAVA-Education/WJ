癤?%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="dto.Product"%>
<jsp:useBean id="productDAO" class="dao.ProductRepository" scope="session" />
<html>
<head>
<link rel="stylesheet" 	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>?곹뭹 ?곸꽭 ?뺣낫</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">?곹뭹 ?뺣낫</h1>
		</div>
	</div>
	<%
		String id = request.getParameter("id");
		Product product = productDAO.getProductById(id);
	%>
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<h3><%=product.getPname()%></h3>
				<p><%=product.getDescription()%>
				<p><b>?곹뭹 肄붾뱶 : </b><span class="badge badge-danger"> <%=product.getProductId()%></span>
				<p><b>?쒖“??/b> : <%=product.getManufacturer()%>
				<p><b>遺꾨쪟</b> : <%=product.getCategory()%>
				<p><b>?ш퀬 ??/b> : <%=product.getUnitsInStock()%>
				<h4><%=product.getUnitPrice()%>??/h4>
				<p><a href="#" class="btn btn-info"> ?곹뭹 二쇰Ц &raquo;</a> <a	href="./products.jsp" class="btn btn-secondary"> ?곹뭹 紐⑸줉 &raquo;</a>
			</div>
		</div>
		<hr>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>
