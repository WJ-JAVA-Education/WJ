<%
	//인증(로그인)시 저장된 admin유저와 비번을 삭제한다.
	//세션은 30분정도 저장된다.
	session.invalidate(); 
	response.sendRedirect("addProduct.jsp");
%>