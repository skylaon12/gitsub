<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="cp" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="${cp}/guest/write" method="post">	<!-- todo: http://localhost:8080/guest/write 부분 해결 -->
		<textarea rows="3" name='btext'></textarea>
		<input type="submit" value="글쓰기">
	</form>

</body>
</html>