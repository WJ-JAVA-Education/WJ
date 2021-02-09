<!-- script.jsp -->
<%@ page contentType="text/html; charset=EUC-KR"%>
<!-- 선언문(Declaration) -->
<%!
		String declaration = "Declaration";
		
		public String decMethod(){
			return declaration;
		}
%>
<!-- 스크립트릿(Scriptlet) -->
<%
		String scriptlet = "Scriptlet";
		String comment = "Comment";
		
		out.println("내장객체를 이용한 출력 : " + declaration +"<p>");
		
		/* public void prn(){
			
		} */
%>
<!-- 표현식(Expression) -->
선언문의 출력1 : <%=declaration %><p>
선언문의 출력2 : <%=decMethod() %><p>
스크립트릿의 출력1 : <%=scriptlet %><p>
<%--JSP 주석 <%=comment%> --%>
<%
		//한줄 주석
		/*여러줄 주석(부분주석) 
		*/
		String s/*부분주석*/ = "하하";
%>








