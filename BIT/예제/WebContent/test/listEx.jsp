<%@page import="board.UtilMgr"%>
<%@page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
		int no = 32;
		if(request.getParameter("no")!=null){
			no = UtilMgr.parseInt(request, "no");
		}
%>
<div align="center">
<h2>���� ����Ʈ</h2>
<table border="1">
	<tr align="center">
		<td width="50"><a href="listEx.jsp?no=32">��⵵</a></td>
		<td width="50"><a href="listEx.jsp?no=20">����</a></td>
		<td width="50"><a href="listEx.jsp?no=6">�λ�</a></td>
		<td width="50"><a href="listEx.jsp?no=1">����</a></td>
		<td width="50"><a href="listEx.jsp?no=15">����</a></td>
	</tr>
</table>
<h2>���� ���� ����Ʈ</h2>
<% 
		int div = (int)Math.ceil((double)no/10);
		int n = 1;
		for(int i=0;i<div;i++){
%>
<table border="1">
	<tr>
		<td width="50"><%=n<=no?n++:"�غ���"%></td>
		<td width="50"><%=n<=no?n++:"�غ���"%></td>
		<td width="50"><%=n<=no?n++:"�غ���"%></td>
		<td width="50"><%=n<=no?n++:"�غ���"%></td>
		<td width="50"><%=n<=no?n++:"�غ���"%></td>
	</tr>
	<tr>
		<td width="50"><%=n<=no?n++:"�غ���"%></td>
		<td width="50"><%=n<=no?n++:"�غ���"%></td>
		<td width="50"><%=n<=no?n++:"�غ���"%></td>
		<td width="50"><%=n<=no?n++:"�غ���"%></td>
		<td width="50"><%=n<=no?n++:"�غ���"%></td>
	</tr>
</table><hr width="400">	
<%}//---for%>
</div>









