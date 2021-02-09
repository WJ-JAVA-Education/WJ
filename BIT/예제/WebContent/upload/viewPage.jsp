<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
		//���ε� ���� ���� ��ġ
		final String saveFolder = "C:/Jsp/myapp/WebContent/upload/storage/";
		//���ε� ���� ���ڵ�
		final String encoding = "EUC-KR";
		//���ε� ���� ũ��
		final int maxSize =  1024*1024*10;//10MB
		try{
			//new DefaultFileRenamePolicy() : �ߺ����� �ذ� ���� �Ű�����
			//request�� ��ü�� ���̻� �ƹ��� ��û ������ ����.
			String user1 = request.getParameter("user");
			MultipartRequest multi = 
					new MultipartRequest(request, saveFolder, maxSize,
							encoding, new DefaultFileRenamePolicy());
			//��û�� form�� file type�� name��
			String fileName = multi.getFilesystemName("upload");
			//�ߺ��� ���ϸ��� ����Ǳ� ���� ���ε� ���ϸ�
			String original = multi.getOriginalFileName("upload");
			String type = multi.getContentType("upload");
			long len = 0;
			//������ ������ ��� ���ؼ��� File ��ü ����
			File f = multi.getFile("upload");
			if(f!=null){
				len = f.length();
			}
			String user = multi.getParameter("user");
			String title = multi.getParameter("title");
%>
����� ���� : <%=fileName %><br> 
���� ���� : <%=original %><br> 
���� Ÿ�� : <%=type %><br> 
���� ũ�� : <%=len %><br> 
user : <%=user %><br> 
user1 : <%=user1 %><br> 
title : <%=title %><br> 
<%			
		}catch(Exception e){
			e.printStackTrace();
		}
%>












