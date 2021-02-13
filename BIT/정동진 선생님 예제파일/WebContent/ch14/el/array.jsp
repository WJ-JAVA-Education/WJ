<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	ArrayList<String> arr = new ArrayList<String>();
	for (int i=0; i<10;i++){
		arr.add(i+"");
	}
	request.setAttribute("arr", arr);
	//System.out.println(arr);
%>
<script>
var scriptArray = ${arr};
document.write(${arr});
console.log(scriptArray);
</script>
