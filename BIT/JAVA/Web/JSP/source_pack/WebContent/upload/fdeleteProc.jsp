<%@page contentType="text/html; charset=EUC-KR"%>
<jsp:useBean id="mgr" class="upload.FileloadMgr"/>
<%
		request.setCharacterEncoding("EUC-KR");
		String snum[] = request.getParameterValues("fch");
		//문자열 -> 정수 : 0,3,4 -> 0번째 값은 필요가 없다.
		int num[] = new int[snum.length-1]; //3, 4
		for(int i=0;i<num.length;i++){
			num[i] = Integer.parseInt(snum[i+1]);
		}
		mgr.deleteFile(num);
		response.sendRedirect("flist.jsp");
%>
