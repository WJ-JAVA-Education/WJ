<%@ page contentType="text/html; charset=EUC-KR"%>
<html>
<head>
<title>Tour Mall </title>
<style>
html, body { margin: 0; padding: 0; height: 100%; }
.header {
	width: 100%; height: 25%; 
	background: darkblue;
	color : white;
}
.nav { 
	width: 25%; height: 70%; float: left;
	background: lightblue;
}
.section {
	width: 75%; height: 70%; float: left;
	background: steelgray;
}

.footer { 
	width: 100%; height: 5%; clear: both; 
	background: gray;
}
</style>

</head>
<body>
<div id = container>
	<header class="header">
	<div id = head>
		<div id = head_left style="width:20%;">
		 	<%@ include file="login.jsp" %>
	 	</div>
	 	<div id = head-right>
	 	</div>
	 	</div>
	</header>
	<nav class="nav">
	<div>
		<ul>
			<li><a target="main" href="cost.jsp">견적요청</a></li>
			<li><a target="main" href="cartList.jsp">장바구니</a></li>
			<li><a target="main" href="productList.jsp">상품안내</a></li>
			<li><a target="main" href="list.jsp">게시판</a></li>
			<li><a target="main" href="">회원탈퇴</a></li>
		</ul>
		</div>
	</nav>
	<section class="section">
		<article><iframe Name="main" width="100%" height="100%" src="hp.bmp" FrameBorder=0></iframe></article>
	</section>
	<footer class="footer">Copyright 2019 Tour</footer>
</div>
</body>
</html>
