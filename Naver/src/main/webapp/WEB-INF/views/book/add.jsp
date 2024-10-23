<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath }" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content='width=device-width, initial-scale=1.0' />
<title>도서정보 추가</title>
</head>
<body>
	<f:form>
		<input type="number" placeholder="도서번호" name="isbn" />
		<input type="text" placeholder="책 제목" name="title" />
		<input type="text" placeholder="저자" name="author" />
		<input type="text" placeholder="출판사" name="publisher" />
		<input type="text" placeholder="가격" name="price" />
		<input type="text" placeholder="판매가" name="discount" />
		<input type="text" placeholder="책 설명" name="description" />
		<input type="text" placeholder="출판일" name="pubdate" />
		<input type="text" placeholder="URL" name="link" />
		<input type="text" placeholder="이미지 URL" name="image" />
		<button type="submit">저장</button>
		<button type="reset">새로작성</button>
		<button type="button">리스트보기</button>
	</f:form>
</body>
</html>