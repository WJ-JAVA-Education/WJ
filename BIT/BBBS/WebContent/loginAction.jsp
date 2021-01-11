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
	// DB 연결과 동시에 login(아이디,비밀번호) 메소드 결과값을 정수로 받아서 상황에 따라 분기
	int result = dao.login(user.getUserID(), user.getUserPassword());
	if (result == 1) { // 정상
		out.println("<script>");
		out.println("location.href = 'main.jsp'");
		out.println("</script>");
	} else if (result == 0) {
		out.println("<script>");
		out.println("alert('비밀번호가 틀립니다.'");
		out.println("history.back()"); //뒤로가기 창
		out.println("</script>");
	} else if (result == -1) {
		out.println("<script>");
		out.println("alert('존재하지 않는 아이디 입니다.'");
		out.println("history.back()");
		out.println("</script>");
	} else if (result == -2) {
		out.println("<script>");
		out.println("alert('데이터베이스 오류발생.'");
		out.println("history.back()");
		out.println("</script>");
	}
	%>

</body>
</html>