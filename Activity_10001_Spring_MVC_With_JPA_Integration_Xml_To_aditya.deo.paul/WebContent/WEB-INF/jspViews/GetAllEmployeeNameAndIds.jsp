<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Employee Names and IDs</title>
</head>
<body>
	<h2>All Employee Names and IDs</h2>

	<c:if test="${not empty employeeNamesAndIds}">
		<ul>
			<c:forEach var="entry" items="${employeeNamesAndIds}">
				<li>${entry.value}</li>
			</c:forEach>
		</ul>
	</c:if>

	<c:if test="${empty employeeNamesAndIds}">
		<p>No employees found.</p>
	</c:if>
</body>
</html>
