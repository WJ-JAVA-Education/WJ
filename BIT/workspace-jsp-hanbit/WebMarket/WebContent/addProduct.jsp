<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<html>

	<head>
		<link rel="stylesheet" href="resources/css/bootstrap.min.css">
		<script type="text/javascript" src="resources/js/validation.js"></script>
		<title>상품 등록</title>
	</head>

	<body>
		<jsp:include page="menu.jsp" />
		<div class="jumbotron">
			<div class="container">
				<h1 class="display-3">상품 등록</h1>
			</div>
		</div>


		<div class="container">
			<form id="newProduct" name="newProduct" enctype="multipart/form-data" action="processAddProduct.jsp" method="POST">
				<div class="form-group row">
					<label class="col-sm-2">상품 코드</label>
					<div class="col-sm-3">
						<input type="text" id="productId" name="productId" class="form-control">
					</div>
				</div>

				<div class="form-group row">
					<label class="col-sm-2">상품명</label>
					<div class="col-sm-3">
						<input type="text" id="name" name="name" class="form-control">
					</div>
				</div>

				<div class="form-group row">
					<label class="col-sm-2">상품 가격</label>
					<div class="col-sm-3">
						<input type="text" id="unitPrice" name="unitPrice" class="form-control">
					</div>
				</div>

				<div class="form-group row">
					<label class="col-sm-2">상세정보</label>
					<div class="col-sm-3">
						<textarea name="description" id="description" cols="50" rows="2" class="form-control"></textarea>
					</div>
				</div>


				<div class="form-group row">
					<label class="col-sm-2">제조사</label>
					<div class="col-sm-3">
						<input type="text" id="manufacturer" name="manufacturer" class="form-control">
					</div>
				</div>

				<div class="form-group row">
					<label class="col-sm-2">분류</label>
					<div class="col-sm-3">
						<input type="text" id="catergory" name="catergory" class="form-control">
					</div>
				</div>

				<div class="form-group row">
					<label class="col-sm-2">재고수</label>
					<div class="col-sm-3">
						<input type="text" id="unitsInStock" name="unitsInStock" class="form-control">
					</div>
				</div>

				<div class="form-group row">
					<label class="col-sm-2">상태</label>
					<div class="col-sm-5">
						<input type="radio" id="condition" name="condition" value="New" checked> 신규 제품 <input type="radio"
							name="condition" value="Old"> 중고 제품 <input type="radio" name="condition"
							value="Refurbished"> 재생 제품
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2">이미지</label>
					<div class="col-sm-5">
						<input type="file" id="productImage" name="productImage" class="form-control"> 
					</div>
				</div>

				<div class="form-group row">
					<div class="col-offset-2" col-sm-10">
					<input type="button" onclick="CheckAddProduct()" class="btn btn-primary" value="등록">
					</div>
				</div>

			</form>
		</div>
		<jsp:include page="footer.jsp" />
	</body>

	</html>