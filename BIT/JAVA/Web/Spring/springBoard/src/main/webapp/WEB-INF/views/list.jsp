<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%request.setCharacterEncoding("UTF-8"); %>
	<h2>srping Board</h2>

	<table border="1" width="500">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>제목</td>
			<td>날짜</td>
			<td>조회수</td>
		</tr>

		<c:forEach var="dto" items="${list}">
			<tr>
				<td>${dto.id}</td>
				<td>${dto.name}</td>
				<td><a href="contentView?id=${dto.id}">${dto.title}</a></td>
				<td>${dto.regdate}</td>
				<td>${dto.hit}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
