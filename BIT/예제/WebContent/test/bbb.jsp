<%@ page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
%>
<html>
<head>
<script type="text/javascript">
	function click1(){
		btn1 = document.getElementById("btn").value="��ư";
	}
</script>
</head>
<body>
<input type="button" id="btn" onClick="click1()" value="aa">
</body>
</html>