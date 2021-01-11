<%@ page contentType="text/html; charset=utf-8"%>

<html>
<head>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
<title>배송 정보</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">배송 정보</h1>
		</div>
	</div>
	<div class="container">
		<form name="shipForm" action="./processShippingInfo.jsp" class="form-horizontal" method="post">
			<input type="hidden" name="cartId" value="<%=request.getParameter("cartId")%>" />
			<div class="form-group row">
				<label class="col-sm-2">성명</label>
				<div class="col-sm-3">
					<input id="name" name="name" type="text" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">배송일</label>
				<div class="col-sm-3">
					<input name="shippingDate" type="date" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">국가명</label>
				<div class="col-sm-3">				
					<select name="country" id="country" class="form-control">
						<option value="Korea">대한민국</option>
						<option value="America">미국</option>
						<option value="Japan">일본</option>
						<option value="China">중국</option>
					</select>
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">우편번호</label>
				<div class="col-sm-3">
					<input name="zipCode" class="form-control" type="text" id="postcode" placeholder="우편번호">
				</div>
				<div class="col-sm-4 col-md-2">
					<input type="button" class="form-control btn btn-success" onclick="execDaumPostcode()" value="우편번호 찾기"><br>
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">주소</label>
				<div class="col-sm-5">
					<input name="addressName" class="form-control" type="text" id="address" placeholder="주소">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2"></label>
				<div class="col-sm-4">
					<input type="text" class="form-control" id="detailAddress" placeholder="상세주소">
				</div>
				<div class="col-sm-3">
					<input type="text" id="extraAddress" class="form-control" placeholder="참고항목">
				</div>
			</div>
			<div class="form-group row">
				<div class="col-sm-offset-2 col-sm-10 ">
					<a href="./cart.jsp?cartId=<%=request.getParameter("cartId")%>" class="btn btn-secondary" role="button"> 이전 </a> 
					<input onclick="return shipCheck();" type="submit" class="btn btn-primary" value="등록" />
					<a href="./checkOutCancelled.jsp" class="btn btn-secondary" role="button"> 취소 </a>
				</div>
			</div>
		</form>
	</div>
	<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script src="resources/js/shipping.js"></script>
</body>
</html>





