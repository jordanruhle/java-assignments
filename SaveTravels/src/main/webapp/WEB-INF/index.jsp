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
		<h1>Save Travels</h1>
		<table>
		    <thead>
		        <tr>
		            <th>Expenses</th>
		            <th>Vendor</th>
		            <th>Amount</th>
		            <th>Actions</th>
		        </tr>
		    </thead>
		    <tbody>
		         <c:forEach var="expense" items="${expenses}">
					<tr>
						<td><a href="/expenses/${expense.id}"><c:out value="${expense.expense}"></c:out></a></td>
						<td><c:out value="${expense.vendor}"></c:out></td>
						<td><c:out value="${expense.amount}"></c:out></td>
						<td>
							<a href="/expenses/${expense.id}/edit">Edit</a>
							<form action="/expenses/${expense.id}/delete" method="POST">
								<input type="hidden" name="_method" value="delete">
								<button>Delete</button>
							</form>
						</td>
					</tr>
				</c:forEach>
		    </tbody>
		</table>
		<h2>Add an expense:</h2>
		<form:form action="/expenses/new" method="POST" modelAttribute="expenseObj">
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
