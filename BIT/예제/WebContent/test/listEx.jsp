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
<h2>강사 리스트</h2>
<table border="1">
	<tr align="center">
		<td width="50"><a href="listEx.jsp?no=32">경기도</a></td>
		<td width="50"><a href="listEx.jsp?no=20">서울</a></td>
		<td width="50"><a href="listEx.jsp?no=6">부산</a></td>
		<td width="50"><a href="listEx.jsp?no=1">광주</a></td>
		<td width="50"><a href="listEx.jsp?no=15">대전</a></td>
	</tr>
</table>
<h2>강사 세부 리스트</h2>
<% 
		int div = (int)Math.ceil((double)no/10);
		int n = 1;
		for(int i=0;i<div;i++){
%>
<table border="1">
	<tr>
		<td width="50"><%=n<=no?n++:"준비중"%></td>
		<td width="50"><%=n<=no?n++:"준비중"%></td>
		<td width="50"><%=n<=no?n++:"준비중"%></td>
		<td width="50"><%=n<=no?n++:"준비중"%></td>
		<td width="50"><%=n<=no?n++:"준비중"%></td>
	</tr>
	<tr>
		<td width="50"><%=n<=no?n++:"준비중"%></td>
		<td width="50"><%=n<=no?n++:"준비중"%></td>
		<td width="50"><%=n<=no?n++:"준비중"%></td>
		<td width="50"><%=n<=no?n++:"준비중"%></td>
		<td width="50"><%=n<=no?n++:"준비중"%></td>
	</tr>
</table><hr width="400">	
<%}//---for%>
</div>









