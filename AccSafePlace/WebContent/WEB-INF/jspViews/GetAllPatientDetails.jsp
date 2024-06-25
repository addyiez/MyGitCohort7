<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
}
</style>
</head>
<body>
	<center>
		<h2>Patient Details</h2>
		<form:form>

			<br>
			<c:if test="${not empty empList}">
				<table border="2">

					<tr>
						<th>PatientID</th>
						<th>Patient Password</th>
						<th>Phone</th>
						<th>Email</th>
					</tr>
					<c:forEach var="var" items="${patList}">
						<tr>
							<td>${var.userid}</td>
							<td>${var.password}</td>
							<td>${var.phone}</td>
							<td>${var.email}</td>
						</tr>
					</c:forEach>

				</table>

			</c:if>
			<c:if test="${empty empList}">

				<h2>No Patient Available</h2>

			</c:if>
		</form:form>
	</center>
</body>
</html>