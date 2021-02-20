<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		
		<%
			if(session.getAttribute("memberID") != null)
				response.sendRedirect("loginOK.jsp");
		%>
	
	
	
		<form action="loginCon" method="post">
			<div>
			<label> 아이디   <input type="text" name="mID"></label> <br><br>
			<label> 비밀번호 <input type="password" name="mPW"></label>
			<input type="submit" value="전송">
			</div>		
		</form>

		
	
</body>
</html>