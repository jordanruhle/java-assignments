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
		<c:choose>  
			<c:when test="${number%2==0}">  
				<c:out value="You will take a grand journey"></c:out>  
			</c:when>  
			<c:otherwise>  
				<c:out value="You have enjoyed the fruits of your labor, but now is a great time to spend time with friends and family"></c:out>  
			</c:otherwise>  
		</c:choose>  
	</div>
</body>
</html>