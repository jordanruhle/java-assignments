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
			<h1>Add an expense:</h1>
			<a href="/expenses">Go back</a>
		</div>
		<form:form action="/expenses/${expenseObj.id}/edit" method="POST" modelAttribute="expenseObj">
			<input type="hidden" name="_method" value="put">
		    <p>
		        <form:label path="expense">Expense</form:label>
		        <form:errors path="expense"/>
		        <form:input path="expense"/>
		    </p>
		    <p>
		        <form:label path="vendor">Vendor</form:label>
		        <form:errors path="vendor"/>
		        <form:input path="vendor"/>
		    </p>
		    <p>
		        <form:label path="amount">Amount</form:label>
		        <form:errors path="amount"/>
		        <form:input  type="number" step="0.01" path="amount"/>
		    </p>
		    <p>
		        <form:label path="description">Description</form:label>
		        <form:errors path="description"/>     
		        <form:textarea path="description"/>
		    </p>
		    
		    <input type="submit" value="Submit"/>
		</form:form>
	</div>
</body>
</html>
