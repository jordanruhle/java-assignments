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
	<h1 style="color:pink;  padding-left:30%;">Fruit Store</h1>
	<div class="container" style="background-color:pink; padding:20px; width:40%; margin:auto;">
		<div style="display:flex; justify-content:space-between; background-color:white; margin-bottom:5px;">
			<p style="margin:5px; font-weight:bold">Fruit</p>
			<p style="margin:5px; font-weight:bold">Price</p>
		</div>
		<c:forEach var="fruit" items="${fruits}">
			<div style="display:flex; justify-content:space-between; background-color:white; margin-bottom:5px;">
				<p style="margin:5px"><c:out value="${fruit.name}"></c:out></p>
				<p style="margin:5px"><c:out value="${fruit.price}"></c:out></p>
			</div>
		</c:forEach>
		
	</div>
</body>
</html>