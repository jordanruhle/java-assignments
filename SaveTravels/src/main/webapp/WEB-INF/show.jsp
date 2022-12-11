<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert expense here</title>
</head>
<body>
	<div class="container" style="width: 20%; margin: auto;">
		<div style="display: flex; justify-content: space-between;">
			<h1>Expense Details</h1>
			<a href="/expenses">Go back</a>
		</div>
		<table>
		    <tbody>
		    	<tr>
		    		<td>Expense Name:</td>
		    		<td><c:out value="${expense.expense}"></c:out></td>
		    	</tr>
		    	<tr>
		    		<td>Expense Description:</td>
		    		<td><c:out value="${expense.description}"></c:out></td>
		    	</tr>
		    	<tr>
		    		<td>Vendor:</td>
		    		<td><c:out value="${expense.vendor}"></c:out></td>
		    	</tr>
		    	<tr>
		    		<td>Amount Spent:</td>
		    		<td><c:out value="${expense.amount}"></c:out></td>
		    	</tr>
		    </tbody>
		</table>
	</div>
</body>
</html>
