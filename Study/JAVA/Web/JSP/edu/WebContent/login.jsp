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
			Cookie[] cookies = request.getCookies();
			System.out.println("cookies : " + cookies);
			
			if(cookies != null){
				for(Cookie c : cookies){
					if(c.getName().equals("L_ID")){
					response.sendRedirect("logincon.jsp");
					}
				}
			}
		%>
	<form action="logincon" method="post">
		아이디<input type="text" name="L_ID">	<BR>
		비밀번호<input type="password" name="L_PW"> <BR>
				<input type="submit" value="전송">
				
	</form>
</body>
</html>