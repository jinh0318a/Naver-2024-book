<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath }" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content='width=device-width, initial-scale=1.0' />
<title>네이버 도서</title>
</head>
<body>
	<form action="${rootPath}/book/search">
		<input type="text" name="word" placeholder="검색어 입력" />
		<button type="submit">검색</button>
	</form>
</body>
</html>