<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>

	<div class="container mt-3">
	 <div class="card">
	  <div class="card-header">
	        글쓰기 양식
	  </div>
	  <div class="card-body">
	  	<form action="writeAction.jsp" method="post">
			<input type="text" class="form-control mb-3" name="bbsTitle" placeholder="글제목" maxlength="50" required>
			<textarea type="text" class="form-control mb-3" name="bbsContent" placeholder="글내용" maxlength="2048" style="height: 350px" required ></textarea>
			<div class="row">
	         <input type="submit" value="글쓰기" class="btn btn-primary ml-auto mr-3">
	     	</div>	
	     </form>  	    
	  </div>
	 </div>	     		
	</div>
	
	<script src="js/jquery-3.5.1.min.js" ></script>
	<script src="js/bootstrap.bundle.min.js"></script>
</body>
</html>