<!-- empty.jsp -->
<%@page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
		String id = request.getParameter("id");
		if(id==null){
			
		}else{
			
		}
%>
id의 요청여부 : ${empty param.id}<br>
<a href="empty.jsp?id=aaa">id값 요청</a>||
<a href="empty.jsp">id값 요청이 없음</a>








