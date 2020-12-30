<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="com.oreilly.servlet.*"%>
<%@ page import="com.oreilly.servlet.multipart.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>

<%
// cos.jar 파일을 WEB-INFO ==> lib 에 추가
//MultipartRequest 에서 초기화는 (request , 저장경로 , 파일사이즈 , 인코딩 , 파일저장방법)
MultipartRequest multi = new MultipartRequest(request, "D:\\upload", 5 * 1024 * 1024, "utf-8", new DefaultFileRenamePolicy());

String name = multi.getParameter("name");
String subject = multi.getParameter("subject");

out.println("name = " + name + "<br>");
out.println("subject = " + subject + "<br>");


out.println("-----------------------------------<br>");

String filename = multi.getFilesystemName("filename");
out.println("filename = " + filename + "<br>");

%>
