<%@page contentType="text/html; charset=EUC-KR" %>
<%
		request.setCharacterEncoding("EUC-KR");
%>
<html>
<head><title></title>
<script type="text/javascript">
    function createFrm() {
    	f = document.frm;
        var strValue = f.sel.value;
        var strInput = "";
        if (strValue != "") {
            for (var i = 0; i < strValue; i++) 
            	strInput += "<input type=\"text\"  name=\"insinput\" /><br />";
            document.getElementById("insDiv").innerHTML = strInput;
        } 
    }
    </script>
</head>
<body>
<form name="frm">
	<select name="sel" onchange="createFrm()">
		<option value="0">선택</option>
		<option value="1">1</option>
		<option value="2">2</option>
		<option value="3">3</option>
		<option value="4">4</option>
	</select>
</form>
<div id="insDiv"></div>
</body>
</html>

