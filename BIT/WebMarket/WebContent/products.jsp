<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<title>상품목록</title>
</head>

<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 목록</h1>
		</div>
	</div>
	<%@ include file="dbconn.jsp"%>
	<div class="container">
		<div class="row text-center">
			<% 
				//리스트에서 제품 목록을 가져온다.
				String sql = "select * from product";
				
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
			%>
			<div class="col-md-4">
				<img src="/upload/<%=rs.getString("p_fileName")%>" class="w-100" />
				<h3><%=rs.getString("p_name")%></h3>
				<p><%=rs.getString("p_description")%></p>
				<p><%=rs.getInt("p_unitPrice")%>원
				</p>
				<p>
					<a href="product.jsp?id=<%=rs.getString("p_id")%>" class="btn btn-secondary">상세정보 &raquo;</a>
			</div>
			<%
				}
			//DB연결을 닫는다.
			if (rs != null) 	rs.close();   
	        if (pstmt != null)  pstmt.close();
	        if (conn != null)   conn.close();

			%>
		</div>
		<hr>
	</div>
	<jsp:include page="footer.jsp" />
</body>

</html>