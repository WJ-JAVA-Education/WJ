<%@ page errorPage="exceptionNoProductId.jsp" %>
<html>
<head>
<link rel="stylesheet" 	href="resources/css/bootstrap.min.css">
<title>상품 상세 정보</title>
</head>
<script type="text/javascript">
function addToCart(){
	if(confirm("상품을 장바구니에 추가하시겠습니까?")) {
			        //a태그를 실행해서 장바구니에 담는다.
	} else {
		return false; //a 태그 동작을 취소한다.
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
	<%@ include file="dbconn.jsp" %>
	<%
		String id = request.getParameter("id");
		//아이디로 그 제품정보를 가져온다.
		String sql = "select * from product where p_id=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		rs = pstmt.executeQuery();
		if(rs.next()){
	%>
	<div class="container">
		<div class="row">
			<div class="col-md-5">
				<img src="/upload/<%=rs.getString("p_fileName")%>" class="w-100" />
			</div>
			<div class="col-md-6">
				<h3><%=rs.getString("p_name")%></h3>
				<p><%=rs.getString("p_description")%>%>
				<p><b>상품 코드 : </b><span class="badge badge-danger"> <%=rs.getString("p_id")%></span>
				<p><b>제조사</b> : <%=rs.getString("p_manufacturer")%>
				<p><b>분류</b> : <%=rs.getString("p_category")%>
				<p><b>재고 수</b> : <%=rs.getLong("p_unitsInStock")%>
				<h4><%=rs.getInt("p_unitPrice")%>원</h4>
				<p>
					<a onclick="return addToCart();" href="addCart.jsp?id=<%=rs.getString("p_id")%>" class="btn btn-info"> 상품 주문 &raquo;</a> 
				    <a href="cart.jsp" class="btn btn-warning"> 장바구니 &raquo;</a>
				    <a href="products.jsp" class="btn btn-secondary"> 상품 목록 &raquo;</a>
				</p> 
			</div>
		</div>
		<hr>
	</div>
	<%
		}
		//DB연결을 닫는다.
		if (rs != null) 	rs.close();   
        if (pstmt != null)  pstmt.close();
        if (conn != null)   conn.close();
	%>
	<jsp:include page="footer.jsp" />
</body>
</html>
