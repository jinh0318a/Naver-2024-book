<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath }" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content='width=device-width, initial-scale=1.0' />
<title>도서목록</title>
</head>
<body>
	<ul class="bookList">
		<c:forEach items="${BOOKLIST}" var="book">
			<li data-isbn="${book.isbn }"><span>${book.title }</span></li>
		</c:forEach>
	</ul>
	<div>
		<button>도서정보추가</button>
	</div>
</body>
</html>