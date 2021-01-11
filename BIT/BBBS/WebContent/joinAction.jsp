<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="user.UserDAO"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="user" class="user.User" scope="page" />
<!--  form 으로부터 전달된 파라메터들을 User 객체의 메소드 set 메소드를 사용 -->
<jsp:setProperty name="user" property="userID" />
<jsp:setProperty name="user" property="userPassword" />
<jsp:setProperty name="user" property="userName" />
<jsp:setProperty name="user" property="userGender" />
<jsp:setProperty name="user" property="userEmail" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 게시판 웹사이트</title>
</head>
<body>
	<%
	// DB 연결 메소드를 사용하기 위해 dao 객체를 생성
	UserDAO dao = new UserDAO();
	// 자바빈 객체  user 입력
	int result = dao.join(user);
	if (result == 1) { // 정상 (회원가입)
		out.println("<script>");
		out.println("location.href = 'main.jsp'");
		out.println("</script>");
	} else { // 오류 (id 중복일때)
		out.println("<script>");
		out.println("alert('이미존재하는아이디 입니다.'");
		out.println("history.back()");
		out.println("</script>");
	}
	%>

</body>
</html>