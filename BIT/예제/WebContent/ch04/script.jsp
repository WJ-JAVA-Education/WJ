<!-- script.jsp -->
<%@ page contentType="text/html; charset=EUC-KR"%>
<!-- ����(Declaration) -->
<%!
		String declaration = "Declaration";
		
		public String decMethod(){
			return declaration;
		}
%>
<!-- ��ũ��Ʈ��(Scriptlet) -->
<%
		String scriptlet = "Scriptlet";
		String comment = "Comment";
		
		out.println("���尴ü�� �̿��� ��� : " + declaration +"<p>");
		
		/* public void prn(){
			
		} */
%>
<!-- ǥ����(Expression) -->
������ ���1 : <%=declaration %><p>
������ ���2 : <%=decMethod() %><p>
��ũ��Ʈ���� ���1 : <%=scriptlet %><p>
<%--JSP �ּ� <%=comment%> --%>
<%
		//���� �ּ�
		/*������ �ּ�(�κ��ּ�) 
		*/
		String s/*�κ��ּ�*/ = "����";
%>








