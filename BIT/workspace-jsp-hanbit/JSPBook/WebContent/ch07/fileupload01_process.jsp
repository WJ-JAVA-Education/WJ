<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="com.oreilly.servlet.*"%>
<%@ page import="com.oreilly.servlet.multipart.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>

<%
    // cos.jar 파일을 WEB-INFO ==> lib 에 추가
//MultipartRequest 에서 초기화는 (request , 저장경로 , 파일사이즈 , 인코딩 , 파일저장방법)
MultipartRequest multi = new MultipartRequest(request, "D:\\upload", 5 * 1024 * 1024, "utf-8",	new DefaultFileRenamePolicy());

Enumeration params = multi.getParameterNames(); // 이름들을 받아옴 

while (params.hasMoreElements()) {
    String name = (String) params.nextElement();
    String value = multi.getParameter(name);
    out.println(name + " = " + value + "<br>");
}
out.println("-----------------------------------<br>");

Enumeration files = multi.getFileNames(); // 파일이름은 여기서 담김.

while (files.hasMoreElements()) {
    String name = (String) files.nextElement();
    String filename = multi.getFilesystemName(name);
    String original = multi.getOriginalFileName(name);
    String type = multi.getContentType(name);
    File file = multi.getFile(name);

    out.println("요청 파라미터 이름 : " + name + "<br>");
    out.println("실제 파일 이름 : " + original + "<br>");
    out.println("저장 파일 이름 : " + filename + "<br>");
    out.println("파일 콘텐츠 타입 : " + type + "<br>");

    if (file != null) {
	out.println(" 파일 크기 : " + file.length());
	out.println("<br>");
    }
}
%>