<%@page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
%>
<form method="post" action="bbb.jsp" id="form2">
	<input type="hidden" name="aaa">
</form>
<script>
	alert("»Æ¿Œ1");
	this.document.getElementById("form2").submit();
</script>
