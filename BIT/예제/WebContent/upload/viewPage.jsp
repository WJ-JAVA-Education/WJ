<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
		//업로드 파일 저장 위치
		final String saveFolder = "C:/Jsp/myapp/WebContent/upload/storage/";
		//업로드 파일 인코딩
		final String encoding = "EUC-KR";
		//업로드 파일 크기
		final int maxSize =  1024*1024*10;//10MB
		try{
			//new DefaultFileRenamePolicy() : 중복파일 해결 위한 매개변수
			//request는 객체는 더이상 아무런 요청 정보가 없다.
			String user1 = request.getParameter("user");
			MultipartRequest multi = 
					new MultipartRequest(request, saveFolder, maxSize,
							encoding, new DefaultFileRenamePolicy());
			//요청한 form에 file type의 name값
			String fileName = multi.getFilesystemName("upload");
			//중복된 파일명이 변경되기 전에 업로드 파일명
			String original = multi.getOriginalFileName("upload");
			String type = multi.getContentType("upload");
			long len = 0;
			//파일의 정보를 얻기 위해서는 File 객체 생성
			File f = multi.getFile("upload");
			if(f!=null){
				len = f.length();
			}
			String user = multi.getParameter("user");
			String title = multi.getParameter("title");
%>
저장된 파일 : <%=fileName %><br> 
실제 파일 : <%=original %><br> 
실제 타입 : <%=type %><br> 
파일 크기 : <%=len %><br> 
user : <%=user %><br> 
user1 : <%=user1 %><br> 
title : <%=title %><br> 
<%			
		}catch(Exception e){
			e.printStackTrace();
		}
%>












