<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Employee Page</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
}
</style>
</head>
<body>
	<center>
		<h2>Delete Employee</h2>

		<form:form method="post" action="DeleteEmployeeByName.html"
			modelAttribute="employeeBean">
			<table>
				<tr>
					<td>Employee Name:</td>
					<td><form:input path="name" /> 
					<form:errors path="name" cssClass="error" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Delete Employee" /></td>
				</tr>
			</table>
		</form:form>

		<c:if test="${not empty message}">
			<p class="error">${message}</p>
		</c:if>

	</center>
</body>
</html>
