<!-- expression1.jsp -->
<%@page contentType="text/html; charset=EUC-KR"%>
<%
		String subject[] = {"Java", "JSP", "Android", "Spring"};
%>
<table border="1">
	<tr>
		<th>��ȣ</th>
		<th>����</th>
	</tr>
	<%
			for(int i =0;i<subject.length;i++){
	%>
	<tr>
		<td><%=i+1%></td>
		<td><%=subject[i]%></td>
	</tr>
	<%			
			}//for
	%>
</table>
<hr>
<table border="1">
	<tr>
		<th>��ȣ</th>
		<th>����</th>
	</tr>
	<%
		for(int i =0;i<subject.length;i++){
			out.println("<tr>");
			out.println("<td>"+(i+0)+"</td>");
			out.println("<td>"+subject[i]+"</td>");
			out.println("</tr>");
		}
	%>
</table>









	





