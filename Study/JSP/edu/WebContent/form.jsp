<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form action="formAction.jsp" method="get">
		name : <input type="text" name="p_name"><br>
		password: <input type="password" name="p_pass"><br> 
		hobby:	 	1<input type="checkbox" name="p_hobby" value="1">
					2<input type="checkbox" name="p_hobby" value="2">
					3<input type="checkbox" name="p_hobby" value="3">
			<input type="submit" value="전송"> 
	</form>
	
	
</body>
</html>