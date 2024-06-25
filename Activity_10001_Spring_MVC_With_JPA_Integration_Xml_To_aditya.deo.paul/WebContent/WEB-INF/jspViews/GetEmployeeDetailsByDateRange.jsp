<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details within Date Range</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
}

.cst_table {
	border: 2px solid black;
}
</style>
</head>
<body>
	<center>
		<h2>Employee Details within Date Range</h2>

		<form:form method="get" action="GetDataWithinDateRange.html"
			modelAttribute="dateRangeForm">
			<table>
				<tr>
					<td>From Date:</td>
					<td><form:input path="fromDate" type="date" /> <form:errors
							path="fromDate" cssClass="error" /></td>
				</tr>
				<tr>
					<td>To Date:</td>
					<td><form:input path="toDate" type="date" /> <form:errors
							path="toDate" cssClass="error" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Get Employee Data" /></td>
				</tr>
			</table>
		</form:form>


		<c:if test="${not empty employees}">
			<table class="cst_table">
				<tr>
					<th>Employee ID</th>
					<th>Name</th>
					<th>Email</th>
					<th>Date of Joining</th>
					<th>Salary</th>
				</tr>
				<c:forEach items="${employees}" var="employee">
					<tr>
						<td>${employee.id}</td>
						<td>${employee.name}</td>
						<td>${employee.email}</td>
						<td>${employee.dateOfJoining}</td>
						<td>${employee.salary}</td>
					</tr>
				</c:forEach>
			</table>
		</c:if>

		<c:if
			test="${empty employees and not empty fromDate and not empty toDate}">
			<p class="error">No employees found within the specified date
				range.</p>
		</c:if>

	</center>
</body>
</html>
