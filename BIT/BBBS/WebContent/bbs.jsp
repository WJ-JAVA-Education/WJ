<%@page import="java.sql.ResultSet"%>
<%@page import="bbs.Bbs"%>
<%@page import="bbs.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<% ResultSet rs; 
BbsDAO bdao = new BbsDAO(); 
int result = BbsDAO(rs.getString("bbsID"));
%>

	<div class="container mt-3">
	  <div class="row">
		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th></th>
		      <th>제목</th>
		      <th>작성자</th>
		      <th>작성일</th>
		    </tr>
		  </thead>
		  <tbody>
		    <tr>
		      <td>1</td>
		      <td>안녕하세요.</td>
		      <td>홍길동</td>
		      <td>2021-1-10</td>
		    </tr>		
		  </tbody>
		</table>
	  </div>
   	  <div class="row justify-content-end">
         <a href="write.jsp" class="btn btn-primary">글쓰기</a>
      </div>
	</div>
	
	<script src="js/jquery-3.5.1.min.js" ></script>
	<script src="js/bootstrap.bundle.min.js"></script>
</body>
</html>