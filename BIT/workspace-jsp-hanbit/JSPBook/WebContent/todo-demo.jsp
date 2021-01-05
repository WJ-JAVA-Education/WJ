<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todo 리스트</title>
</head>
<body>
<script type="text/javascript">
function todoCheck(){
    var input = document.querySelector ('input[type=text]');
    
    if(input.value == "" || input.value.trim()=="")
        return false;
    }
}
</script>

	<!-- 할 일을 입력하는 폼 -->
	<form action="todo-demo.jsp">
		새로운 할일 : <input type="text" name="theItem" >
		
		<input type ="submit" value="전송">
	</form>
	<!-- 입력받은 아이템을 테스트 출력 -->
		<%	// jsp 페이지로 같이 넘어온 변수 (파라메터) 를 가져올때
// 			request.getParameter("theItem"); // 여러줄
// 			out.println(request.getParameter("theItem"));
// 	<!-- todo 리스트를 만들어 세션에 저장 -->
	
		String todo = request.getParameter("theItem");	
		List<String> items = new ArrayList<>();
		items.add(todo);
		session.setAttribute("myTodoList", items);
		
// 		<!-- todo 저장된 리스트를 가져오기 -->

	// 저장된 리스트를 가져오기
		List<String> items = (List<String>) session.getAttribute("myTodoList");
		// form 에 입력된 내용을 리스트에 추가한다.
	
	if(items == null){ // 만약에 저장된 mytodoList 가 없다면 새로 만든다.
	    items = new ArrayList<String>();
	    session.setAttribute("myToDoList", items);}
	
		%>
		<%=	request.getParameter("theItem")%> // 한줄짜리
	
	<hr>
	<h3>새 리스트 출력하기</h3>
	<ol>
	<%
		// 입력된 todo 리스트 출력
		for(String temp : items){
		    out.println("<li>"+temp+"<li>");
		}
	%>
	</ol>
</body>
</html>