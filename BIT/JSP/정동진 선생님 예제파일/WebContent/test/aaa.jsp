<%@page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
%>
<form method="post" action="bbb.jsp" id="form2">
	<input type="hidden" name="aaa">
</form>
<script>
	alert("확인1");
	this.document.getElementById("form2").submit();
</script>
