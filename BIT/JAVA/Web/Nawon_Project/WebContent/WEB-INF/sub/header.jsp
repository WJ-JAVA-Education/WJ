<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="CSS/style.css" />
<link rel="stylesheet" href="CSS/reset.css" />
<link rel="stylesheet" href="CSS/bootstrap.min.css" />
<link rel="preconnect" href="https://fonts.gstatic.com" />

<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap"
	rel="stylesheet" />
<title>(주)나원이엔지</title>
</head>
<body>
	<div id="wrap">
		<div id="header">
			<div class="header">
				<!-- 헤더 시작 -->
				<div class="header_logo"></div>
				<h1>
					<a href="#"><img src="img/logo_img.jpg" alt="(주)나원이엔지" /></a>
				</h1>
				<!-- 헤더 로고 -->
				<div class="header_nav">
					<ol>
						<li><a href="#">회사소개</a></li>
						<li><a href="#">장비소개</a></li>
						<li><a href="#">채용</a></li>
						<li><a href="#">공지사항</a></li>
					</ol>
				</div>
				<!-- 헤더 네브 -->
				<div class="header_login">
					<a href="#">로그인</a>
				</div>
				<!-- 헤더 로그인 -->
			</div>
		</div>
		<!-- 헤더 끝 -->
		<div id="contents">
			<!-- 부트스트랩 -->
			<div id="img_slider" class="carousel slide" data-ride="carousel">
				<ol class="carousel-indicators">
					<li data-target="#img_slider" data-slide-to="0" class="active"></li>
					<li data-target="#img_slider" data-slide-to="1"></li>
					<li data-target="#img_slider" data-slide-to="2"></li>
				</ol>
				<div class="carousel-inner">
					<div class="carousel-item active">
						<img src="https://picsum.photos/1000/500" class="d-block w-100"
							alt="...">
						<div class="carousel-caption d-none d-md-block">
							<h5>First slide label</h5>
							<p>Some representative placeholder content for the first
								slide.</p>
						</div>
					</div>
					<div class="carousel-item">
						<img src="https://picsum.photos/1000/499" class="d-block w-100"
							alt="...">
						<div class="carousel-caption d-none d-md-block">
							<h5>Second slide label</h5>
							<p>Some representative placeholder content for the second
								slide.</p>
						</div>
					</div>
					<div class="carousel-item">
						<img src="https://picsum.photos/1000/498" class="d-block w-100"
							alt="...">
						<div class="carousel-caption d-none d-md-block">
							<h5>Third slide label</h5>
							<p>Some representative placeholder content for the third
								slide.</p>
						</div>
					</div>
				</div>
				<a class="carousel-control-prev" href="#img_slider" role="button"
					data-slide="prev"> <span class="carousel-control-prev-icon"
					aria-hidden="true"></span> <span class="sr-only">Previous</span>
				</a> <a class="carousel-control-next" href="#img_slider" role="button"
					data-slide="next"> <span class="carousel-control-next-icon"
					aria-hidden="true"></span> <span class="sr-only">Next</span>
				</a>
			</div>
			<!-- 부트스트랩 끝 -->
			<div id="contens2">
				<div class="notice_contents">
					<ol>
						<li></li>
					</ol>
				</div>
				<div class="bbs_contents">
					<ol>
						<li></li>
					</ol>
				</div>
			</div>
			<div id="footer"></div>
		</div>
	</div>
	<script src="JS/jquery-3.5.1.min.js"></script>
	<script src="JS/bootstrap.bundle.min.js"></script>
</body>
</html>
