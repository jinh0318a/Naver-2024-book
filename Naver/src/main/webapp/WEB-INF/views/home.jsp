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
<nav>
<ul>
<li>홈</li>
<li>도서정보</li>
<li>도서검색</li>
<li>로그인</li>
<li>회원가입</li>
</ul>
</nav>
	<ul class="bookList">
		<c:forEach items="${BOOKLIST}" var="book">
			<li data-isbn="${book.isbn }"><span>${book.title }</span></li>
		</c:forEach>
	</ul>
</body>
</html>