<%@ page pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>tour cost pro</title>

<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/shop-homepage.css" rel="stylesheet">
<script type="text/javascript">
		$(document).ready(function(){
			$("div.list").hide();
			$("div.m").mouseover(function(){
				$("div.list").slideToggle("fast");
			});
		});
	</script>
<script type="text/javascript">
		$(document).ready(function(){
			$("div.list2").hide();
			$("div.m2").mouseover(function(){
				$("div.list2").slideToggle("fast");
			});
		});
	</script>
<script type="text/javascript">
		$(document).ready(function(){
			$("div.list3").hide();
			$("div.m3").mouseover(function(){
				$("div.list3").slideToggle("fast");
			});
		});
	</script>

</head>
<body>
	<!-- Page Content -->
	<div class="col-lg-3">

		<h4 class="my-4">간편 견적</h4>
		<div class="list-group">
			<div class="m">
			<a href="costMgr.jsp" class="list-group-item">주문리스트</a>
			</div>
			<div class="list">
			<a href="costMgr01.jsp" class="list-group-item">견적접수 리스트</a>
			<a href="costMgr02.jsp" class="list-group-item">견적발송 리스트</a> 
			<a href="costMgr03.jsp" class="list-group-item">입금확인 리스트</a> 
			<a href="costMgr04.jsp" class="list-group-item">투어진행 리스트</a> 
			<a href="costMgr05.jsp" class="list-group-item">완료 리스트</a> 
			</div>
		</div>
		
		<h4 class="my-4">회원 견적</h4>
		<div class="list-group">
		<div class="m2">
			<a href="orderMgr.jsp" class="list-group-item">주문리스트</a>
		</div>	
		<div class="list2">
			<a href="orderMgr01.jsp" class="list-group-item">견적접수 리스트</a>
			<a href="orderMgr02.jsp" class="list-group-item">입금확인 리스트</a> 
			<a href="orderMgr03.jsp" class="list-group-item">투어진행 리스트</a> 
			<a href="orderMgr04.jsp" class="list-group-item">완료 리스트</a> 
		</div>	
		</div>

		<h4 class="my-4">상품 관리</h4>
		<div class="list-group">
			<a target="main" href="productInsert.jsp" class="list-group-item">상품입력</a> 
			<div class="m3">
			<a href="productMgr.jsp" class="list-group-item">전체 상품리스트</a>
			</div>
			<div class="list3">
			<a href="productMgr01.jsp" class="list-group-item">놀거리</a>
			<a href="productMgr02.jsp" class="list-group-item">마사지</a>
			<a href="productMgr03.jsp" class="list-group-item">투어</a>
			<a href="productMgr04.jsp" class="list-group-item">기타</a>
			</div>
		</div>

		<h4 class="my-4">고객정보 확인</h4>
		<div class="list-group">
			<a target="main" href="memberMgr.jsp" class="list-group-item">고객
				리스트</a>
		</div>

		<h4 class="my-4">게시판</h4>
		<div class="list-group">
			<a target="main" href="list.jsp" class="list-group-item">게시판 보기</a></br>
		</div>
	</div>
	<!-- /.col-lg-3 -->
	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>
