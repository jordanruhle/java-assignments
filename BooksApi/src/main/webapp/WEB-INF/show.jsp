<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1><c:out value="${book.title}"></c:out></h1>
		<h2><c:out value="${book.description}"></c:out></h2>
		<h2><c:out value="${book.language}"></c:out></h2>
		<h2><c:out value="${book.numberOfPages}"></c:out></h2>
	</div>
</body>
</html>