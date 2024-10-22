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
<title>회원가입</title>
<script src="${rootPath }/static/js/join.js"></script>
</head>
<body>
	<h1>회원가입</h1>
	<c:if test="${ERROR == 'SQL'}">
		<div>
			SQL 오류가 발생했습니다. <br /> 고객센터에 문의해주세요
		</div>
	</c:if>
	<f:form class="join">
		<div>
			<input name="username" id="username" placeholder="USERNAME" />
		</div>
		<div>
			<input type="password" name="password" id="password"
				placeholder="PASSWORD" />
		</div>
		<div>
			<input type="password" name="re_password" id="re_password"
				placeholder="PASSWORD 확인" />
		</div>
		<div>
			<input name="email" placeholder="E-mail" />
		</div>
		<div>
			<input type="button" id="join" value="회원가입" />
		</div>
	</f:form>
</body>
</html>